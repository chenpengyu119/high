package com.bjsxt.test;

import com.bjsxt.pojo.Flower;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class MyBatisTest {
    // 查询
    @Test
    public void findByMyBatisTest(){

        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        List<Flower> list = sqlSession.selectList("com.bjsxt.mapper.FlowerMapper.selectFlower");
         System.out.println(list);
        Map<String,Flower> map = sqlSession.selectMap("com.bjsxt.mapper.FlowerMapper.selectFlower", "name");
        System.out.println(map);
        System.out.println(map.get("百合花"));

    }
    @Test
    // 添加
    public void addTest(){
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        int n = sqlSession.insert("com.bjsxt.mapper.FlowerMapper.insF");
        sqlSession.commit();
        System.out.println(n);
    }
    // 删除
    @Test
    public void delTest(){
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        int n = session.delete("com.bjsxt.mapper.FlowerMapper.delF");
        session.commit();
        System.out.println(n);
    }
    /**
     * 使用参数普通传递
     */
    @Test
    public void findOneTest() throws IOException {
        //selByid
        InputStream is = null;
        is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        Flower flower = sqlSession.selectOne("com.bjsxt.mapper.FlowerMapper.selByid", 1);
        System.out.println(flower);
    }
    // 使用参数 对象传值 传递多个数据 (也可以使用Map)
    @Test
    public void findOneMoreParam() throws IOException {
        InputStream is = null;
        is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        Flower f = new Flower(1, "郁金香", 20.0, "草原");
        Flower flower = sqlSession.selectOne("com.bjsxt.mapper.FlowerMapper.selMoreParam",f );
        System.out.println(flower);
    }




}
