package chapter5.exercise;

import java.util.Scanner;

public class Lesson56 {
    public static void main(String[] args) {
        //Bài 1. Tính tổng các số thực với số lượng tùy ý nhập vào từ bàn phím.
        //- Input: gồm nhiều dòng:
        //  o Dòng đầu là số lượng bộ test 1 <= t <= 100.
        //  o T dòng tiếp theo mỗi dòng gồm nhiều số thực cách nhau bằng 1 vài khoảng trắng.
        //- Output: kết quả mỗi bộ test hiển thị trên 1 với định dạng Test k: kết_quả.

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        for (int i = 0; i < n; i++) {
//            String line = scanner.nextLine();
//            double[] numbers = toDoubleArray(line.split("\\s+"));
//            double sum = add(numbers);
//            System.out.println(STR."Test \{i}: \{sum}");
//        }

        //Bài 2. Tính tổng các số nguyên tố trong tập hợp với số lượng phần tử tùy ý nhập vào từ bàn phím.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        for (int i = 0; i < n; i++) {
//            String line = scanner.nextLine();
//            int[] numbers = toIntegerArray(line.split("\\s+"));
//            int sum = add(numbers);
//            System.out.println(STR."Test \{i}: \{sum}");
//        }

        //Bài 3. Liệt kê các số nguyên tố trong tập hợp với số lượng phần tử tùy ý nhập vào từ bàn phím.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        for (int i = 0; i < n; i++) {
//            String line = scanner.nextLine();
//            int[] numbers = toIntegerArray(line.split("\\s+"));
//            System.out.println("Test " + i +": ");
//            listPrime(numbers);
//            System.out.println();
//        }

        //Bài 4. Đếm số lần xuất hiện của các số nguyên trong tập hợp với số lượng phần tử tùy ý nhập vào
        //từ bàn phím.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        for (int i = 0; i < n; i++) {
//            String line = scanner.nextLine();
//            int[] numbers = toIntegerArray(line.split("\\s+"));
//            System.out.println("Test " + (i + 1) +": ");
//            count(numbers);
//            System.out.println();
//        }

        //Bài 5. Đếm số từ trong câu nhập vào từ bàn phím. Các từ phân tách nhau bởi khoảng trắng.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        for (int i = 0; i < n; i++) {
//            String line = scanner.nextLine();
//            String[] words = line.split("\\s+");
//            System.out.println(STR."Test \{i + 1}:\n \{words.length}");
//        }

        //Bài 6. Kiểm tra mã màu. Mã màu bắt đầu với dấu # sau đó là 3 kí tự hoặc 6 kí tự là sự kết hợp của
        //0-9, a, b, c, d, e, f, A, B, C, D, E, F. Các mã màu được nhập vào từ bàn phím, phân tách nhau bởi
        //một vài khoảng trắng. Liệt kê ra các mã màu không hợp lệ.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] colors = line.split("\\s+");
            System.out.println(STR."Test \{i + 1}:");
            showResult(colors);
        }
    }

    //liệt kê các mã màu ko hợp lệ
    private static void showResult(String... colors) {
        for (String color : colors) {
            if(containInvalidCharacter(color)){
                System.out.print(color + " ");
            }
        }
    }

    //kểm tra xem color có thỏa mãn ko
    private static boolean containInvalidCharacter(String color) {
        if(color.length() != 4 && color.length() != 7){
            return true;
        }
        if(color.charAt(0) != '#'){
            return true;
        }
        String check = color.toLowerCase();
        char[] characters = check.toCharArray();
        for (int i = 1; i < characters.length; i++) {
            char c = characters[i];
            if (c < '0' || c > '9' && (c < 'a' || c > 'f')) {
                return true;
            }
        }
        return false;
    }

    //đếm tần suất xuất hiện của mỗi số trong mảng numbers
    private static void count(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if(!isExist(numbers[i], i, numbers)){
                int count = 0;
                System.out.print(STR."\{numbers[i]}: ");
                for (int number : numbers) {
                    if(number == numbers[i]){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }

    private static boolean isExist(int x, int pos, int... numbers) {
        for (int j = 0; j < pos; j++) {
            if(x == numbers[j]){
                return  true;
            }
        }
        return false;
    }

    private static void listPrime(int... numbers) {
        for (int number : numbers) {
            if(isPrime(number)){
                System.out.print(number + " ");
            }
        }
    }

    //tinh tổng các số nguyên tố
    private static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            if(isPrime(number)){
                sum += number;
            }
        }
        return sum;
    }

    private static boolean isPrime(int number) {
        int bound = (int) Math.sqrt(number);
        if(number < 2){
            return false;
        }
        for (int i = 2; i <= bound; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    private static int[] toIntegerArray(String... strings) {
        int[] numbers = new int[strings.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }
        return numbers;
    }

    private static double add(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    //chuyển đổi mảng kí tự sang số
    private static double[] toDoubleArray(String... strings) {
        double[] numbers = new double[strings.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Double.parseDouble(strings[i]);
        }
        return numbers;
    }
}
