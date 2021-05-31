package com.company.udemyCoursesPlayer;

import java.util.ArrayList;

public class Course {

    private String courseTitle;
    private ArrayList<Lesson> lessonsInCourse; // 1  kursta, 1 den fazla kurs olcağından burda tutuyoruz.
    private ArrayList<Teacher> coursesInTeachers; // 1 kursun, 1'den fazla eğitmeni olabilir
    private ArrayList<Student> studentsInTheCourse;
    private boolean hasItBeenPublished; // yayındamı?





    //Constructor
    public Course(String courseTitle, Teacher headTeacher) {

        this.courseTitle = courseTitle;
        this.lessonsInCourse = new ArrayList<>();
        this.coursesInTeachers = new ArrayList<>();
        this.studentsInTheCourse = new ArrayList<>();  //initialized...
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



    //total lesson minutes in the course (Toplam kurs dakkası)
    public int totalLessonMinutesCourse() {
        double totalMinute = 0;
        for(Lesson lesson : lessonsInCourse ){
            totalMinute += lesson.getLessonMinute();
        }

        return (int)totalMinute;
    }


    // course publish control ( Kursa yayın kontrol)
    public boolean controlCoursePublish() {
        if(lessonsInCourse.size() >=5 && totalLessonMinutesCourse() >=60){
            hasItBeenPublished = true;
            return true;

        }else return false;
    }



    //add students to course (Kursa Öğrenci Ekle)
    public void addStudentsToCourse(Student newStudent) {
        if(controlCoursePublish()){
            studentsInTheCourse.add(newStudent);
            System.out.println(newStudent+" Student added...");
        }
    }




}
