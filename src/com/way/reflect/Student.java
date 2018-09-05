package com.way.reflect;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 9/5/2018 10:34
 * @Description:
 */
public class Student {



    private int id;

    public String name;

    char gender;

    protected String phone;


    public static void main(String[] args) {
        System.out.println("I am the main method!");
    }

    public Student() {
        System.out.println("I am the public constructor!");
    }

    private Student(int id, String name) {
        System.out.println("I am the private constructor!");
        this.id = id;
        this.name = name;
    }

    Student(int id, String name, char gender) {
        System.out.println("I am the default constructor!");
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    protected Student(int id, String name, char gender, String phone) {
        System.out.println("I am the protected constructor!");
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }


    private String method1(int id,String name){
        return "hello, id="+id+" name="+name+", i am a private method1!";
    }

    String method2(String name){
        return "hello,  name="+name+", i am a default method2!";
    }

    protected String method3(int id,String name){
        return "hello, name="+name+", i am a protected method3!";
    }

    private String method4(String name){
        return "hello,  name="+name+", i am a private method4!";
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                '}';
    }
}
