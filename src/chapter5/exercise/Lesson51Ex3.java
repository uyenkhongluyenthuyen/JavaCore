package chapter5.exercise;

import java.util.Scanner;



public class Lesson51Ex3 {
    public static void main(String[] args) {
        //Bài 3. Nhập vào một số nguyên dương n từ bàn phím, n là số lượng phần tử của một mảng. Yêu
        //cầu tự viết các phương thức phù hợp. Hãy kiểm tra mảng đó có đối xứng hay không. Sau đó in
        //kết quả tương ứng ra màn hình.
        //Chú thích: mảng đối xứng là mảng thỏa mãn a[i] = a[n – 1 – i].
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = Lesson51Ex1.getNumbers(n, scanner);
        System.out.println(isRevert(numbers) ? "YES" : "NO");
    }

    private static boolean isRevert(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            if(numbers[i] != numbers[n - 1 - i]){
                return false;
            }
        }
        return true;
    }

}
