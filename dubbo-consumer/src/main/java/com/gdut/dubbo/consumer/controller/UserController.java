package com.gdut.dubbo.consumer.controller;

import com.gdut.dubbo.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getUserAddr")
    public List<String> getUserAddr() {
        return userService.getUserAddr("xiezh");
    }
}
