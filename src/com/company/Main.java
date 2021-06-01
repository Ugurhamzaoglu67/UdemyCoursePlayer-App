package com.company;

import com.company.udemyCoursesPlayer.Course;
import com.company.udemyCoursesPlayer.Lesson;
import com.company.udemyCoursesPlayer.Student;
import com.company.udemyCoursesPlayer.Teacher;


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        printMyObjects();


    }

    public static void printMyObjects() {
        Student std1Samet = new Student(
                "Samet",
                27,
                "samet_27",
                "Hello from samet",134);


        Teacher javaTeacher = new Teacher(
                "Udemy JAVA TEACHER",
                38,
                "java_teacher",
                "I'M a JAVA TEACHER",
                5,
                "My Branch JAVA",
                "Java world");

        Teacher javaTeacher2Antonio = new Teacher(
                "Udemy JAVA TEACHER2 antonio",
                28,
                "antonio_java_teacher",
                "I'M a JAVA TEACHER two ( antonio)",
                4,
                "My Branch JAVA & JDBC",
                "Java City");

        Teacher nodeJsTeacher = new Teacher(
                "Udemy Node.js TEACHER",
                28,
                "nodejs_teacher",
                "I'M a NODE.js TEACHER",
                2,
                "My Branch Node.js",
                "my location Node.js...");

        // JAVA LESSON
        Lesson javaLesson1 = new Lesson("Java OOP",1,37.6);
        Lesson javaLesson2 = new Lesson("Java Collections",2,15.6);
        Lesson javaLesson3 = new Lesson("Java Data Structures",3,55.8);
        Lesson javaLesson4 = new Lesson("Java Algorithm",4,25.8);
        Lesson javaLesson5 = new Lesson("Java Spring",5,35.8);
        Lesson javaLesson6 = new Lesson("Java Spring Boot",6,25.8);
        Lesson javaLesson7 = new Lesson("Java & React",7,57.3);


        // NODE.JS LESSON
        Lesson nodeJsLesson1 = new Lesson("Node.js Mongoose",1,25.5);
        Lesson nodeJsLesson2 = new Lesson("Node.js ders 1",2,15.5);
        Lesson nodeJsLesson3 = new Lesson("Node.js ders 2",3,35.5);
        Lesson nodeJsLesson4 = new Lesson("Node.js ders 3",4,25.3);
        Lesson nodeJsLesson5 = new Lesson("Node.js ders 4",5,7.5);
        Lesson nodeJsLesson6 = new Lesson("Node.js ders 5",6,25.5);


        // JAVA COURSE
        Course javaCourse = new Course("100 Hours JAVA",javaTeacher);

        // NODEJS COURSE
        Course nodeJsCourse = new Course("80 Hours Node.js",nodeJsTeacher);



        System.out.println("\n_____add teacher to the course______");
        javaCourse.addLessonToCourse(javaLesson1);
        javaCourse.addLessonToCourse(javaLesson2);
        javaCourse.addLessonToCourse(javaLesson3);
        javaCourse.addLessonToCourse(javaLesson4);
        javaCourse.addLessonToCourse(javaLesson5);
        javaCourse.addLessonToCourse(javaLesson6);


        nodeJsCourse.addLessonToCourse(nodeJsLesson1);
        nodeJsCourse.addLessonToCourse(nodeJsLesson2);
        nodeJsCourse.addLessonToCourse(nodeJsLesson3);
        nodeJsCourse.addLessonToCourse(nodeJsLesson4);
        nodeJsCourse.addLessonToCourse(nodeJsLesson5);
        nodeJsCourse.addLessonToCourse(nodeJsLesson6);



        System.out.println("\n_____add teacher_____");
        javaCourse.addTeachertoCourse(javaTeacher2Antonio);

        System.out.println("\n_____delete teacher to the course______");
        javaCourse.deleteTeacherFromCourse(javaTeacher);
        javaCourse.deleteTeacherFromCourse(javaTeacher2Antonio);


        System.out.println("\n___ join the course________ ");
        std1Samet.joinTheCourse(javaCourse);
        std1Samet.joinTheCourse(nodeJsCourse);



        System.out.println("\n___ watch lesson list________ ");

        std1Samet.watchLessonList(javaLesson4);
        std1Samet.watchLessonList(nodeJsLesson1);
        std1Samet.watchLessonList(nodeJsLesson2);
        std1Samet.watchLessonList(nodeJsLesson3);


       // System.out.println("\n___ leave the course________ ");
        //std1Samet.exitCourse(javaCourse);


        System.out.println("\n_______Current watch  course_______ ");
        playToWatchList(std1Samet.getWatchLessonList());


    }

    // PLAY WATCH LIST
    public static void playToWatchList(LinkedList<Lesson> playList) {

        Scanner scanner = new Scanner(System.in);
        boolean quit = true;
        boolean myNextIterator = true;

        ListIterator<Lesson> iterator = playList.listIterator();

        if(playList.size() <= 0){
            System.out.println("No courses have been added yet.");
        }else {
            Lesson firstLesson = iterator.next();
            System.out.println("Current watch lesson : "+firstLesson.getLessonName()+", time : "+firstLesson.getLessonMinute());
        }

        showMenus();
        while(quit) {
            System.out.print("Make your Choice, Red pill ? or Blue pill ? :) :  ");
            int selection = scanner.nextInt();

            switch (selection){
                case 0:
                    System.out.println("Exiting the application, Good By...");
                    quit = false;  break;

                case 1:
                    // Arabayı geri vitese almak gibi, önce durdur sonra ileriye..
                    if(!myNextIterator){ // TEKRAR ETMEYEN ITERATOR İÇİN
                        myNextIterator = true; //Araba durdu, ileri al şimdi
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                    }

                    if(iterator.hasNext()){
                        Lesson firstLesson = iterator.next();
                        System.out.println("Currently Playing oOoOoOo -> Ders no : "+firstLesson.getLessonNumber()+" "+firstLesson.getLessonName()+", time : "+firstLesson.getLessonMinute());

                    }else {
                        System.out.println("No lesson to show!");
                    }
                    break;

                case 2:
                    if(myNextIterator) { // TEKRAR ETMEYEN ITERATOR İÇİN
                        myNextIterator = false; // Arabayı geri vitese almak gibi, önce durdur sonra geriye..

                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }

                    }

                    if(iterator.hasPrevious()){
                        Lesson firstLesson = iterator.previous();
                        System.out.println("Currently Playing oOoOoOo -> Ders no : "+firstLesson.getLessonNumber()+" "+firstLesson.getLessonName()+", time : "+firstLesson.getLessonMinute());

                    }
                    else {
                        System.out.println("No lesson to show!");
                    }
                    break;

                case 3:
                    System.out.println("/_______________________________WATCHING LIST_______________________/");
                    showingWatchList(playList); break;

                case 4:
                    showMenus(); break;

                default:
                    System.out.println("404 eror");

            }

        }
    }

    // WATCH LIST
    private static void showingWatchList (LinkedList<Lesson> showList) {
        ListIterator<Lesson> iterator = showList.listIterator();

        if(showList.size() <= 0){
            System.out.println("No courses have been added yet.");
            return;

        }else {
            while(iterator.hasNext()){
                Lesson firstLesson = iterator.next();
                System.out.println("Ders no : "+firstLesson.getLessonNumber()+" "+firstLesson.getLessonName()+", time : "+firstLesson.getLessonMinute());

            }
        }

    }

    // SHOW MENUS
    private static void showMenus() {
        System.out.println("\n\n************** UDEMY COURSE PLAYER APP *******************");
        System.out.println(
                "0 - Exit This App\n" +
                "1 - Go to NEXT lesson\n"+
                "2 - Go to PREVIOUS lesson\n"+
                "3 - show all watch list\n"+
                "4- show Menus\n"
        );

    }


}
