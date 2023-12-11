package com.example.restaurantsystem.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author RS
 * @since 2023-12-11
 */
@TableName("detail_table")
public class DetailTable implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer orderId;

    private Integer foodId;

    private Integer foodNum;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public Integer getFoodNum() {
        return foodNum;
    }

    public void setFoodNum(Integer foodNum) {
        this.foodNum = foodNum;
    }

    @Override
    public String toString() {
        return "DetailTable{" +
            "orderId = " + orderId +
            ", foodId = " + foodId +
            ", foodNum = " + foodNum +
        "}";
    }
}
