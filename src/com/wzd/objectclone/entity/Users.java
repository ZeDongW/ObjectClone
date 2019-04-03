package com.wzd.objectclone.entity;

import java.io.Serializable;

/**
 * @author ：ZeDongW
 * @title :Users
 * @projectName :ObjectCone
 * @description：用户类
 * @version: 1.0
 * @date ：Created in 2019/04/03/0003 12:45
 * @modified By：
 */
public class Users implements Serializable, Cloneable {
    private Address addr;
    private String id; //id
    private String name; //用户名

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Users(Address addr, String id, String name) {
        this.addr = addr;
        this.id = id;
        this.name = name;
    }

    public Users() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Users{" +
                "addr=" + addr.getCity() +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

