package com.example.restaurantsystem.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.restaurantsystem.sys.entity.DetailTable;
import com.example.restaurantsystem.sys.entity.OrderTable;
import com.example.restaurantsystem.sys.mapper.DetailTableMapper;
import com.example.restaurantsystem.sys.mapper.OrderTableMapper;
import com.example.restaurantsystem.sys.service.IOrderTableService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author RS
 * @since 2023-12-11
 */
@Service
public class OrderTableServiceImpl extends ServiceImpl<OrderTableMapper, OrderTable> implements IOrderTableService {

    @Resource
    DetailTableMapper detailTableMapper;

    public boolean insertIntoDetail(List<Map<String, Object>> foods, Integer orderId){
        DetailTable detail = new DetailTable();
        detail.setOrderId(orderId);
        //遍历传入的foods列表
        for (Map<String,Object> foodMap:foods){
            Integer foodId = (Integer)foodMap.get("id");
            Integer foodNum = (Integer) foodMap.get("count");
            //字段不全，删除order_table表中插入的内容
            if (foodId == null || foodNum == null){
                this.baseMapper.deleteById(orderId);
                return false;
            }
            //插入到detail表中
            detail.setFoodId(foodId);
            detail.setFoodNum(foodNum);
            int detailRowsAffected = detailTableMapper.insert(detail);
            //插入失败，删除order_table表中插入的内容
            if (detailRowsAffected == 0){
                this.baseMapper.deleteById(orderId);
                return false;
            }
        }

        return true;
    }
    @Override
    public boolean submitOrder(String phoneNumber, String address, List<Map<String, Object>> foods) {
        //信息不全插入失败
        if (phoneNumber.isEmpty() || address.isEmpty() || foods.isEmpty()){
            return false;
        }
        //定义要插入的order对象
        OrderTable order = new OrderTable();
        order.setCustomerPhone(phoneNumber);
        order.setAddress(address);
        order.setOrderTime(LocalDateTime.now());
        order.setDeliveryTime(null);
        order.setStatus(0);
        //插入order对象
        int OrderRowsAffected = this.baseMapper.insert(order);
        //插入order对象失败
        if (OrderRowsAffected == 0){
            return false;
        }

        //插入成功，获取生成的自增order_id
        Integer orderId = order.getOrderId();
        //插入detail_table

        boolean insertResult = insertIntoDetail(foods, orderId);
        return insertResult;
    }
}
