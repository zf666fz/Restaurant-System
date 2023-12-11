package com.example.restaurantsystem;

import com.example.restaurantsystem.sys.entity.MenuTable;
import com.example.restaurantsystem.sys.mapper.MenuTableMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class RestaurantSystemApplicationTests {

    @Resource
    private MenuTableMapper menuTableMapper;

    @Test
    void contextLoads() {
        List<MenuTable> menuTableList = menuTableMapper.selectList(null);
        menuTableList.forEach(System.out::println);
    }

}
