package com.example.restaurantsystem.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author RS
 * @since 2023-12-11
 */
@TableName("order_table")
public class OrderTable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer orderId;

    private String customerPhone;

    private String address;

    private LocalDateTime orderTime;

    private LocalDateTime deliveryTime;

    private Integer status;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderTable{" +
            "orderId = " + orderId +
            ", customerPhone = " + customerPhone +
            ", address = " + address +
            ", orderTime = " + orderTime +
            ", deliveryTime = " + deliveryTime +
            ", status = " + status +
        "}";
    }
}
