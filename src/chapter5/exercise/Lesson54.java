package chapter5.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson54 {
    public static void main(String[] args) {
        //Bài 1. Viết chương trình cho phép nhập từ bàn phím một mảng số nguyên gồm n phần tử và một
        //số nguyên x. Hãy tìm xem x có xuất hiện trong mảng không và in kết quả tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] numbers = getNumber(n, scanner);
//        int x = scanner.nextInt();
//        Arrays.sort(numbers);
//        int result = Arrays.binarySearch(numbers, x);
//        System.out.println(result < 0 ? "NO" : "YES");

        //Bài 2. Viết chương trình cho phép nhập từ bàn phím một mảng số nguyên gồm n phần tử và một
        //số nguyên x. Hãy đếm số lần xuất hiện của x trong mảng và in kết quả tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] numbers = getNumber(n, scanner);
//        int x = scanner.nextInt();
//        int result = countX(numbers, x);
//        System.out.println(result);

        //Bài 3. Viết chương trình cho phép nhập từ bàn phím một mảng số nguyên gồm n phần tử và một
        //số nguyên x. Hãy tìm xem x có xuất hiện trong đoạn chỉ số [a, b] của mảng hay không và nếu có
        //thì xuất hiện bao lần, trong đó a và b là hai số nguyên dương nhập từ bàn phím sao cho 0 ≤ a < b.
        //In kết quả tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] numbers = getNumber(n, scanner);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int x = scanner.nextInt();
//        int result = countX(numbers, x, a, b);
//        if(result > 0){
//            System.out.println("YES");
//            System.out.println(result);
//        }else {
//            System.out.println("NO");
//            System.out.println(0);
//        }

        //Bài 4. Viết chương trình cho phép nhập từ bàn phím một mảng số thực gồm n phần tử và một số
        //thực x, trong đó n là số lượng điểm trung bình của sinh viên ở hệ 10 và x > 0. Hãy sắp xếp mảng
        //đó theo chiều tăng dần sử dụng thuật toán quick sort và sử dụng thuật toán binary search để tìm
        //kiếm xem có sinh viên nào có điểm bằng x hay không. Lưu ý chương trình không nhận những giá
        //trị điểm < 0 hoặc > 10. In các kết quả tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        float[] grades = getGrades(n, scanner);
//        float x = scanner.nextFloat();
//
//        Arrays.sort(grades); // sap xep tang dan
//        int index = Arrays.binarySearch(grades, x);
//        showGrades(grades);
//        System.out.println(index < 0 ? "NO" : "YES");

        //Bài 5. Viết chương trình cho phép nhập từ bàn phím một mảng số nguyên gồm n phần tử. Hãy
        //thực hiện các yêu cầu sau và in kết quả tương ứng ra màn hình.
        //Yêu cầu:
        //1. Nửa đầu của mảng sắp xếp theo thứ tự tăng dần và nửa sau của mảng sắp xếp theo thứ
        //tự giảm dần.
        //2. Kiểm tra mảng sau sắp xếp xem có đối xứng hay không. Mảng đối xứng nếu với mọi i từ
        //0 đến n – 1, a[i] = a[n - 1 - i].
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] numbers = getNumber(n, scanner);
//
//        Arrays.sort(numbers, 0, n / 2);
//        sort(numbers);
//        showNumber(numbers);
//        boolean isRevert = isRevert(numbers);
//        System.out.println(isRevert ? "YES" : "NO");

        //Bài 6. Viết chương trình cho phép nhập từ bàn phím một danh sách tên sinh viên gồm n phần tử.
        //Hãy xem với mỗi tên trong danh sách, có bao nhiêu tên sinh viên trùng nhau. In kết quả tương
        //ứng
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        String[] names = getNames(n, scanner);
//        countNames(names);

        //Bài 7. Viết chương trình cho phép nhập từ bàn phím một mảng số nguyên gồm n phần tử. Hãy
        //hiển thị ra màn hình các phần tử trong mảng sao cho mỗi phần tử chỉ xuất hiện duy nhất 1 lần.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] numbers = getNumber(n, scanner);
//        showResult(numbers);

        //Bài 8. Nhập vào một chuỗi kí tự từ bàn phím, chuỗi không được chứa 1 hay nhiều khoảng trắng
        //ở đầu và cuối chuỗi, mỗi từ trong chuỗi cách nhau bằng 1 dấu cách. Hãy viết chương trình đếm
        //số lần xuất hiện của từng kí tự trong chuỗi và in các kết quả tương ứng ra màn hình. Lưu ý không
        //có kí tự khoảng trắng.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        countLetters(str);

    }

    //phuong thức hiển thị số lần xuất hiện của từng kí tự trong str
    private static void countLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(!isExist(str, str.charAt(i), i) && str.charAt(i) != ' '){
                int result = count(str, str.charAt(i));
                System.out.println("\'" + str.charAt(i) + "\' - " + result);
            }
        }
    }

    //phương thức kiê tra xem c đã xuất hiện trong đoạn [0,bound] trong str hay chưa?
    private static boolean isExist(String str, char c, int bound) {
        for (int i = 0; i < bound; i++) {
            if(str.charAt(i) == c){
                return true;
            }
        }
        return false;
    }

    //đếm số lần xuất hiện của kí tự c trong str
    private static int count(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c){
                count++;
            }
        }
        return count;
    }

    //phương thức hiển thị ra màn hình các phần tử duy nhất một lần
    private static void showResult(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            boolean isExist = false;
            for (int j = 0; j < i; j++) {
                if(numbers[j] == numbers[i]){
                    isExist = true;
                    break;
                }
            }
            if(!isExist){
                System.out.print(numbers[i] + " ");
            }
        }
    }

    //phuong thuwcs hiển thị tên và tần số suất hiên
    private static void countNames(String[] names) {
        for (int i = 0; i < names.length; i++) {
            boolean isExist = false; // đánh dấu sv chưa xuất hiện
            for (int j = 0; j < i; j++) {
                //nếu sinh viên xuất hiện rồi
                if (names[j].toLowerCase()
                        .compareTo(names[i].toLowerCase()) == 0) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                int count = numOfExist(names, names[i]);
                System.out.println(names[i] + " - " + count);
            }
        }
    }

    /**
     * đếm tần suất của một tên trong mảng
     *
     * @param names
     * @param key
     * @return
     */
    private static int numOfExist(String[] names, String key) {
        int count = 0;
        for (int i = 0; i < names.length; i++) {
            if (key.toLowerCase().compareTo(names[i].toLowerCase()) == 0) {
                count++;
            }
        }
        return count;
    }


    private static String[] getNames(int n, Scanner scanner) {
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = scanner.next();
        }
        return names;
    }

    //check dối xứng
    private static boolean isRevert(int[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            if (numbers[i] != numbers[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    private static void showNumber(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    //sắp xếp giảm dần nửa sau của  mảng
    private static void sort(int[] numbers) {
        int length = numbers.length;
        for (int i = length / 2; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                if (numbers[j] > numbers[j - 1]) {
                    int x = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = x;
                }
            }
        }
    }

    private static void showGrades(float[] grades) {
        for (float grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }

    private static float[] getGrades(int n, Scanner scanner) {
        float[] grades = new float[n];
        for (int i = 0; i < n; i++) {
            grades[i] = scanner.nextFloat();
            while (grades[i] < 0 || grades[i] > 10) {
                grades[i] = scanner.nextFloat();
            }
        }
        return grades;
    }

    //đếm số phần tử trong đoạn [a,b] 0 ≤ a < b.
    private static int countX(int[] numbers, int x, int fromIndex, int toIndex) {
        int count = 0;
        for (int i = fromIndex; i <= toIndex; i++) {
            // để tránh xảy ra ngoại lệ ta phải đảm bảo chỉ số i
            // nằm trong đoạn [0, length-1]
            if (i >= 0 && i <= numbers.length - 1 && numbers[i] == x) {
                count++; // tăng biến đếm lên 01 đơn vị
            }
        }
        return count;
    }

    //đếm số lần xuất hiện của x trong manảng numbers
    private static int countX(int[] numbers, int x) {
        int count = 0;
        for (int number : numbers) {
            if (number == x) {
                count++;
            }
        }
        return count;
    }

    private static int[] getNumber(int n, Scanner scanner) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
}
