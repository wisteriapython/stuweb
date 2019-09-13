package com.yujian.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {

    private String driverClass="com.mysql.jdbc.Driver";
    private String driverUrl="jdbc:mysql://localhost:3306/stu?useSSL=false";
    private String dbName="root";
    private String dbPass="123456";

    private Connection conn;

    /**
     * 加载驱动，建立连接
     * @return
     */
    public Connection getConnection(){
        try {
            if (null == conn) {
                Class.forName(this.driverClass);
                conn = DriverManager.getConnection(this.driverUrl, this.dbName, this.dbPass);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }

    public void closeConn(){
        try{
            if(null==conn){
                conn.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
