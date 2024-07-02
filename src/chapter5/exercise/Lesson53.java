package chapter5.exercise;

import java.util.Arrays;
import java.util.Scanner;


public class Lesson53 {
    public static void main(String[] args) {
        //Bài 1. Viết chương trình cho phép nhập vào một mảng số nguyên gồm n phần tử và sắp xếp mảng
        //này theo thứ tự giam dần. Yêu cầu tự viết các phương thức phù hợp. In kết quả của mảng trước
        //và sau khi sắp xếp ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] numbers = getNumbers(n, scanner);
//        bulbleSort(numbers);
//        showNumbers(numbers);

        //Bài 2. Nhập vào từ bàn phím các phần tử của một mảng số thực, mảng này chứa điểm trung bình
        //của các sinh viên trong một lớp ở hệ 10. Hãy viết chương trình sắp xếp các điểm trung bình trong
        //mảng theo thứ tự giảm dần. Lưu ý chương trình không nhận những giá trị điểm < 0 hoặc > 10. In
        //mảng trước và sau khi sắp xếp ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        float[] grades = getGrades(n, scanner);
//        bulbleSort(grades);
//        showNumbers(grades);

        //Bài 3. Viết chương trình cho phép nhập vào một mảng số nguyên gồm n phần tử. Hãy viết chương
        //trình sắp xếp mảng này theo thứ tự tăng dần. Sau đó tìm giá trị lớn thứ hai trong mảng và liệt kê
        //ra tất cả các vị trị của giá trị này trong mảng. In các kết quả tương ứng ra màn hình
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] numbers = getNumbers(n, scanner);
//        sort(numbers);
//        showNumbers(numbers);
//        int secordNumber = findSecord(numbers);
//        System.out.println();
//        showResult(secordNumber, numbers);

        //Bài 4. Viết chương trình cho phép nhập vào một mảng số nguyên gồm n phần tử. Hãy viết chương
        //trình sắp xếp mảng này theo thứ tự giảm dần. Sau đó tìm giá trị nhỏ thứ hai trong mảng và liệt
        //kê ra tất cả các vị trị của giá trị này trong mảng. In các kết quả tương ứng ra màn hình
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] numbers = getNumbers(n, scanner);
//        bulbleSort(numbers);
//        showNumbers(numbers);
//        System.out.println();
//        int min2 = findMin2(numbers);
//        System.out.println(min2);
//        if(min2 == numbers[numbers.length - 1]){
//            System.out.print("Không tồn tại");
//        }else {
//            showMin2(min2, numbers);
//        }

        //Bài 5. Viết chương trình cho phép nhập vào một mảng số nguyên gồm n phần tử. Hãy viết chương
        //trình sắp xếp các phần tử của mảng thõa mãn cả hai yêu cầu sau và in kết quả ra màn hình.
        //Yêu cầu:
        //1. Nửa đầu của mảng sắp xếp theo thứ tự tăng dần.
        //2. Nửa sau của mảng sắp xếp theo thứ tự giảm dần.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] numbers = getNumbers(n, scanner);
//        showNumbers(numbers);
//        Arrays.sort(numbers, 0, n / 2);
//        sort2(numbers);
//        System.out.println();
//        showNumbers(numbers);

        //Bài 6. Nhập vào từ bàn phím một chuỗi kí tự, mỗi từ trong chuỗi cách nhau 1 dấu cách, chuỗi
        //không được chứa 1 hay nhiều khoảng trắng ở đầu và cuối chuỗi. Hãy viết chương trình tách các
        //từ của chuỗi đó ra và sắp xếp theo thứ tự từ a-z.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        String[] words = str.split("\\s+");
        sortWords(words);
        showResult(words);

        //Bài 7. Nhập vào từ bàn phím một chuỗi kí tự, mỗi từ trong chuỗi cách nhau 1 dấu cách, chuỗi
        //không được chứa 1 hay nhiều khoảng trắng ở đầu và cuối chuỗi. Hãy viết chương trình tách các
        //từ của chuỗi đó ra và sắp xếp theo thứ tự từ z-a.
        //c1: lấy kết quả từ câu 6, in ra ngược lại
        //c2: viết lại hàm sắp xếp words[j].compareTo(words[j - 1]) > 0
        System.out.println();
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]+ " ");
        }

    }

    //hiển thị chuỗi sau khi được sắp xếp
    private static void showResult(String[] words) {
        for (String word : words) {
            System.out.print(word+ " ");
        }
    }

    //sắp xếp các từ theo a-z
    private static void sortWords(String[] words) {
        int length = words.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = length - 1; j > i ; j--) {
                if(words[j].compareTo(words[j - 1]) < 0){
                    String str = words[j];
                    words[j] = words[j - 1];
                    words[j - 1] = str;
                }
            }
        }
    }

    //giam dần nửa sau
    private static void sort2(int[] numbers) {
        int n = numbers.length;
        for (int i = n / 2; i < n; i++) {
            for (int j = n -1 ; j > i ; j--) {
                if (numbers[j] > numbers[j - 1]) {
                    int x = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = x;
                }
            }
        }
    }

    private static void showMin2(int min2, int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == min2) {
                System.out.println(i + " ");
            }
        }
    }

    //tìm phần tử nhỏ thứ hai trong mảng đã được sắp xếp giảm dần
    private static int findMin2(int[] numbers) {
        int min = numbers[numbers.length - 1];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] != min) {
                return numbers[i];
            }
        }
        return min;
    }

    //tìm vị trị của các so lớn thứ hai trong mảng
    private static void showResult(int secordNumber, int[] numbers) {
        if (secordNumber == numbers[numbers.length - 1]) {
            System.out.println("Không tồn tại");
        } else {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] == secordNumber) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    //tim ra số lớn thứ hai trong mảng nguyên sau khi sắp xếp tăng dần
    private static int findSecord(int[] numbers) {
        int n = numbers.length;
        int max = numbers[n - 1];
        int secord = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (numbers[i] < max) {
                secord = numbers[i];
                break;
            } else {
                secord = max;
            }
        }

        return secord;
    }

    //sắp xếp tăng dần
    private static void sort(int[] numbers) {
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

    private static void showNumbers(float[] grades) {
        for (float grade : grades) {
            System.out.print(grade + " ");
        }
    }

    //sap xep giam dan so thuc
    private static void bulbleSort(float[] grades) {
        int n = grades.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (grades[j] > grades[j - 1]) {
                    float x = grades[j];
                    grades[j] = grades[j - 1];
                    grades[j - 1] = x;
                }
            }
        }
    }


    //trả về 1  một mảng điểm kiểu float
    private static float[] getGrades(int n, Scanner scanner) {
        float[] grades = new float[n];
        for (int i = 0; i < n; i++) {
            grades[i] = scanner.nextFloat();
            if (grades[i] < 0.0f || grades[i] > 10.0f) {
                grades[i] = scanner.nextFloat();
            }
        }
        return grades;
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
                if (numbers[j] > numbers[j - 1]) {
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
