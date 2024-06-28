import java.util.Scanner;

public class Lesson42 {
    public static void main(String[] args) {
        /*
        viet phương thức nạp chồng tính tổng hai số
        các kiểu cần hỗ trợ là: int, long, float, double
                System.out.println(add(1, 2));
                System.out.println(add(333888888l, 222333l));
                System.out.println(add(1.35f, 1.45));
        Viết phương thức tìm giá trị lớn nhất trong 3 số
                System.out.println("finMax(1,5,2)=" + findMax(1,5,2));
                System.out.println("finMax(1,5,2)=" + findMax(111111l,5,2));
        BÀI TẬP THỰC HÀNH
        Bài 1. Nhập vào hai số a và b từ bàn phím. Tự xác định kiểu, tên phương thức và tên các tham số
        phù hợp. Hãy viết các phương thức nạp chồng thực hiện chức năng tính tích 2 số đó và in ra màn
        hình kết quả tương ứng.
        Các kiểu cần hỗ trợ (tương ứng với 4 phương thức):
        1. Phương thức nhận vào hai tham số kiểu int.
        2. Phương thức nhận vào hai tham số kiểu long.
        3. Phương thức nhận vào hai tham số kiểu float.
        4. Phương thức nhận vào hai tham số kiểu double.
                Scanner scanner = new Scanner(System.in);
                var a = scanner.nextInt();
                var b = scanner.nextInt();
                System.out.println(mul(a,b));
        Bài 2. Nhập vào hai số a và b từ bàn phím. Tự xác định kiểu, tên phương thức và tên các tham số
        phù hợp. Hãy viết các phương thức nạp chồng thực hiện chức năng tính trung bình cộng 2 số đó
        và in ra màn hình kết quả tương ứng.
                Scanner scanner = new Scanner(System.in);
                var a = scanner.nextFloat();
                var b = scanner.nextFloat();
                System.out.println(agv(a, b));
        Bài 3. Nhập vào ba số a, b và c từ bàn phím. Tự xác định kiểu, tên phương thức và tên các tham
        số phù hợp. Hãy viết các phương thức nạp chồng thực hiện chức năng tìm giá trị nhỏ nhất trong
        3 số đó và in ra màn hình kết quả tương ứng.
                Scanner scanner = new Scanner(System.in);
                var a = scanner.nextFloat();
                var b = scanner.nextFloat();
                var c = scanner.nextFloat();
                System.out.println(findMin(a, b, c));
        Bài 4. Nhập vào ba số a, b và c từ bàn phím. Tự xác định kiểu, tên phương thức và tên các tham
        số phù hợp. Hãy viết các phương thức nạp chồng thực hiện chức năng tìm giá trị lớn nhất trong
        3 số đó và in ra màn hình kết quả tương ứng.
                Scanner scanner = new Scanner(System.in);
                var a = scanner.nextFloat();
                var b = scanner.nextFloat();
                var c = scanner.nextFloat();
                System.out.println(findMax(a, b, c));
        Bài 5. Nhập vào hai số a và b từ bàn phím. Tự xác định kiểu, tên phương thức và tên các tham số
        phù hợp. Hãy viết các phương thức nạp chồng thực hiện chức năng hiển thị tổng của hai số ra
        màn hình.
        Các kiểu cần hỗ trợ (tương ứng với 9 phương thức):
                var input = new Scanner(System.in);

                // 1. gọi phương thức 1 tham số kiểu String:
                var str1 = input.nextLine();
                var a1 = input.nextInt();
                var b1 = input.nextInt();
                showResult(str1 + " = " + (a1 + b1));

                input.nextLine(); // Đọc bỏ kí tự thừa

                // 2. gọi phương thức 2 tham số kiểu String và int:
                var str2 = input.nextLine();
                var a2 = input.nextInt();
                var b2 = input.nextInt();
                showResult(str2, a2 + b2);

                input.nextLine(); // Đọc bỏ kí tự thừa

                // 3. gọi phương thức 2 tham số kiểu String và float:
                var str3 = input.nextLine();
                var a3 = input.nextFloat();
                var b3 = input.nextFloat();
                showResult(str3, a3 + b3);

                input.nextLine(); // Đọc bỏ kí tự thừa

                // 4. gọi phương thức 2 tham số kiểu String và long:
                var str4 = input.nextLine();
                var a4 = input.nextLong();
                var b4 = input.nextLong();
                showResult(str4, a4 + b4);

                input.nextLine(); // Đọc bỏ kí tự thừa

                // 5. gọi phương thức 2 tham số kiểu String và double:
                var str5 = input.nextLine();
                var a5 = input.nextDouble();
                var b5 = input.nextDouble();
                showResult(str5, a5 + b5);

                input.nextLine(); // Đọc bỏ kí tự thừa

                // 6. gọi phương thức 4 tham số kiểu String, int, int, int:
                var str6 = input.nextLine();
                var a6 = input.nextInt();
                var b6 = input.nextInt();
                var c6 = a6 + b6;
                showResult(str6, a6, b6, c6);

                input.nextLine(); // Đọc bỏ kí tự thừa

                // 7. gọi phương thức 4 tham số kiểu String, long, long, long:
                var str7 = input.nextLine();
                var a7 = input.nextLong();
                var b7 = input.nextLong();
                var c7 = a7 + b7;
                showResult(str7, a7, b7, c7);

                input.nextLine(); // Đọc bỏ kí tự thừa

                // 8. gọi phương thức 4 tham số kiểu String, float, float, float:
                var str8 = input.nextLine();
                var a8 = input.nextFloat();
                var b8 = input.nextFloat();
                var c8 = a8 + b8;
                showResult(str8, a8, b8, c8);

                input.nextLine(); // Đọc bỏ kí tự thừa

                // 9. gọi phương thức 4 tham số kiểu String, double, double, double:
                var str9 = input.nextLine();
                var a9 = input.nextDouble();
                var b9 = input.nextDouble();
                var c9 = a9 + b9;
                showResult(str9, a9, b9, c9);
        Bài 6. Nhập vào tối đa 2 số nguyên dương từ bàn phím. Tự xác định kiểu, tên phương thức và tên
        các tham số phù hợp. Hãy viết các phương thức nạp chồng thực hiện chức năng vẽ hình chữ nhật
        đặc và các biến thể của nó bằng các dấu * ra màn hình.
        Các kiểu cần hỗ trợ (tương ứng với 3 phương thức):
                Scanner scanner = new Scanner(System.in);

                //1. Phương thức mặc định không tham số vẽ hình vuông kích thước 5 x 5.
                drawRectangle();

                //2. Phương thức nhận 1 tham số kiểu int vẽ hình vuông với kích thước cho trong tham số.
                int n = scanner.nextInt();
                drawRectangle(n);

                //3. Phương thức nhận 2 tham số kiểu int vẽ hình chữ nhật với kích thước dài x rộng cho trong
                int n3 = scanner.nextInt();
                int m3 = scanner.nextInt();
                drawRectangle(n3, m3);
        Bài 7. Nhập vào 1 số nguyên hoặc 1 chuỗi kí tự từ bàn phím. Tự xác định kiểu, tên phương thức
        và tên các tham số phù hợp. Hãy viết các phương thức nạp chồng thực hiện chức năng đếm số kí
        tự của một số hoặc chuỗi đầu vào và in ra màn hình kết quả tương ứng.
        Các kiểu cần hỗ trợ (tương ứng với 3 phương thức):
                Scanner scanner = new Scanner(System.in);
        1. Phương thức nhận vào một số kiểu int.
                int n = scanner.nextInt();
                int count1 = lenght(n);
                System.out.println(count1);

                //2. Phương thức nhận vào một số kiểu long.
                long n2 = scanner.nextLong();
                System.out.println(lenght(n2));
        3. Phương thức nhận vào một String.
                scanner.nextLine();
                String str = scanner.nextLine();
                System.out.println(lenght(str));
        Bài 8. Nhập vào tối đa 1 số nguyên dương và 1 kí tự từ bàn phím. Tự xác định kiểu, tên phương
        thức và tên các tham số phù hợp. Hãy viết các phương thức nạp chồng thực hiện chức năng vẽ
        tam giác cân đặc và các biến thể của nó bằng các dấu * ra màn hình.
        Các kiểu cần hỗ trợ (tương ứng với 3 phương thức):

        */
        Scanner scanner = new Scanner(System.in);
        //1. Phương thức không tham số vẽ hình tam giác cân đặc bằng các dấu * chiều cao h = 5.
//        drawTriangle();
        //2. Phương thức nhận 1 tham số kiểu char vẽ tam giác cân đặc chiều cao h = 5 bằng 1 kí tự
        //char cho trong tham số.
//        drawTriangle('3');
        //3. hai tham số, một là chiều cao , hai là kí tự câ vẽ
        drawTriangle(4, 'e');

    }

