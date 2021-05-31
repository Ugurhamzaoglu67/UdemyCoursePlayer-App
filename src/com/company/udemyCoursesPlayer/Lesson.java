package com.company.udemyCoursesPlayer;

public class Lesson {

    private String lessonName;
    private int  lessonNumber;
    private double lessonMinute;



    //Constructor
    public Lesson(String lessonName, int lessonNumber, int lessonMinute) {
        this.lessonName = lessonName;
        this.lessonNumber = lessonNumber;
        this.lessonMinute = lessonMinute;
    }

    // GETTER
    public String getLessonName() {
        return lessonName;
    }

    public int getLessonNumber() {
        return lessonNumber;
    }

    public double getLessonMinute() {
        return lessonMinute;
    }



    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + lessonName + '\'' +
                ", courseNumber=" + lessonNumber +
                ", courseMinute=" + lessonMinute +
                '}';
    }
}
