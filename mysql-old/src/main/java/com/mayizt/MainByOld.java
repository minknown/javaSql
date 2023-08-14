package com.mayizt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainByOld {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注意：如果未在pom.xml中依赖mysql驱动坐标，则需要自行通过lib导入驱动jar包(网上找)。
        // 1.导入驱动类
        Class.forName("com.mysql.jdbc.Driver");
        // 2.用户信息和url
        String url = "jdbc:mysql://bdm291915593.my3w.com:3306/bdm291915593_db";
        String user = "bdm291915593";
        String password = "qqq12345678!";
        // 3.获取连接
        Connection conn = DriverManager.getConnection(url, user, password);
        // 4.执行SQL的对象
        Statement sta =  conn.createStatement();
        // 5.执行SQL
        String sql = "select * from user";
        ResultSet rs = sta.executeQuery(sql);
        while (rs.next()){
            System.out.println("id= " + rs.getObject("id"));
            System.out.println("name= " + rs.getObject("name"));

            System.out.println("=========================================");
        }
        // 6.释放连接
        rs.close();
        sta.close();
        conn.close();
    }
}
