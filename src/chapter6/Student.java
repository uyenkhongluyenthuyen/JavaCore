package chapter6;

public class Student {
    public String studentId;
    public String fullName;
    public float gpa;
    public String email;
    public String address;

    public Student(){

    }

    public Student(String studentId, String fullName) {
        this.studentId = studentId;
        this.fullName = fullName;
    }

    public Student(String studentId, String fullName, float gpa, String email, String address) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.gpa = gpa;
        this.email = email;
        this.address = address;
    }

    public void doHomework(String subject){
        System.out.println(STR."Sinh viên \{fullName} lam bai tập môn \{subject}");
    }

    public void doExam(String subject){
        System.out.println(STR."Sinh vien dang lam kiem tra mon \{subject}");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gpa=" + gpa +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
