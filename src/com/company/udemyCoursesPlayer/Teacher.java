package com.company.udemyCoursesPlayer;

public class Teacher extends Student {
    private String branchOfTeacher;
    private String locationOfTeacher;


    public Teacher(String name, int age, String userName, String whoAreu, int studentNumber, String branchOfTeacher, String locationOfTeacher) {
        super(name, age, userName, whoAreu, studentNumber);
        this.branchOfTeacher = branchOfTeacher;
        this.locationOfTeacher = locationOfTeacher;
    }


}
