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
        coursesInTeachers.add(0,headTeacher);
        this.hasItBeenPublished = false;

    }

    // add teachers to course (Kursa öğretmen ekle)
    public void addTeachertoCourse(Teacher newTeacher) {

        if(!coursesInTeachers.contains(newTeacher)){
            coursesInTeachers.add(newTeacher);

            System.out.println(newTeacher+" Teacher added...");
        }
        else {
            System.out.println(newTeacher.getName()+ " This Teacher already exists!");
        }



    }


    //delete teacher from course (Kurstan öğretmen sil)
    public void deleteTeacherFromCourse(Teacher deleteTeacher) {
        if(  deleteTeacher.getName().equals(coursesInTeachers.get(0).getName())  ){
            System.out.println(deleteTeacher.getName()+" Head TEACHER can not be deleted");
        }
        else {
            coursesInTeachers.remove(deleteTeacher);
            System.out.println(deleteTeacher.getName()+" -> Teacher was deleted!");
        }


    }

    //add lesson to course (Kursa ders ekle)
    public void addLessonToCourse(Lesson newLesson) {
        lessonsInCourse.add(newLesson);
        System.out.println(newLesson+" -> Lesson added...");
    }

    //count lesson in the course (Kurstaki Ders Sayısı)
    public int countLessonInCourse() {
        return lessonsInCourse.size();
    }



    //total lesson minutes in the course (Toplam kurs dakkası)
    private int totalLessonMinutesCourse() {
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

    //GETTER
    public ArrayList<Student> getStudentsInTheCourse() {
        return studentsInTheCourse;
    }

    public String getCourseTitle() {
        return courseTitle;
    }
}
