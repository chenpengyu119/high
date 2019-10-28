package com.bjsxt.test;

import com.bjsxt.mapper.LogMapper;
import com.bjsxt.pojo.Log;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {

        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession ss = factory.openSession();

        Scanner input = new Scanner(System.in);
        System.out.println("请输入转账账户：");
        // nextLine支持输入空
        String accout = input.nextLine();
        System.out.println("请输入入账账户：");
        String accin = input.nextLine();
        // 接口绑定 原理是动态代理设计模式
        LogMapper mapper = ss.getMapper(LogMapper.class);
     /*   List<Log> logList = mapper.selByAccinAccout(accin, accout);
        System.out.println(logList);*/
        mapper.updt(accin,accout);

    }
}
