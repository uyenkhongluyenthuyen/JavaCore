package chapter10.lesson105;

import java.util.Scanner;

public class lesson105 {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ten SV:");
        String fullName = scanner.nextLine();
        student.setFullName(fullName);
        System.out.println("Nhap diem [0.0-10.0]");
        float grade = Float.parseFloat(scanner.nextLine());
        try {
            student.setAgvGrade(grade);
        } catch (InvalidGradeException e) {
//            e.printStackTrace();
            System.out.println("Da xay ra ngoai le: InvalidGradeException");
            System.out.println("Thong diep: " + e.getInvalidGrade());
        }
        printStudentInfo(student);
    }

    private static void printStudentInfo(Student student) {
        System.out.println(student.getFullName());
        System.out.println(student.getAgvGrade());
    }
}
