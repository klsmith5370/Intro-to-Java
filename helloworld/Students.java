package helloworld;

import java.io.*;

public class Students {
    String name;
    int age;
    String school;
    double grade;

    // Create the constructor of the class Student
    public void Student (String name) {
        this.name = name;
    }

    public void studentAge (int studentAge) {
        age = studentAge;
    }

    public void stuSchool (String stuSchool) {
        school = stuSchool;
    }

    public void stuGrade (double stuGrade) {
        grade = stuGrade;
    }

    public void printStudentDetails() {
        System.out.println("Student's name: " + name);
        System.out.println("Student's age: " + age);
        System.out.println("Student's school: " + school);
        System.out.println("Student's grade: " + grade);
    }
    
}
