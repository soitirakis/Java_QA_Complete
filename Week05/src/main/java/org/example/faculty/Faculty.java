package org.example.faculty;

import java.util.*;

public class Faculty {
    enum Specialization {
        INFORMATICS,
        MATHEMATICS,
        BIOLOGY,
        CHEMISTRY
    }
    private Map<Specialization, List<Student>> studentsMap;

    public Faculty () {
        studentsMap = new HashMap<>();

        for (Specialization specialization : Specialization.values()) {
            studentsMap.put(specialization, new ArrayList<>());
        }
    }

    public void addStudent(Student student){

        Specialization specialization = student.specialization;
        studentsMap.get(specialization).add(student);
        System.out.println("Student added");
    }

    public void printStudentBySpecialization(Specialization specialization){
        for (Specialization spec : studentsMap.keySet()) {
            if (spec == specialization){
                System.out.println("Students in: " + specialization);
                for (Student student : studentsMap.get(spec)){
                    System.out.println(student);
                }
            }
        }
    }

    public void printStudentsById(String ID){
        boolean inSchool = false;
        for (List<Student> students : studentsMap.values()){
            for (Student student : students) {
                if (student.ID.equals(ID)) {
                    inSchool = true;
                    System.out.println(student);
                }
            }

        }
        if (inSchool == false) {
            System.out.println(ID + " not present.");
        }
    }

    public void removeStudentById(String ID) {
        for (List<Student> students : studentsMap.values()){
            for (Student student : students){
                if (student.ID.equals(ID)){
                    students.remove(student);
                    System.out.println(ID + " Student removed");
                    break;
                } else {
                    System.out.println(ID + " not present.");
                }
            }
        }
    }

    public void printAllStudents(){
        for (List<Student> students : studentsMap.values()){
            for (Student s : students){
                System.out.println(s);
            }

        }
    }

}
