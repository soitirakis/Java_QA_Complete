package org.example.faculty;

public class Main {
    public static void main(String[] args) {
       //Speciality.Specialization specialization = Speciality.Specialization.INFORMATICS;

        Student student1= new Student("Andre", "123", "INFORMATICS");
        System.out.println(student1.specialization);

        Faculty faculty = new Faculty();
        faculty.addStudent(student1);

       // faculty.printStudentBySpecialization("INFORMATICS");
    }
}
