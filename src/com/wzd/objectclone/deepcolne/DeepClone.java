package com.wzd.objectclone.deepcolne;

import com.wzd.objectclone.entity.Address;
import com.wzd.objectclone.entity.Users;

import java.io.*;

/**
 * @author ：ZeDongW
 * @title :DeepClone
 * @projectName :ObjectCone
 * @description：对象的深克隆
 * @version: 1.0
 * @date ：Created in 2019/04/03/0003 13:04
 * @modified By：
 */
public class DeepClone {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        Address addr = new Address("武汉");
        Users u1 = new Users(addr, "110", "张三");
        writeUser(u1);
        Users u2 = readUsers();
        u2.setName("李四");
        u2.getAddr().setCity("深圳");
        System.out.println(u1);
        System.out.println(u2);
    }

    /** @Author ZeDongW
     * @Description 从文件读取对象
     * @Date 2019/04/03/0003 15:43
     * @Param []
     * @Return com.wzd.objectclone.entity.Users
     */
    private static Users readUsers() throws IOException, ClassNotFoundException{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/Users.object"));
        return (Users)objectInputStream.readObject();
    }

    /** @Author ZeDongW
     * @Description 将对象写入文件
     * @Date 2019/04/03/0003 13:09
     * @Param [u1]
     * @Return void
     */
    private static void writeUser(Users u1) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/Users.object"));
        objectOutputStream.writeObject(u1);
        objectOutputStream.close();
    }
}
