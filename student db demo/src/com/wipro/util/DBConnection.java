package com.wipro.util;

import java.sql.*;
public class DBConnection {
        
        
        public static Connection getDBConnection() throws Exception{
                Connection con = null;
                try{
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/studentdbdemo","root","");
                }catch(Exception e){
                        e.printStackTrace();
                }
                
                
                return con;
        }
}
