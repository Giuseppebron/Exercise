package javabasics.OOP._2;

public class Student {
    String name= "";
    int age = 0;

    public Student(String name, int age) {
        System.out.println("Costructing");
        this.name= name;
        this.age = age;
        System.out.println(name + " "+ age);
        System.out.println("Costructed");

    }public Student(String name) {
        System.out.println("Costructing");
        this.name= name;
        System.out.println(name);
        System.out.println("Costructed");

    }public Student(int age) {
        System.out.println("Costructing");
        this.age= age;
        System.out.println(age);
        System.out.println("Costructed");

    }public Student() {

    }
}