package chapter6;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lesson610 {
    public static void main(String[] args) throws IOException {
//        File file = new File("input.txt");  //tạo file ở trong thư mục gôc luôn
//        if(file.createNewFile()){
//            System.out.println("tạo thành công");
//        }else {
//            System.out.println("Tạo thất bại");
//        }

        File inputFile = new File("input.txt");
        Scanner scanner = new Scanner(inputFile);
        ArrayList<Student2> students = new ArrayList<>();
        readStudentFromFile(scanner, students);
        scanner.close();
        showStudentsInfo(students);

    }

    private static void showStudentsInfo(ArrayList<Student2> students) {
        System.out.println("================THÔNG TIN SINH VIÊN=====================");
        System.out.printf("%-25s%-25s%-25s%-10s%-10s\n","Họ tên", "Địa chỉ", "Email", "Điểm GPA", "Tuổi");
        for (Student2 s : students) {
            showStudent(s);
        }
    }

    private static void showStudent(Student2 s) {
        System.out.printf("%-25s%-25s%-25s%-10.2f%-10d\n",
                s.getFullName(), s.getAddress(), s.getEmail(),s.getGpa() , s.getAge());
    }

    /**
     * the method reads student from file
     * @param scanner
     * @param students
     */
    private static void readStudentFromFile(Scanner scanner, ArrayList<Student2> students) {
        while (scanner.hasNextLine()){
            int age = scanner.nextInt();
            scanner.nextLine();
            String address = scanner.nextLine();
            String fullName = scanner.nextLine();
            String email = scanner.nextLine();
            float gpa = scanner.nextFloat();
            Student2 student = new Student2(fullName, address, email, gpa, age);
            students.add(student);
        }
    }
}

class Student2{
    private String fullName;
    private String address;
    private String email;
    private float gpa;
    private int age;

    public Student2() {
    }

    public Student2(String fullName, String address, String email, float gpa, int age) {
        this.setFullName(fullName);
        this.setAddress(address);
        this.setEmail(email);
        this.setGpa(gpa);
        this.setAge(age);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}