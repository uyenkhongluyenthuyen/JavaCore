package chapter5.exercise;

import java.util.Scanner;

public class Lesson51Ex1 {
    public static void main(String[] args) {
        //Bài 1. Viết chương trình cho phép nhập vào một mảng số nguyên gồm n phần tử và tính tổng tất
        //cả các số nguyên tố trong mảng đó. Yêu cầu tự viết các phương thức phù hợp. In kết quả tương
        //ứng ra màn hình.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = getNumbers(n, scanner);
        int sum = 0;
        for (int number : numbers) { //Ctrl + J + iter
            if(isPrime(number)){
                sum += number;
            }
        }
        System.out.println(sum);


    }

    private static boolean isPrime(int number) {
        int bound = (int) Math.sqrt(number);
        boolean isPrime = true;
        if(number < 2 ){
            isPrime = false;
        }
        for (int i = 2; i <= bound; i++) {
            if(number % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }

    static int[] getNumbers(int n, Scanner scanner) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
}
