package com.bjsxt.pojo;

import java.util.*;

public class People {
    private Integer id;
    private String name;
    private Set<String> sets;
    private List<Integer> list;
    private String [] arrs;
    private Map<String,String> map;
    private Properties properties;

    private Desk desk;

    public Desk getDesk() {
        return desk;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sets=" + sets +
                ", list=" + list +
                ", arrs=" + Arrays.toString(arrs) +
                ", map=" + map +
                ", properties=" + properties +
                ", desk=" + desk +
                '}';
    }

    public void setDesk(Desk desk) {
        this.desk = desk;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public String[] getArrs() {
        return arrs;
    }

    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        System.out.println("setId");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName");
        this.name = name;
    }

    public People(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public People() {
        super();

        System.out.println("People的构造方法");
    }
}
