package chapter6.lesson612;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Lesson612 {
    public static final String FILE_NAME = "input.txt";

    public static void main(String[] args) throws IOException {
        // tạo arraylist để chứa danh sách sinh viên
        ArrayList<Student> students = new ArrayList<>();
        // gọi method đọc file
        readStudentFromFile(students);

        showStudentInfo(students); // hiển thị thông tin lên màn hình

        System.out.println("==> Nhập thông tin sinh viên mới: ");
        addNewStudent(students);

        System.out.println("Danh sách sinh viên sau khi thêm mới: ");
        showStudentInfo(students);

        // ghi danh sách sinh viên ra file
        saveDataToFile(students);
    }

    private static void saveDataToFile(ArrayList<Student> students) throws FileNotFoundException {
        File file = new File(FILE_NAME);
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(file, true));
        for (Student s : students) {

            printWriter.println(STR."\{s.getStudentId()}, \{s.getFullName()}, \{s.getAddress()}, "
            + STR."\{s.getMajor()}, \{s.getGpa()}");
        }
        printWriter.close();
    }

    private static void addNewStudent(ArrayList<Student> students) {
        Scanner keyboardReader = new Scanner(System.in);
        System.out.println("Mã SV: ");
        var studentId = keyboardReader.nextLine().trim().toUpperCase();
        System.out.println("Họ và tên: ");
        var fullName = keyboardReader.nextLine();
        System.out.println("Địa chỉ(thành phố): ");
        var address = keyboardReader.nextLine();
        System.out.println("Chuyên ngành: ");
        var major = keyboardReader.nextLine();
        System.out.println("Điểm gpa: ");
        var gpa = keyboardReader.nextFloat();
        var student = new Student(studentId, fullName, address, major, gpa);
        students.add(student);
    }

    /**
     * Phương thức đọc ra thông tin sinh viên trong file.
     *
     * @param students danh sách sinh viên đọc được
     */
    private static void readStudentFromFile(ArrayList<Student> students) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            String[] data = scanner.nextLine().split(",");
            if(data.length > 0){
                float gpa = Float.parseFloat(data[4]);
                students.add(new Student(data[0], data[1], data[2], data[3], gpa));
            }
        }
        scanner.close();
    }

    /**
     * Phương thức hiển thị thông tin sinh viên dạng bảng.
     *
     * @param students danh sách sinh viên cần hiển thị.
     */
    private static void showStudentInfo(ArrayList<Student> students) {
        var line = "===========================";
        System.out.println(STR."\{line} THÔNG TIN SINH VIÊN \{line}");
        System.out.printf("%-5s%-10s%-25s%-15s%-10s%-10s\n",
                "STT", "Mã SV", "Họ và tên", "Địa chỉ", "C.Ngành", "Điểm gpa");
        var counter = 1;
        for (var student : students) {
            System.out.printf("%-5d%-10s%-25s%-15s%-10s%-10s\n",
                    counter++, student.getStudentId(), student.getFullName(),
                    student.getAddress(), student.getMajor(), student.getGpa());
        }
    }
}