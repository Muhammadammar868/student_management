package com.company;

public class student {
    public student(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentPhone='" + studentPhone + '\'' +
                ", studentCity='" + studentCity + '\'' +
                ", cid=" + cid +
                '}';
    }

    public student(String studentName, String studentPhone, String studentCity, int cid) {
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
        this.cid = cid;
    }

    private int studentId;
    private String studentName;
    private  String studentPhone;
    private String studentCity;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public student(int studentId, String studentName, String studentPhone, String studentCity, int cid) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
        this.cid = cid;
    }

    private int cid;

    public student(String studentName, String studentPhone, String studentCity) {
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public student(int studentId, String name, int phone, String city) {

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public student(int studentId, String studentName, String studentPhone, String studentCity) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;


    }
    public student(int studentId, String name){
        super();
    }


}
