package org.example.faculty;

public class Main {
    public static void main(String[] args) {

        //create some students
        Student student1= new Student("Andre", "123", "INFORMATICS");
        Student student2 = new Student("dan", "125", "MATHEMATICS");
        Student student3 = new Student("dana", "127", "MATHEMATICS");

        //create a school
        Faculty faculty = new Faculty();

        //add students to the school
        faculty.addStudent(student1);
        faculty.addStudent(student2);
        faculty.addStudent(student3);

        //play with the methods
        faculty.printAllStudents();
        //faculty.removeStudentById("125");
        //faculty.printAllStudents();
        faculty.printStudentsById("130");
        faculty.printStudentBySpecialization(Faculty.Specialization.MATHEMATICS);
    }
}
