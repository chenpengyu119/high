package com.bjsxt.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author pengyu
 */
public class MyBatisUtil {

    private static ThreadLocal<SqlSession> tl = new ThreadLocal();
    private static SqlSessionFactory factory;

    static {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            factory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession  getSession(){
        SqlSession ss = tl.get();
        if (ss==null){
            tl.set(factory.openSession());
        }
        return tl.get();
    }

    public static void closeSession(){
        SqlSession ss = tl.get();
        if (ss!=null){
            ss.close();
        }
        tl.set(null);
    }



}
