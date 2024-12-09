package helloworld;

import java.io*;

public class StudentTest {
    public static void main (String args[]) {
        // created 2 objects using the student constructors
        Student student1 = new Student("Bob Parsons");
        Student student2 = new Student("Michael Test");

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
