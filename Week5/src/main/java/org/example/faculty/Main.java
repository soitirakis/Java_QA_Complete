package org.example.faculty;

public class Main {
    public static void main(String[] args) {
       //Speciality.Specialization specialization = Speciality.Specialization.INFORMATICS;

        Student student1= new Student("Andre", "123", "INFORMATICS");
        Student student2 = new Student("dan", "125", "MATHEMATICS");
        System.out.println(student1.specialization);

        Faculty faculty = new Faculty();
        faculty.addStudent(student1);
        faculty.addStudent(student2);

       // faculty.printStudentBySpecialization(Faculty.Specialization.);
        faculty.printAllStudents();
        //faculty.removeStudentById("125");
        //faculty.printAllStudents();
        faculty.printStudentsById("125");
    }
}
