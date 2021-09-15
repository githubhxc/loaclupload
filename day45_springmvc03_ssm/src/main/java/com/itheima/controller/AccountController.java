package com.itheima.controller;

import com.itheima.bean.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AccountController {

    //注入service
    @Autowired
    private AccountService as;

    /*
        查询所有
     */
    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("调用了AccountController的findAll方法~！");

        //调用service
        List<Account> list = as.findAll();

        System.out.println("list = " + list);

        return "success";
    }
}
