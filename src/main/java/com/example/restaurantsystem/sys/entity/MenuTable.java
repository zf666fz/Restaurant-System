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
@TableName("menu_table")
public class MenuTable implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer foodId;

    private String name;

    private String imageUrl;

    private Double price;

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuTable{" +
            "foodId = " + foodId +
            ", name = " + name +
            ", imageUrl = " + imageUrl +
            ", price = " + price +
        "}";
    }
}
