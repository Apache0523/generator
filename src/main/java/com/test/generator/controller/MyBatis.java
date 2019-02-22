package com.test.generator.controller;

import com.test.generator.dao.AccountMapper;
import com.test.generator.entity.Account;
import com.test.generator.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyBatis {
    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/ask")
    public Account getName(){
        return accountService.selectByPrimaryKey(1);
    }
}
