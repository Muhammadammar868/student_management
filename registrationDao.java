package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class registrationDao {


    public static boolean registrationbd(registration rt) {

        Boolean f = false;
        try {

            Connection con =connectionProvider.createC();
            String q = "INSERT INTO registration (sid,cid) VALUES (?,?)";

            //prepared statment


            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1,rt.getSid());
            pstmt.setInt(2,rt.getCid());
           // pstmt.setInt(2,rt.getCourseid());




            //execute;
//            pstmt.executeUpdate();



            //execute;
            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f ;


    }

    public static boolean deleteCourse(int userId) {

        boolean f=false;

        //jdbc code..
        try{

            Connection con =connectionProvider.createC();
            String q="delete from registration where sid=?";
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
}
