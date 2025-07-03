package oop.finalexam.t2;

public class Main {
    public static void main(String[] args) {
        UMS ums = new UMS();

        // Add yourself with Argus courses
        Student me = ums.getMyStudentData();
        ums.addStudent(me);

        // Add another student
        Student other = new Student("John Doe");
        other.addCourse(new LearningCourse("Physics I", "High School Math", "Mechanics, Kinematics"));
        ums.addStudent(other);

        // Print students data
        ums.printStudentData(me);
        System.out.println();
        ums.printStudentData(other);
    }
}
