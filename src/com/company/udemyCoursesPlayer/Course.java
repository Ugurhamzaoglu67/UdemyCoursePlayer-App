package com.company.udemyCoursesPlayer;

import java.util.ArrayList;

public class Course {

    private String courseTitle;
    private ArrayList<Lesson> lessonsInCourse; // 1  kursta, 1 den fazla kurs olcağından burda tutuyoruz.
    private ArrayList<Teacher> coursesInTeachers; // 1 kursun, 1'den fazla eğitmeni olabilir
    private boolean hasItBeenPublished; // yayındamı?

    //Constructor
    public Course(String courseTitle, Teacher headTeacher) {

        this.courseTitle = courseTitle;
        this.lessonsInCourse = new ArrayList<>();
        this.coursesInTeachers = new ArrayList<>();
        coursesInTeachers.add(headTeacher);
        this.hasItBeenPublished = false;

    }

    // add teachers to course (Kursa öğretmen ekle)
    public void addTeachertoCourse(Teacher newTeacher) {
        coursesInTeachers.add(newTeacher);
        System.out.println(newTeacher+" Teacher added...");
    }

    //delete teacher from course (Kurstan öğretmen sil)
    public void deleteTeacherFromCourse(Teacher deleteTeacher) {
        coursesInTeachers.remove(deleteTeacher);
        System.out.println(deleteTeacher+" Teacher was deleted!");
    }

    //add lesson to course (Kursa ders ekle)
    public void addLessonToCourse(Lesson newLesson) {
        lessonsInCourse.add(newLesson);
        System.out.println(newLesson+" Lesson added...");
    }

    //count lesson in the course (Kurstaki Ders Sayısı)
    public int countLessonInCourse() {
        return lessonsInCourse.size();
    }

    //total lesson minutes in the course
    public int totalLessonMinutesCourse() {
        double totalMinute = 0;
        for(Lesson lesson : lessonsInCourse ){
            totalMinute += lesson.getLessonMinute();
        }

        return (int)totalMinute;
    }

}
