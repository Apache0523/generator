package com.test.generator.dao;

import com.test.generator.entity.Account;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}