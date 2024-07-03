package chapter5.example;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson54 {
    public static void main(String[] args) {
        //VD1: Tìm kiếm  tuyến tính linerSearch
//        int[] numbers = {9, 8, 5, 2, 3, 1, 0, 4, 7, 8, 9, 100, 7};
//        System.out.println("Mảng gốc ban đầu: ");
//        showArray(numbers);
//        System.out.println("Nhập giá trị cần tìm: ");
//        var x = new Scanner(System.in).nextInt();
//        int index = linearSearch(numbers, x);
//        var result = index == -1 ? "Không tồn tại x"
//                : "Tìm thấy x tại vị trí " + index;
//        System.out.println(result);

        //VD2: tìm kiếm nhị phân binarySearch
        int[] numbers = {9, 8, 5, 2, 3, 1, 0, 4, 7, 8, 9, 100, 7};
        Arrays.sort(numbers);
        System.out.println("Mảng gốc ban đầu: ");
        showArray(numbers);
        System.out.println("Nhập giá trị cần tìm: ");
        var x = new Scanner(System.in).nextInt();
        int index = Arrays.binarySearch(numbers, 0, 5, x);
        var result = index < 0 ? "Không tồn tại x"
                : "Tìm thấy x tại vị trí " + index;
        System.out.println(result);
    }

    /**
     * Phương thư tìm kiếm tuyến tính
     * @param numbers
     * @param x
     * @return index nếu true , -1 nếu không tìm thấy
     */
    private static int linearSearch(int[] numbers, int x) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == x) {
                return i;
            }
        }
        return -1;
    }

    private static void showArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
