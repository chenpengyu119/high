package com.bjsxt.service.impl;

import com.bjsxt.dao.FlowerDao;
import com.bjsxt.dao.impl.FlowerDaoImpl;
import com.bjsxt.pojo.Flower;
import com.bjsxt.service.FlowerService;

import java.util.List;

public class FlowerServiceImpl implements FlowerService {
    private FlowerDao flowerDao = new FlowerDaoImpl();
    @Override
    public List<Flower> findAll() {
        return flowerDao.findAll();
    }
}
