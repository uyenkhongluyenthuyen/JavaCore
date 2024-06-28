package chapter3;

import java.util.Scanner;

public class Lesson39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước hình chữ nhật");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        if (m > 0 && n > 0) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Kích thước phải nguyên dương");
        }
    }
}
