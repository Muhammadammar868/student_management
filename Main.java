package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws IOException {


        System.out.println("WELCOME TO STUDENT MANAGEMENT APP");


        while(true){

            System.out.println("Press 1 to add student");
            System.out.println("press 2 to add course");
            System.out.println("Press 3 to delete student");
            System.out.println("press 4 to display student");
            System.out.println("press 5 to delete course");
            System.out.println("press 6 to display courses");
            System.out.println("press 7 for update student");
            System.out.println("press 8 for update course");
            System.out.println("press 9 to add student and course id ");
            System.out.println("press 10 to show record of student and courses ");
            System.out.println("press 11 to delete registration");
            System.out.println("press 0 to exit");

            Scanner scan = new Scanner(System.in);
            int c=scan.nextInt();

            if (c==1){

                //add student
                System.out.println("Enter student name");
                String name=scan.next();
                
                System.out.println("Enter student phone");
                String phone=scan.next();
                
                System.out.println("Enter student  city");
                String city=scan.next();



                
                //create student object to store student
                
                student st=new student(name,phone,city);
                boolean answer =StudentDao.insertStudentToDB(st);

                if (answer){

                    System.out.println("student is added sucessfully...");
                }
                else {
                    System.out.println("something went wrong");
                }
                System.out.println(st);


                
            }

            else if (c==2){

                System.out.println("enter course code");
                int cid= scan.nextInt();
                //add course
                System.out.println("enter course name");
                String course= scan.next();


                //create course object to store courses

                Course cor=new Course(course, cid);
                boolean answer=CourseDao.insertCourseToDb(cor);

                if (answer){

                    System.out.println("course added successfully");
                }
                else{

                    System.out.println("something went wrong ");
                }

                System.out.println(cor);

            }
            else if (c==3){

                //delete student
                System.out.println("enter student id to delete : ");
                int userId= scan.nextInt();
                boolean f= StudentDao.deleteStudent(userId);

                if (f){

                    System.out.println("Student Deleted");
                }
                else {
                    System.out.println("something went wrong...");
                }
            }

            else if (c==4){

                //display student
                StudentDao.showAllStudent();
            }

            else if (c==5){


                //delete a course
                System.out.println("enter id to delete");
                int userId= scan.nextInt();
                boolean f=CourseDao.deleteCourse(userId);

                if (f){

                    System.out.println("Course deleted");
                }

            }

            else if (c==6){

                //display courses
                CourseDao.showAllCourses();
            }

            else if (c==7)
            {

                System.out.println("Enter user id");
                int studentid=scan.nextInt();

                System.out.println("Enter user name");
                String name=scan.next();

                System.out.println("Enter user phone");
                String phone=scan.next();

                System.out.println("Enter user  city");
                String city=scan.next();



                //create student object to store student

                student st=new student(studentid,name,phone,city);


                boolean answer = StudentDao.alterstudenttodb(st);
                if (answer)
                {
                    System.out.println("Student updated Successfully");
                }
                else
                {
                    System.out.println("Something went wrong");
                }

                System.out.println(st);
            }


            else if (c==8)
            {

                System.out.println("Enter course id");
                int  courseid=scan.nextInt();

                System.out.println("Enter course name");
                String cname=scan.next();

                System.out.println("Enter course code");
                int courseCode=scan.nextInt();



                //create student object to store student

                Course cor=new Course(courseid,cname, courseCode);
                boolean answer=CourseDao.alter(cor);

                if (answer){

                    System.out.println("course update successfully");
                }
                else{

                    System.out.println("something went wrong ");
                }

                System.out.println(cor);

            }

            else if (c == 9) {
                System.out.println("Enter student id = ");
                int sid = scan.nextInt();
                System.out.println("Enter course id = ");
                int courseid = scan.nextInt();


                registration rt = new registration(sid, courseid);

                boolean answer = registrationDao.registrationbd(rt);
                if (answer) {
                    System.out.println("Student Added Successfully");
                } else {
                    System.out.println("Some thing went wrong");
                }

                System.out.println(rt);

            }

            else if (c==10){


                    System.out.println("Enter id of the student");
                    int userid = scan.nextInt();


                    StudentDao.showStudentjoin(userid);

                }

            else if (c==11){


                //delete a course
                System.out.println("enter id to delete");
                int userId= scan.nextInt();
                boolean f=registrationDao.deleteCourse(userId);

                if (f){

                    System.out.println("registration deleted");
                }

            }

            else if (c==0){

                //exit
                break;
            }

            else{

            }

        }

        System.out.println("Thank you for using application.......");
        System.out.println("......Good Bye.......");
    }
}
