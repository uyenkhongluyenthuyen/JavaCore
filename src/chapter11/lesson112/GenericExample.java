package chapter11.lesson112;

import java.util.ArrayList;

public class GenericExample {
    public static void main(String[] args) {
        // dùng kiểu generic ArrayList<T> để lưu các giá trị kiểu String
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Nhung");
        friends.add("Linh");
        friends.add("Khánh");
        friends.add("Loan");

        // dùng kiểu generic ArrayList<T> để lưu giá trị số thực:
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(1.25);
        doubles.add(3.12456);
        doubles.add(6.1454);
        doubles.add(99.899);

        // dùng kiểu generic ArrayList<T> lưu các đối tượng của lớp Student
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("B25DCCN100", "Ngô Thùy Linh"));
        students.add(new Student("B25DCCN101", "Nguyễn Phương Hoa"));
        students.add(new Student("B25DCCN102", "Trần Xuân Nhật"));
        students.add(new Student("B25DCCN103", "Lê Hoài Nam"));

        //...
        showInfo(students);
    }

    /**
     * phương thức dùng để hiển thị danh sách các phần tử kiểu T nào đó
     *
     * @param list danh sách cần hiển thị ra màn hình
     * @param <T>  kiểu của các phần tử trong danh sách
     */
    private static <T> void showInfo(ArrayList<T> list) {
        System.out.println("==========================================");
        for (var e : list) {
            System.out.println(e);
        }
    }
}


class Student {
    private String studentId;
    private String fullName;
    private String email;
    private float avgGrade;

    public Student() {
    }

    public Student(String studentId, String fullName) {
        this.studentId = studentId;
        this.fullName = fullName;
    }

    public Student(String studentId, String fullName,
                   String email, float avgGrade) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.email = email;
        this.avgGrade = avgGrade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(float avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
