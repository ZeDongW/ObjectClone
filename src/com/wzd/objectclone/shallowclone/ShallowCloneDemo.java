package com.wzd.objectclone.shallowclone;

import com.wzd.objectclone.entity.Address;
import com.wzd.objectclone.entity.Users;

/**
 * @author ：ZeDongW
 * @title :ShallowCloneDemo
 * @projectName :ObjectClone
 * @description：对象的浅克隆
 * @version: 1.0$
 * @date ：Created in 2019/04/03/0003 8:46
 * @modified By：
 */
public class ShallowCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("武汉");
        Users u1 = new Users(addr,"110", "张三");
        Users u2 = (Users) u1.clone();
        u2.setName("李四");
        u2.getAddr().setCity("深圳");
        System.out.println(u1);
        System.out.println(u2);
    }
}
