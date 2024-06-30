package chapter5.exercise;

import java.util.Scanner;

import static chapter4.Lesson41.isPrime;


public class Lesson51Ex2 {
    public static void main(String[] args) {
        //Bài 2. Nhập vào một số nguyên dương n từ bàn phím. Yêu cầu tự viết các phương thức phù hợp.
        //Hãy tìm n số nguyên tố đầu tiên rồi lưu vào một mảng. Sau đó hiện kết quả ra màn hình các phần
        //tử trong mảng đó.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] primes = getPrimes(n);
        showResult(primes);
    }

    private static void showResult(int[] primes) {
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }

    private static int[] getPrimes(int n) {
        int[] primes = new int[n];
        int count = 0;
        int number = 2;
        while (count < n){
            if(isPrime(number)){
                primes[count] = number;
                count ++;
            }
            number ++;
        }
        return primes;
    }


}
