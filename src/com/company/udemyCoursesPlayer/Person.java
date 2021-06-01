package com.company.udemyCoursesPlayer;



public  abstract class Person {

    private String name;
    private String userName;
    private String whoAreu;
    private int age;

    public Person() {

    }


    public Person(String name, int age, String userName, String whoAreu) {
        this.name = name;
        this.age = age;
        this.userName = userName;
        this.whoAreu = whoAreu;
    }



    //GETTER
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUserName() {
        return userName;
    }

    public String getWhoAreu() {
        return whoAreu;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", userName='" + userName + '\'' +
                ", whoAreu='" + whoAreu + '\'' +
                '}';
    }
}
