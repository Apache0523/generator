package com.test.generator.service;

import com.test.generator.dao.AccountMapper;
import com.test.generator.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;
    public Account selectByPrimaryKey(Integer id){
        return accountMapper.selectByPrimaryKey(id);
    }
}
