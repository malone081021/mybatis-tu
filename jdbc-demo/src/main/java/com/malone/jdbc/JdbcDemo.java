package com.malone.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC demo
 *
 * @Author: malone
 * @Date 2020/6/26 12:47
 */
public class Demo1 {
    //数据库地址
    static String url = "jdbc:mysql://localhost:3306/jdbc_demo?serverTimezone=GMT";
    //用户名
    static String user = "root";
    //密码
    static String pwd = "178914";

    public static void main(String[] args) {
        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //创建连接
            Connection conn = DriverManager.getConnection(url, user, pwd);
            //获取Statement对象
            Statement stat = conn.createStatement();
            //操作数据库
            String sql = "create table user(username varchar(20) primary key, password varchar(20));";
            stat.execute(sql);
            //关闭Statement对象和连接
            stat.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
