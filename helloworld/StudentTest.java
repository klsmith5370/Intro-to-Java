package helloworld;

import java.io.*;
import helloworld.Students;

public class StudentTest {
    public static void main (String args[]) {
        // created 2 objects using the student constructors
        Students student1 = new Students("Bob Parsons");
        Students student2 = new Students("Michael Test");

        // invoke methods for each object
        student1.studentAge(14);
        student1.stuGrade(18);
        student1.stuSchool("2nd Secondary School");
        student1.printStudentDetails();

        student2.studentAge(14);
        student2.stuGrade(12);
        student2.stuSchool("3rd Secondary School");
        student2.printStudentDetails();

    }
}
