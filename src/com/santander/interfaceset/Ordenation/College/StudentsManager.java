package com.santander.interfaceset.Ordenation.College;

import java.util.HashSet;
import java.util.Set;

public class StudentsManager {

    private final Set<Student> studentSet = new HashSet<>();

    public StudentsManager() {}

    public void addStudent(String name, int id, double grade) {
        this.studentSet.add(new Student(name, id, grade));
    }

    public void removeStudent(Student student) {
        this.studentSet.remove(student);
    }

    public Set<Student> searchByName(String name) {
        if(this.studentSet.isEmpty()) throw new RuntimeException("Students list empty.");
    }
}
