package org.example.faculty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;

public class Faculty {
    HashMap<Speciality.Specialization, List> studentsBySpecialization = new HashMap<Speciality.Specialization, List>();
    List students = new ArrayList();

    public Faculty () {

    }

    public void addStudent(Student student){

        studentsBySpecialization.put(student.specialization, Collections.singletonList(students.add(student.name)));
        System.out.println("Student added");
    }

    public void printStudentBySpecialization(Speciality.Specialization specialization){
        List students =  studentsBySpecialization.get(specialization);
        for  (Object student : students){
            System.out.println((String)student);
        }
    }

    /*public void printStudentsById(){

    }

    public void removeStudentById() {

    }

    public void printAllStudents(){

    }
     */
}
