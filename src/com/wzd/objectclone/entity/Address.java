package com.wzd.objectclone.entity;

import java.io.Serializable;

/**
 * @author ：ZeDongW
 * @title :Address
 * @projectName :ObjectCone
 * @description：地址
 * @version: 1.0
 * @date ：Created in 2019/04/03/0003 12:48
 * @modified By：
 */
public class Address implements Serializable {
    String city;

    public Address(String city) {
        this.city = city;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
