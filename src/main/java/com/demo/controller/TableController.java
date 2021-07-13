package com.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @title: TableController
 * @Author Mr.Goodwin
 * @Date: 2021/7/12 16:08
 * @Description:  跳转小页面
 */
@Component
public class TableController {

    @GetMapping("/basic_table")
    public String basic_table(){
        return"table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(){
        return"table/dynamic_table";
    }

    @GetMapping("/editable_table")
    public String editable_table(){
        return"table/editable_table";
    }

    @GetMapping("/pricing_table")

    public String pricing_table(){
        return"table/pricing_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return"table/responsive_table";
    }
}
