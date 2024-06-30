package chapter5.exercise;

import java.util.Scanner;


public class Lesson53 {
    public static void main(String[] args) {
        //Bài 1. Viết chương trình cho phép nhập vào một mảng số nguyên gồm n phần tử và sắp xếp mảng
        //này theo thứ tự giam dần. Yêu cầu tự viết các phương thức phù hợp. In kết quả của mảng trước
        //và sau khi sắp xếp ra màn hình.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = getNumbers(n, scanner);
        bulbleSort(numbers);
        showNumbers(numbers);

        //Bài 2. Nhập vào từ bàn phím các phần tử của một mảng số thực, mảng này chứa điểm trung bình
        //của các sinh viên trong một lớp ở hệ 10. Hãy viết chương trình sắp xếp các điểm trung bình trong
        //mảng theo thứ tự giảm dần. Lưu ý chương trình không nhận những giá trị điểm < 0 hoặc > 10. In
        //mảng trước và sau khi sắp xếp ra màn hình.

    }


    //in ra màn hình mảng số
    private static void showNumbers(int[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    //sắp xếp giảm dần
    private static void bulbleSort(int[] numbers) {
        int lenght = numbers.length;
        for (int i = 0; i < lenght - 1; i++) {
            for (int j = lenght - 1; j > i; j--) {
                if(numbers[j] > numbers[j - 1]){
                    int x = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = x;
                }
            }
        }
    }

    //lấy ra mảng sô nhập từ bàn phím
    private static int[] getNumbers(int n, Scanner scanner) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
}
