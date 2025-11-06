package org.example.faculty;

public class Student {
    String name;
    String numarMatricol;
    Speciality.Specialization specialization;

    public Student () {
    }

    public Student (String name, String numarMatricol, String value) {
        this.name = name;
        this.numarMatricol = numarMatricol;
        for (Speciality.Specialization specialization : Speciality.Specialization.values()) {
            if (specialization.name().equals(value)) {
                this.specialization = specialization;
            }
        }
    }
}
