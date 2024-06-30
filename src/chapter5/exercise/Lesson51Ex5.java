package chapter5.exercise;

import java.util.Scanner;

public class Lesson51Ex5 {
    public static void main(String[] args) {
        //Bài 5. Nhập vào một chuỗi kí tự từ bàn phím, chuỗi kí tự không chứa 1 hay nhiều dấu cách ở đầu
        //và cuối chuỗi. Yêu cầu tự viết các phương thức phù hợp. Hãy tách các từ trong chuỗi ra và in theo
        //thứ tự ngược lại. Sau đó hiển thị kết quả ra màn hình.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        String strs[] = str.split("\\s+");
        printRevert(strs);
    }

    private static void printRevert(String[] strs) {
        int length = strs.length;
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(strs[i] + " ");
        }
    }
}
