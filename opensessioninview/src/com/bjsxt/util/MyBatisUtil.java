package com.bjsxt.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {

    /**
     * factory只在该类第一次加载时创建，服务器重启后消失。也就是说不同的请求使用同一个factory，这样就可以使用二级缓存了。
     */
    private static ThreadLocal<SqlSession> tl = new ThreadLocal();
    private static SqlSessionFactory factory;

    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            factory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSession(){
        SqlSession ss =  tl.get();
        if (ss==null){
            tl.set(factory.openSession());
        }
        return tl.get();
    }

    public static void closeSession(){
        SqlSession ss = tl.get();
        if (ss!=null) {
            ss.close();
        }
        tl.set(null);
    }

}
