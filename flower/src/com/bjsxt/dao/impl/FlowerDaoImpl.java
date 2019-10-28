package com.bjsxt.dao.impl;

import com.bjsxt.dao.FlowerDao;
import com.bjsxt.pojo.Flower;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlowerDaoImpl implements FlowerDao {
    @Override
    public List<Flower> findAll() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Flower> flowerList = new ArrayList<>();
        String sql = "select * from flower";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/high", "root", "root");
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Flower flower = new Flower();
                flower.setId(rs.getInt("id"));
                flower.setName(rs.getString("name"));
                flower.setPrice(rs.getDouble("price"));
                flower.setProduction(rs.getString("production"));
                flowerList.add(flower);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rs, ps, conn);
        }
        return flowerList;
    }

    private void close(ResultSet rs, PreparedStatement ps, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps!=null){
                ps.close();
            }
            if (conn!=null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession ss = factory.openSession();
        List<Flower> objects = ss.selectList("com.bjsxt.mapper.FlowerMapper.selectFlower");
        System.out.println(objects);
    }


}
