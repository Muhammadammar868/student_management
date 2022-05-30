package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CourseDao {
    public static boolean insertCourseToDb(Course cor) {

        boolean f=false;

        //jdbc code

        try{

            Connection con =connectionProvider.createC();
            String q="insert into course(code,cname)values(?,?)";
            //prepared statement
            PreparedStatement pstmt =con.prepareStatement(q);
            //set gthe values of paramter
            pstmt.setInt(1,cor.getCourseCode());
            pstmt.setString(2,cor.getCourseName());


            //execute
            pstmt.executeUpdate();
            f=true;

        } catch (Exception e){
            e.printStackTrace();
        }
        return f;





    }

    public static boolean deleteCourse(int userId) {

        boolean f=false;
        //jdbc code

        try{

            Connection con =connectionProvider.createC();
            String q="delete from course where cid=?";
            //prepared statement
            PreparedStatement pstmt =con.prepareStatement(q);
            //set gthe values of paramter
            pstmt.setInt(1, userId);

            //execute
            pstmt.executeUpdate();
            f=true;

        } catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public static void showAllCourses() {


        boolean f=false;

        //jdbc code..
        try{

            Connection con =connectionProvider.createC();
            String q="select * from course;";

            Statement stmt=con.createStatement();
            //execute
            ResultSet set =stmt.executeQuery(q);

            while (set.next()){

                int id=set.getInt(1);
                String name=set.getString(2);
                String code=set.getString(3);


                System.out.println("ID" +id);
                System.out.println("coursename  :" +name);
                System.out.println("code  :" +code);

            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static boolean alter(Course cor) {

        Boolean f = false;
        try {
            Connection con = connectionProvider.createC();


            String sql = "update course set cname=?,code=? where cid = ?";
            //prepared statment

            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setString(1,cor.getCourseName());
            pstmt.setInt(2, cor.getCourseCode());
            pstmt.setInt(3,cor.getCourseid());



            //execute;
            //01
            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f ;


    }
}