    /**
     * Phương thức nạp chồng vẽ hình tam giác cân
     */
    //1. Phương thức không tham số vẽ hình tam giác cân đặc bằng các dấu * chiều cao h = 5.
    private static void drawTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 10; j++) {
                if (j >= 5 - i + 1 && j <= 5 + i - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    //2. Phương thức nhận 1 tham số kiểu char vẽ tam giác cân đặc chiều cao h = 5 bằng 1 kí tự
    //char cho trong tham số.
    private static void drawTriangle(char c) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 10; j++) {
                if (j >= 5 - i + 1 && j <= 5 + i - 1) {
                    System.out.print(" " + c + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    // 3.
    private static void drawTriangle(int h, char c) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < h * 2; j++) {
                if (j >= h - i + 1 && j <= h + i - 1) {
                    System.out.print(" " + c + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }


    /**
     * Phương thức nạp chồng đếm số lượng ki tự từ một chuỗi
     *
     * @param n : có the là chuỗi , số nguyên kiểu int hoặc long
     * @return số lượng kí tự
     */
    //1. Phương thức nhận vào một số kiểu int.
    public static int lenght(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    //2. Phương thức nhận vào một số kiểu long.
    public static int lenght(long n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    //3. Phương thức nhận vào một String.
    public static int lenght(String str) {
        return str.length();
    }

    /**
     * Phương thức nạp chồng vẽ hình chữ nhật
     */
    //1. Phương thức mặc định không tham số vẽ hình vuông kích thước 5 x 5.
    public static void drawRectangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //2. Phương thức nhận 1 tham số kiểu int vẽ hình vuông với kích thước cho trong tham số.
    public static void drawRectangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //3. Phương thức nhận 2 tham số kiểu int vẽ hình chữ nhật với kích thước dài x rộng cho trong
    public static void drawRectangle(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    /**
     * Bài 5:
     *
     * @param result
     */
    // 1. Phương thức nhận vào 1 tham số: String.
    public static void showResult(String result) {
        System.out.println(result);
    }

    // 2. Phương thức nhận vào 2 tham số: String và int.
    public static void showResult(String msg, int result) {
        System.out.println(msg + " = " + result);
    }

    // 3. Phương thức nhận vào 2 tham số: String và float.
    public static void showResult(String msg, float result) {
        System.out.println(msg + " = " + result);
    }

    // 4. Phương thức nhận vào 2 tham số: String và long.
    public static void showResult(String msg, long result) {
        System.out.println(msg + " = " + result);
    }

    // 5. Phương thức nhận vào 2 tham số: String và double.
    public static void showResult(String msg, double result) {
        System.out.println(msg + " = " + result);
    }

    // 6. Phương thức nhận vào 4 tham số: String, int, int, int.
    public static void showResult(String msg, int a, int b, int result) {
        System.out.println(msg + a + " + " + b + " = " + result);
    }

    // 7. Phương thức nhận vào 4 tham số: String, long, long, long.
    public static void showResult(String msg, long a, long b, long result) {
        System.out.println(msg + a + " + " + b + " = " + result);
    }

    // 8. Phương thức nhận vào 4 tham số: String, float, float, float.
    public static void showResult(String msg, float a, float b, float result) {
        System.out.println(msg + a + " + " + b + " = " + result);
    }

    // 9. Phương thức nhận vào 4 tham số: String, double, double, double.
    public static void showResult(String msg, double a, double b, double result) {
        System.out.println(msg + a + " + " + b + " = " + result);
    }

    /**
     * Phương thức nạp chông tìm giá trị nhỏ nhất trong 3 số
     *
     * @param a
     * @param b
     * @param c
     * @return giá trị nhỏ nhất của a, b, c
     */
    private static int findMin(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    private static long findMin(long a, long b, long c) {
        long min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    private static float findMin(float a, float b, float c) {
        float min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    private static double findMin(double a, double b, double c) {
        double min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    /**
     * Phương thức nạp chông tính trung bình cộng hai số
     *
     * @param a
     * @param b
     * @return
     */
    private static double agv(int a, int b) {
        return (a + b) * 0.5;
    }

    private static double agv(long a, long b) {
        return (a + b) * 0.5;
    }

    private static double agv(float a, float b) {
        return (a + b) * 0.5;
    }

    private static double agv(double a, double b) {
        return (a + b) * 0.5;
    }

    //Phương thức nạp chồng tính tích giá trị của hai số
    public static int mul(int a, int b) {
        return a * b;
    }

    public static long mul(long a, long b) {
        return a * b;
    }

    public static float mul(float a, float b) {
        return a * b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    /**
     * Phương thức tìm giá trị lớn nhất trong ba số
     *
     * @param a số thứ nhâ
     * @param b
     * @param c
     * @return giá trị max trong ba số
     */
    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static long findMax(long a, long b, long c) {
        var max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static float findMax(float a, float b, float c) {
        var max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static double findMax(double a, double b, double c) {
        var max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    /**
     * Phương thức nạp chồng tinhs tổng hai sô
     *
     * @param a sô thứ nhất
     * @param b số thứ hai
     * @return tổng hai sô
     */
    public static int add(int a, int b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
