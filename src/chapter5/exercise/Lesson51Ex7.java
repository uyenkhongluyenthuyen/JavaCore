package chapter5.exercise;

import java.util.Scanner;

public class Lesson51Ex7 {
    public static void main(String[] args) {
        //Bài 7. Nhập vào một số nguyên dương n từ bàn phím, trong đó n là số lượng các đầu điểm trung
        //bình của sinh viên ở hệ 4. Yêu cầu tự viết các phương thức phù hợp. Hãy viết chương trình phân
        //loại sinh viên dựa trên các tiêu chí sau và in kết quả ra màn hình.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] gpas = getGpas(n, scanner);
        showResult(gpas, n);
    }

    private static void showResult(float[] gpas, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(STR."SV \{i}: \{gpas[i]} => \{getType(gpas[i])}");
        }

    }

    private static String getType(float gpa) {
        String type = "";
        if (gpa < 2.0f) {
            type = "Trượt";
        } else if (gpa < 2.5f) {
            type = "Yếu";
        } else if (gpa < 3.0f) {
            type ="TB";
        } else if (gpa < 3.2f) {
            type = "Khá";
        } else if (gpa < 3.6f) {
            type = "Giỏi";
        }else {
            type = "Xuất xác";
        }
        return type;
    }

    private static float[] getGpas(int n, Scanner scanner) {
        float[] gpas = new float[n];
        for (int i = 0; i < n; i++) {
            gpas[i] = scanner.nextFloat();
        }
        return gpas;
    }
}
