package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @title: TestControoler
 * @Author Mr.Goodwin
 * @Date: 2021/7/12 8:55
 * @Description: 测试
 */
@Controller
public class TestControoler {
/**
 * return登陆页
 * */
    @GetMapping(value = {"/","/login"})

    public String Test(){
        return "login";
    }
}
