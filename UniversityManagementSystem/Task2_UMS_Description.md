# Task 2 - University Management System

## Program Description

This Java program implements a simple University Management System (UMS). It manages students and their learning courses. The main components are:

- **LearningCourse**: Represents a course with three properties:  
  - `title` (String) — the course name  
  - `acceptancePrerequisites` (String) — prerequisites required for the course  
  - `majorTopics` (String) — key topics covered in the course

- **Student**: Represents a student with a name and a list of enrolled `LearningCourse` objects.

- **UMS (University Management System)**: Holds a list of students and provides functionality to print detailed student information and their courses. It also includes a method to return the student's own data (hardcoded with Argus courses).

The `printStudentData(Student student)` method prints the student's name and all the courses they are enrolled in, displaying each course's details clearly.

---

## UML Diagram

Below is the UML diagram representing the classes and their relationships:

| Class          | Attributes                                 | Methods                       | Relationships                |
|----------------|--------------------------------------------|------------------------------|-----------------------------|
| **UMS**        | - students: List<Student>                   | + addStudent(Student)         | Has many Students (1..*)    |
|                |                                            | + printStudentData(Student)   |                             |
|                |                                            | + getMyStudentData(): Student |                             |
| **Student**    | - name: String                              | + getName(): String           | Has many LearningCourses    |
|                | - courses: List<LearningCourse>             | + addCourse(LearningCourse)   |                             |
| **LearningCourse** | - title: String                          | + getters and setters for all |                             |
|                | - acceptancePrerequisites: String           |                              |                             |
|                | - majorTopics: String                        |                              |                             |

### Relationships
- `UMS` contains multiple `Student` objects.
- Each `Student` contains multiple `LearningCourse` objects.

---

