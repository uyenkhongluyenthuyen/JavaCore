package chapter6.lesson612;

public class Student {
    private String studentId;
    private String fullName;
    private String address;
    private String major;
    private float gpa;

    public Student() {
    }

    public Student(String studentId, String fullName,
                   String address, String major, float gpa) {
        this.setStudentId(studentId);
        this.setFullName(fullName);
        this.setAddress(address);
        this.setMajor(major);
        this.setGpa(gpa);
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
