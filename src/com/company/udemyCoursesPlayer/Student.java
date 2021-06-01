package com.company.udemyCoursesPlayer;


import java.util.ArrayList;

public class Student  extends Person {
    private int studentNumber;
    private ArrayList<Course> attendCourses;


    // CONSTRUCTOR
    public Student(String name, int age,String userName, String whoAreu, int studentNumber) {
        super(name, age, userName, whoAreu);
        setStudentNumber(studentNumber);
        this.attendCourses = new ArrayList<>();


    }


    // GETTER & SETTER
    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {

        if(studentNumber >= 0){
            this.studentNumber = studentNumber;
        }else {
            System.out.println("Student number must be greater than zero!");
        }
    }


    @Override
    public String toString() {
        return super.toString()+" Student{" +
                "studentNumber=" + studentNumber +
                '}';
    }

    public void joinTheCourse(Course courseToAttend) {

        if(courseToAttend.controlCoursePublish()){
            courseToAttend.getStudentsInTheCourse().add(this);
            attendCourses.add(courseToAttend);
            System.out.println(getName()+" -> "+courseToAttend.getCourseTitle()+ " attended the course...");

        } else {
            System.out.println("This course not published!");
        }
    }
}