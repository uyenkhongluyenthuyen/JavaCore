package chapter5.exercise;

import java.util.Scanner;

public class Lesson51Ex4 {
    public static void main(String[] args) {
        //Bài 4. Nhập vào một chuỗi kí tự từ bàn phím, chuỗi gồm các từ cách nhau bởi 1 vài khoảng trắng,
        //không có các khoảng trắng ở đầu và cuối chuỗi. Yêu cầu tự viết các phương thức phù hợp. Hãy
        //tách các từ trong chuỗi ra và lưu vào mảng. Sau đó hiển thị kết quả ra màn hình.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        String[] strs = str.split("\\s+");
        int lenght = strs.length;
        for (int i = 0; i < lenght; i++) {
            System.out.println(i +" - "+ strs[i]);
        }
    }
}
