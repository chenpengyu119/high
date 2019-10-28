package com.bjsxt.service;

import com.bjsxt.pojo.Phone;
import com.bjsxt.util.Page;

import java.util.List;

public interface PhoneService {

    public Page<Phone> find(Phone phone, Page page);

    public int del(String[] checks);
}
