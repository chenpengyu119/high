package com.bjsxt.service;

import com.bjsxt.pojo.Account;

public interface AccountService {
    public Account checkNamePwd(int outid,String apwd);

    public int transfer(int outid, double money, int inid);
}
