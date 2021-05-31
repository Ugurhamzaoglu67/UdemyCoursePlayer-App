package com.company;

import com.company.udemyCoursesPlayer.Student;
import com.company.udemyCoursesPlayer.Teacher;

public class Main {

    public static void main(String[] args) {

        printMyObjects();

    }

    public static void printMyObjects() {
        Student std1 = new Student(
                "Samet",
                27,
                "samet_27",
                "Hello from samet",134);


        Teacher teacher1 = new Teacher(
                "Udemy JAVA TEACHER",
                38,
                "java_teacher",
                "I'M a JAVA TEACHER",
                5,
                "My Branch JAVA",
                "Java world");

        System.out.println(std1);
        System.out.println("**************");
        System.out.println(teacher1);

    }
}
