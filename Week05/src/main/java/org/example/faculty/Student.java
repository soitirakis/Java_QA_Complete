package org.example.faculty;

public class Student {
    String name;
    String ID;
    Faculty.Specialization specialization;

    public Student () {
    }

    public Student (String name, String ID, String value) {
        this.name = name;
        this.ID = ID;
        for (Faculty.Specialization specialization : Faculty.Specialization.values()) {
            if (specialization.name().equals(value)) {
                this.specialization = Faculty.Specialization.valueOf(specialization.name());
            }
        }
    }

    @Override
    public String toString() {
        return name + ":" + ID + ":" + specialization.name();
    }
}
