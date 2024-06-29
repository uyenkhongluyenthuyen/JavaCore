package chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Lession45 {
    public static void main(String[] args) {
        //VD1: Tính tổng S = 1 + 2 + ... + n
        //var n = 10;
//        System.out.println("S = " + add(n));

        //VD2: tính n!
//        System.out.println("n! =" + factorial(10));

        //VD3: tìm số fibonaci thứ n
//        System.out.println("Fn = " + fibonaci(2));

        //BÀI TẬP THỰC HÀNH
        //Bài 1. Nhập vào một số nguyên dương n từ bàn phím. Hãy viết phương thức đệ quy thực hiện
        //tính n giai thừa và in kết quả ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if(n > 0){
//            System.out.println(factorial(n));
//        }

        //Bài 2. Nhập vào một số nguyên n từ bàn phím, trong đó n >= 0. Hãy viết phương thức đệ quy
        //thực hiện tìm số fibonacci thứ n, kí hiệu Fn. In kết quả ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if(n >= 0){
//            System.out.println(fibonaci(n));
//        }

        //Bài 3. Nhập vào một số nguyên dương n từ bàn phím. Hãy viết phương thức đệ quy thực hiện
        //tính tổng các chữ số n và in ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if(n > 0){
//            System.out.println(sumDigits(n));
//        }

        //Bài 4. Nhập vào một số nguyên dương n từ bàn phím. Hãy viết phương thức đệ quy thực hiện in
        //ra đảo ngược các chữ số của n.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if (n > 0) {
//            printRevert(n);
//        }

        //Bài 5. Nhập vào một số nguyên dương n từ bàn phím. Hãy viết phương thức đệ quy thực hiện
        //đếm các chữ số của n và in ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if (n > 0) {
//            System.out.println(countDigits(n));
//        }

        //Bài 6. Nhập vào một số nguyên dương n từ bàn phím. Hãy viết phương thức đệ quy thực hiện
        //tìm chữ số đầu tiên của n và in ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if (n > 0) {
//            System.out.println(firstDigit(n));
//        }

        //Bài 7. Nhập vào một chuỗi kí tự từ bàn phím. Hãy viết phương thức đệ quy thực hiện in ngược
        //lại các kí tự của chuỗi vừa nhập ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        int lenght = str.length() - 1;
//        printRevert(str, lenght);

        //Bài 8. Nhập vào hai số nguyên dương a và b từ bàn phím. Hãy viết phương thức đệ quy có chức
        //năng tìm ước chung lớn nhất của a và b. In kết quả tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int result = gcd(a, b);
//        System.out.println(result);

        //Bài 9. Nhập vào một số nguyên dương n từ bàn phím. Hãy viết phương thức đệ quy để tính tổng
        //của biểu thức S sau và in ra màn hình kết quả.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if(n > 0){
//            System.out.println(add(n));
//        }

        //Bài 10. Nhập vào một số nguyên dương n từ bàn phím. Hãy viết phương thức đệ quy để tính tổng
        //của biểu thức S sau và in ra màn hình kết quả.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        DecimalFormat format = new DecimalFormat("####.##");
        if(n > 0){
            System.out.println(format.format(sumS(n)));
        }


    }
    //phương thức tính tổng S = 1 + 1/2 + 1/3 + ... + 1/n
    private static double sumS(int n) {
        if(n == 1){
            return 1;
        }else {
            return 1.0/n + sumS(n - 1);
        }
    }

    //phương thức tìm ước chung của hai số
    private static int gcd(int a, int b) {
        if(a == b){
            return  a;
        }else {
            return (a > b) ? gcd(a -b, b) : gcd(a, b - a);
        }
    }
    // cách 2:
    public static int gcd2(int a, int b) {
        if (b == 0) { // đk dừng
            return a;
        } else { // bước đệ quy
            return gcd2(b, a % b);
        }
    }

    //phương thức in ra chuỗi ngược của str
    public static void printRevert(String str, int lenght){
        if(lenght >= 0){ // điều kiện đệ quy
            System.out.print(str.charAt(lenght));
            printRevert(str, lenght - 1);
        }
    }
    //phương thức lấy ra chữ số đầu tiên của n
    private static int firstDigit(int n) {
        if(n < 10){
            return n;
        }else {
            return firstDigit(n/10);
        }
    }

    //phương thức đếm số chữ số của một số
    private static int countDigits(int n) {
        if(n < 10){
            return 1;
        }else {
            return 1 + countDigits(n/10);
        }
    }

    //phương thức in ra số n đảo ngược
    private static void printRevert(int n) {
        if (n < 10) {
            System.out.print(n);
        } else {
            System.out.print(n % 10);
            printRevert(n /=10);
        }
    }

    //phương thức tính tổng các chữ số n
    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumDigits(n / 10);
        }
    }

    //pt tính số fibonaci thứ n
    private static long fibonaci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonaci(n - 1) + fibonaci(n - 2);
        }
    }

    public static long factorial(int n) {
        if (n < 2) { //trường hợp cơ sở
            return 1;
        } else {// thực hiện lời gọi đệ quy : n-ctbiết cách giải quyết, factorial(n - 1)-ct ko biết nen gọi lại đệ quy
            return n * factorial(n - 1);
        }
    }

    /**
     * Phương thức tính tổng S = 1 + 2 + ... + n để quy
     *
     * @param n
     * @return tổng S
     */
    public static int add(int n) {
        if (n == 1) {  //trường hợp cơ sở
            return 1;
        } else {
            return n + add(n - 1);
        }
    }
}
