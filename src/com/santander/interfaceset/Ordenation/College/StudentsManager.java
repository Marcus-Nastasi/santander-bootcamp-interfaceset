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

    public void showAll() throws RuntimeException {
        if(this.studentSet.isEmpty()) throw new RuntimeException("Students list empty.");
        for(Student s: this.studentSet) System.out.println(s);
    }

    public Set<Student> searchByName(String name) throws RuntimeException {
        if(this.studentSet.isEmpty()) throw new RuntimeException("Students list empty.");
        Set<Student> findedByName = new HashSet<>();
        for(Student s: this.studentSet) if(s.getName().startsWith(name)) findedByName.add(s);
        return findedByName;
    }

    public Set<Student> searchByGradeRange(double start, double finish) throws RuntimeException {
        if(this.studentSet.isEmpty()) throw new RuntimeException("Students list empty.");
        Set<Student> findedByGradeRange = new HashSet<>();
        for(Student s: this.studentSet) if(s.getGrade() >= start && s.getGrade() <= finish) findedByGradeRange.add(s);
        return findedByGradeRange;
    }
}


