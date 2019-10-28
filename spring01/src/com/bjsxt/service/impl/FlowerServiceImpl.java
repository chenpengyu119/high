package com.bjsxt.service.impl;

import com.bjsxt.mapper.FlowerMapper;
import com.bjsxt.pojo.Flower;
import com.bjsxt.service.FlowerService;

import java.util.List;

public class FlowerServiceImpl implements FlowerService {
    private FlowerMapper flowerMapper;

    public FlowerMapper getFlowerMapper() {
        return flowerMapper;
    }

    public void setFlowerMapper(FlowerMapper flowerMapper) {
        this.flowerMapper = flowerMapper;
    }

    @Override
    public List<Flower> findAll() {
        return flowerMapper.findAll();
    }
}
