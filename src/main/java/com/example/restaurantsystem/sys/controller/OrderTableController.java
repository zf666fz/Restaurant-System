package com.example.restaurantsystem.sys.controller;

import com.example.restaurantsystem.common.vo.Result;
import com.example.restaurantsystem.sys.service.IOrderTableService;
import com.example.restaurantsystem.sys.service.impl.OrderTableServiceImpl;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author RS
 * @since 2023-12-11
 */
@RestController
@RequestMapping("/order")
public class OrderTableController {

    @Autowired
    private IOrderTableService orderTableService;

    @PostMapping("/submit")
    public Result<Void> submitOrder(@RequestBody Map<String, Object> requestBody){
        String phoneNumber = (String) requestBody.get("phoneNumber");
        String address = (String) requestBody.get("address");
        List<Map<String, Object>> foods = (List<Map<String, Object>>) requestBody.get("foods");
        if (orderTableService.submitOrder(phoneNumber, address, foods))
        {
            return Result.successResult(null);
        }
        return Result.failResult(null);
    }
}
