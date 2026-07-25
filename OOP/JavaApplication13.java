/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

class Student {
    static String college = "ABC College";
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class JavaApplication13 {
    public static void main(String[] args) {
        Student s1 = new Student("John");
        Student s2 = new Student("Alice");

        System.out.println(Student.college); // ABC College
        System.out.println(s2.college); // ABC College
    }
}

