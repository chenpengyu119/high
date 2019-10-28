package com.bjsxt.service.impl;

import com.bjsxt.pojo.Account;
import com.bjsxt.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;

public class AccountServiceImpl implements AccountService {
    @Override
    public int transferService(Account outAccount, Account inAccount) {

        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession ss = factory.openSession();
        // 校验转账账户
        Account outAccount2 = ss.selectOne("com.bjsxt.mapper.AccountMapper.selOut", outAccount);
        if (outAccount2!=null){
            // 校验转账金额
            if (outAccount2.getMoney()>=outAccount.getMoney()){
                // 校验入账账户
                Account inAccount2 = ss.selectOne("com.bjsxt.mapper.AccountMapper.selIn", inAccount);
                if (inAccount2!=null){
                    // 执行转账
                    // 修改转账账户金额
                    int i = ss.update("com.bjsxt.mapper.AccountMapper.updt", outAccount);
                    // 修改入账账户金额
                    inAccount.setMoney(-inAccount.getMoney());
                    int i2 = ss.update("com.bjsxt.mapper.AccountMapper.updt", inAccount);
                    if (i+i2==2) {
                        // 记录日志信息
                        Logger logger = Logger.getLogger(AccountServiceImpl.class);
                        logger.debug(outAccount.getAid()+"给"+inAccount.getAid()+"转账"+outAccount.getMoney()+"钱");
                        ss.commit();
                        // 转账成功
                        return ACCOUNT_SUCCESS;
                    }else {
                        // 转账失败
                        return ACCOUNT_FAIL;
                    }
                }else {
                    // 入账账户不存在
                    return ACCOUNT_IN_NOT_EXISTS;
                }
            }else {
                // 余额不足
                return ACCOUNT_MONEY_NOT_ENOUGH;
            }

        }else {
            // 转账账户不存在
            return ACCOUNT_OUT_NOT_EXISTS;
        }

    }
}
