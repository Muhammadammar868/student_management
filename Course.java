package com.company;

public class Course {
    private int courseid;
    private String courseName;
    private int courseCode;

    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseid=" + courseid +
                ", courseName='" + courseName + '\'' +
                ", courseCode=" + courseCode +
                '}';
    }

    public Course(int courseid, String courseName, int courseCode) {
        this.courseid = courseid;
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }
}

