package com.example.restaurantsystem.sys.controller;

import com.example.restaurantsystem.common.vo.Result;
import com.example.restaurantsystem.sys.entity.MenuTable;
import com.example.restaurantsystem.sys.service.IMenuTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author RS
 * @since 2023-12-11
 */
@RestController
@RequestMapping("/menu")
public class MenuTableController {
    @Autowired
    private IMenuTableService iMenuTableService;

    @GetMapping("/all")
    public Result<List<MenuTable>> getAllMenu(){
        List<MenuTable> list = iMenuTableService.list();
        return Result.successResult(list);

    }

}
