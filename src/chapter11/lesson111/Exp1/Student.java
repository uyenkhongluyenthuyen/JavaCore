package chapter11.lesson111.Exp1;

import java.util.Objects;

public class Student implements  Comparable<Student>{
    private String id;
    private String fullName;
    private float agvGrade;

    public Student() {
    }

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String fullName, float agvGrade) {
        this.id = id;
        this.fullName = fullName;
        this.agvGrade = agvGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", agvGrade=" + agvGrade +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.id.compareToIgnoreCase(o.getId());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getAgvGrade() {
        return agvGrade;
    }

    public void setAgvGrade(float agvGrade) {
        this.agvGrade = agvGrade;
    }
}
