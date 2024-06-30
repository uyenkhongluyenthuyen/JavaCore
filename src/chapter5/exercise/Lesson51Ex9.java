package chapter5.exercise;

import java.util.Scanner;

public class Lesson51Ex9 {
    public static void main(String[] args) {
        //Bài 9. Nhập vào từ bàn phím các phần tử của một mảng số thực, mảng này chứa điểm trung bình
        //của các sinh viên trong một lớp ở hệ 10. Yêu cầu tự viết các phương thức phù hợp. Hãy viết
        //chương trình tính điểm trung bình của cả lớp và in kết quả ra màn hình. Lưu ý chương trình không
        //nhận những giá trị < 0 hoặc > 10.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] grades = getGrades(n, scanner);
        float agv = agvGrades(grades, n);
        System.out.println(agv);
    }

    private static float agvGrades(float[] grades, int n) {
        float sum = 0.0f;
        for (float grade : grades) {
            sum += grade;
        }
        return sum / n;
    }


    private static float[] getGrades(int n, Scanner scanner) {
        float[] grades = new float[n];
        for (int i = 0; i < n; i++) {
            grades[i] = scanner.nextFloat();
        }
        return grades;
    }
}
