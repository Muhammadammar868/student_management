package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

    public static boolean insertStudentToDB(student st){

        boolean f=false;

        //jdbc code..
        try{

            Connection con =connectionProvider.createC();
            String q="insert into students(sname,sphone,scity)values(?,?,?)";
            //prepared statement
            PreparedStatement pstmt =con.prepareStatement(q);
            //set gthe values of paramter
            pstmt.setString(1,st.getStudentName());
            pstmt.setString(2, st.getStudentPhone());
            pstmt.setString(3,st.getStudentCity());
           // pstmt.setInt(4,st.getCid());

            //execute
            pstmt.executeUpdate();
            f=true;

        } catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deleteStudent(int userId) {

        boolean f=false;

        //jdbc code..
        try{

            Connection con =connectionProvider.createC();
            String q="delete from students where sid=?";
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

    public static void showAllStudent() {

        boolean f=false;

        //jdbc code..
        try{

            Connection con =connectionProvider.createC();
            String q="select * from students;";

            Statement stmt=con.createStatement();
            //execute
            ResultSet set =stmt.executeQuery(q);

            while (set.next()){

                int id=set.getInt(1);
                String name=set.getString(2);
                String phone=set.getString(3);
                String city=set.getString("scity");

                System.out.println("ID  :" +id);
                System.out.println("name  :" +name);
                System.out.println("phone  :" +phone);
                System.out.println("city  :" +city);
            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }


    public static boolean alterstudenttodb(student st) {

        Boolean f = false;
        try {
            Connection con = connectionProvider.createC();


            String sql = "update students set sname=?,sphone=?,scity=? where sid = ?";
            //prepared statment

            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setString(1, st.getStudentName());
            pstmt.setString(2, st.getStudentPhone());
            pstmt.setString(3, st.getStudentCity());
            pstmt.setInt(4, st.getStudentId());

           // pstmt.setInt(4,st.getStudentId());
           // pstmt.setString(1, st.getStudentName());
            //pstmt.setString(2, st.getStudentPhone());
            //pstmt.setString(3, st.getStudentCity());


            //execute;
          //01
             pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f ;

    }

    public static boolean courseId(int userid) {

        boolean f=false;

        //jdbc code..
        try{

            Connection con =connectionProvider.createC();
            String q=" SELECT students.sid, students.sname,students.sphone,students.scity,course.cid,course.cname FROM students inner join course ON students.cid=course.cid where students.sid=?";

            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1, userid);

            ResultSet set = pstmt.executeQuery();

            while (set.next()){

                int id=set.getInt(1);
                String name=set.getString(2);
                String phone=set.getString(3);
                String city=set.getString("scity");
                int cid=set.getInt(5);
                String coursename=set.getString(6);

                System.out.println("ID  :" +id);
                System.out.println("name  :" +name);
                System.out.println("phone  :" +phone);
                System.out.println("city  :" +city);
                System.out.println("courseid ="+cid);
                System.out.println("Coursename ="+coursename);
            }

            f=true;

        } catch (Exception e){
            e.printStackTrace();
        }
        return f;


        }


    public static boolean showStudentjoin(int userid) {



            Boolean f = false;
            try {
                Connection con =connectionProvider.createC();
                String q="  SELECT students.sid,students.sname,students.sphone,students.scity ,course.cid,course.cname,course.code, registration.cid FROM students INNER JOIN Registration ON registration.sid=students.sid INNER JOIN course ON course.cid = registration.cid where registration.sid=? ";
                PreparedStatement pstmt = con.prepareStatement(q);
                pstmt.setInt(1, userid);

                ResultSet set = pstmt.executeQuery();

                while(set.next()) {


                    int sid=set.getInt(1);
                    String sname=set.getString(2);
                    String sphone=set.getString(3);
                    String scity=set.getString(4);
                    int cid=set.getInt(5);
                    String cname=set.getString(6);


                    System.out.println("ID ="+sid);
                    System.out.println("First Name ="+sname);
                    System.out.println("phone ="+sphone);
                    System.out.println("City ="+scity);
                    System.out.println("courseid ="+cid);
                    System.out.println("Coursename ="+cname);

                    System.out.println("_____________________");


                }


                f = true;

            } catch (Exception e) {
                e.printStackTrace();
            }

            return f ;

    }
}


