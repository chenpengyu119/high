package com.bjsxt.service.impl;

import com.bjsxt.mapper.AccountMapper;
import com.bjsxt.pojo.Account;
import com.bjsxt.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


public class AccountServiceImpl implements AccountService {

    private AccountMapper accountMapper;

    public AccountMapper getAccountMapper() {
        return accountMapper;
    }

    public void setAccountMapper(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @Override
    public Account checkNamePwd(int outid, String apwd) {
        return accountMapper.findByNamePwd(outid, apwd);
    }

    @Override
    public int transfer(int outid, double money, int inid) {
        int i = accountMapper.update(outid, -money);
        i+= accountMapper.update2(inid, money);
        return i;
    }
}
