package com.demo.controller;

import com.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * @title: IndexController
 * @Author Mr.Goodwin
 * @Date: 2021/7/12 9:10
 * @Description: 主页的控制类
 */
@Controller
public class IndexController {

    /***
     * 接收账号密码，登陆主页
     * */
    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model) {
//        非空判断
        if (StringUtils.isEmpty(user.getUserName()) && "123".equals(user.getPassword())) {
            //将user的用户信息，储存在loginUser里，方便前端调用
            session.setAttribute("loginUser",user);
            //因为刷新页面会重复提交login，所以重定向
            return "redirect:/index.html";
        }
        else {
            model.addAttribute("msg","账号或者密码错误");
            return "login";
        }

    }

    /***
     * 重定向后，登陆index
     * */
    @GetMapping("/index.html")
    public String indexPage(HttpSession session,Model model) {
        Object loginUser    =session.getAttribute("loginUser");
        if(loginUser != null){
            return "index";
        }
       else {
           model.addAttribute("msg","请重新登陆");
           return "login";
        }
    }
}
