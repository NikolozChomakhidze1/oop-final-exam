package oop.finalexam.t2;

import java.util.ArrayList;
import java.util.List;

public class UMS {
    private List<Student> students;

    public UMS() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudentData(Student student) {
        System.out.println("Student: " + student.getName());
        List<LearningCourse> courses = student.getCourses();
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled.");
            return;
        }
        System.out.println("Learning Courses:");
        for (LearningCourse course : courses) {
            System.out.println(" - Title: " + course.getTitle());
            System.out.println("   Acceptance prerequisites: " + course.getAcceptancePrerequisites());
            System.out.println("   Major topics: " + course.getMajorTopics());
        }
    }

    public Student getMyStudentData() {
        Student me = new Student("Nikoloz Chomakhidze"); // Replace with your exact name

        // Add your real Argus courses here
        me.addCourse(new LearningCourse("Object-Oriented Programming", "CS50 Introduction to Programming", "Java syntax and data structures;\n" +
                "Procedural programming;\n" +
                "Classes;\n" +
                "Encapsulation, polymorphism, inheritance;\n" +
                "Packages;\n" +
                "Working with the network;\n" +
                "Work with files;\n" +
                "Working with text data;\n" +
                " Work with the terminal."));
        me.addCourse(new LearningCourse("Calculus II", "MATH150 Calculus I", "Antiderivatives.\n" +
                "Definite integrals.\n" +
                "Techniques and applications of integration.\n" +
                "Improper integrals.\n" +
                "Infinite series."));

        me.addCourse(new LearningCourse("Computer organization", "CS50 Introduction to Programming", "Lecture;\n" +
                "Practical Works;\n" +
                "Demonstration method;\n" +
                "Discussion;\n" +
                "Practical work;\n" +
                "Laboratory work."));

        return me;
    }
}
