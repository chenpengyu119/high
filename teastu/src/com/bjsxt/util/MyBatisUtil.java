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
    /**
     * 只在类加载的时候执行一次，因为ThrealLocal是线程局部变量，所以保证了同一个线程使用同一个。不会出现多个线程共享的情况
     */
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
