package com.example.a073105.myjetpackdemo.bean;

import com.example.a073105.myjetpackdemo.bean.base.BaseData;

public class User extends BaseData {

    private String name;
    private String logo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
