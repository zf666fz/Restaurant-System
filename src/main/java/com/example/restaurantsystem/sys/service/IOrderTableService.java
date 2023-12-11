package com.example.restaurantsystem.sys.service;

import com.example.restaurantsystem.sys.entity.OrderTable;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author RS
 * @since 2023-12-11
 */
public interface IOrderTableService extends IService<OrderTable> {

    boolean submitOrder(String phoneNumber, String address, List<Map<String, Object>> foods);
}
