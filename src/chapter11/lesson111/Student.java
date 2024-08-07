package chapter11.lesson111;

public class Student implements Comparable{
    private String id;
    private String fullName;

    public Student() {
    }

    public Student(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
