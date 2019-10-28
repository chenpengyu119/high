package com.bjsxt.service;

import com.bjsxt.pojo.Account;

public interface AccountService {

    /**
     * 定义常量记录返回值
     */
    int ACCOUNT_OUT_NOT_EXISTS = 1;
    int ACCOUNT_MONEY_NOT_ENOUGH = 2;
    int ACCOUNT_IN_NOT_EXISTS = 3;
    int ACCOUNT_SUCCESS = 4;
    int ACCOUNT_FAIL = 5;



    /**
     * @param outAccount
     * @param inAccount
     * @return
     */

    // 添加转账信息
    public int transferService(Account outAccount, Account inAccount);



}
