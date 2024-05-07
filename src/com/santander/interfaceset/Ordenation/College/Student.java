package com.santander.interfaceset.Ordenation.College;

import java.util.Objects;

public class Student {

    private final String name;
    private final int id;
    private final double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return(
            "Student{" + "name='" + name + '\'' +
            ", id=" + id + ", grade=" + grade + '}'
        );
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }
}

