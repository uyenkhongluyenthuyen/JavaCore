package chapter5.exercise;

import java.util.Scanner;

public class Lesson51Ex8 {
    public static void main(String[] args) {
        //Bài 8. Nhập vào từ bàn phím một số nguyên n > 0, trong đó n là số lượng số nguyên có trong
        //mảng. Yêu cầu tự viết các phương thức phù hợp. Hãy viết chương trình phân tích từng số trong
        //mảng ra thừa số nguyên tố và in kết quả tương ứng ra màn hình.
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        if(n > 0){
            int[] numbers = getNumbers(n, scanner);
            showResult(numbers, n);
        }
    }

    private static void showResult(int[] numbers, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(splitToPrime(numbers[i]));
        }
    }

    private static String splitToPrime(int number) {
        String res = number + " = ";
        int i = 2;
        if(number < 0){
            res += "Không hợp lệ";
        }
        while (number > 1){
            if(number % i == 0){
                res += i;
                if(number != i){ //nếu chưa phải là số nguyên tố cuối cùng
                    res += "*";
                }
                number /= i;
            }else {
                i++;
            }

        }
        return res;
    }

    static int[] getNumbers(int n, Scanner scanner) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
}
