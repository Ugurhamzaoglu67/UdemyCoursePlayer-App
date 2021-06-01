package com.company.udemyCoursesPlayer;


import java.util.ArrayList;
import java.util.LinkedList;

public class Student  extends Person {
    private int studentNumber;
    private ArrayList<Course> attendCourses;
    private LinkedList<Lesson>  watchLessonList;



    // CONSTRUCTOR
    public Student(String name, int age,String userName, String whoAreu, int studentNumber) {
        super(name, age, userName, whoAreu);
        setStudentNumber(studentNumber);
        this.attendCourses = new ArrayList<>();
        this.watchLessonList = new LinkedList<>();


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


    //JOIN COURSE
    public void joinTheCourse(Course courseToAttend) {

        if(courseToAttend.controlCoursePublish()){
            courseToAttend.getStudentsInTheCourse().add(this);
            attendCourses.add(courseToAttend);
            System.out.println(getName()+" -> "+courseToAttend.getCourseTitle()+ " attended the course...");

        } else {
            System.out.println("This course not published!");
        }
    }

    //WATCHLESSONLIST
    public void watchLessonList(Lesson lessonToWatch) {
        if(attendCourses.size() > 0){
            boolean lessonFound  = false;

            for( Course course: attendCourses){
                    if((course.getLessonsInCourse().contains(lessonToWatch))){
                        watchLessonList.add(lessonToWatch);
                        System.out.println(lessonToWatch+" add to -> watch List...");
                        lessonFound = true;
                        break;
                    }
            }

            if(!lessonFound){
                System.out.println("This lesson not found or your not permission!!!");
            }

        }
    }

}