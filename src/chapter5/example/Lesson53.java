package chapter5.example;

public class Lesson53 {
    public static void main(String[] args) {
        // mảng gốc ban đầu
        int[] numbers = {2, 3, 1, 0, 4, 7, 8, 9, 100, 7};
        System.out.println("Mảng gốc ban đầu: ");
        showArray(numbers);
        // sắp xếp toàn bộ theo thứ tự tăng dần:
        //Arrays.sort(numbers);
        bulbleSort(numbers);
        System.out.println("Mảng sau khi sắp xếp: ");
        showArray(numbers);
    }

    //phương thức sắp xếp nổi bọt
    private static void bulbleSort(int[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = length - 1; j > i; j--) {
                if (numbers[j] < numbers[j - 1]) {
                    int x = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = x;
                }
            }
        }
    }

    private static void showArray(int[] numbers) {
        System.out.println("Các phần tử của mảng là: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // in xuống dòng
    }
}
