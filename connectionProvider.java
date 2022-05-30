package com.company;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionProvider {
   static Connection con;
    public static Connection createC(){

       try {

           //1-load the driver
           Class.forName("com.mysql.cj.jdbc.Driver");

           //2-create connection
           String user="root";
           String password="ammar123";
           String url="jdbc:mysql://localhost:3306/student_manage";

           con= DriverManager.getConnection(url, user , password);

       }catch (Exception e){
           e.printStackTrace();
       }
       return con;
    }
}
