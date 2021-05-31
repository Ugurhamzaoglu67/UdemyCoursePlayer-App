package com.company.udemyCoursesPlayer;



public class Student  extends Person {
    private int studentNumber;



    // CONSTRUCTOR
    public Student(String name, int age,String userName, String whoAreu, int studentNumber) {
        super(name, age, userName, whoAreu);

        if(studentNumber >= 0){
            this.studentNumber = studentNumber;
        }else {
            System.out.println("Student number must be greater than zero!");
        }

    }


    // GETTER & SETTER
    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentNumber=" + studentNumber +
                '}';
    }
}