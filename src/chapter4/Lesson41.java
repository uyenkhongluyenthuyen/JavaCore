package chapter4;

import java.util.Scanner;

public class Lesson41 {
    public static void main(String[] args) {
        //PHƯƠNG THỨC - METHODS
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số nguyên n: ");
//        int n = scanner.nextInt();
////        var result = (isPrime(n)) ? "Là số nguyên tố" : "Không là so nguyên tố";
////        System.out.println("n có phải số nguyên tố không ? " + result);
//        var result = isRevert(n) ? "n là số đẹp " : "n không phải số đẹp";
//        System.out.println(result);

        //BÀI TẬP THỰC HÀNH
        //Bài 1. Nhập vào một thông điệp từ bàn phím. Hãy viết phương thức để thực hiện chức năng đảo
        //ngược thông điệp đã nhập và in ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        getStringRevese(str);

        //Bài 2. Nhập vào một số nguyên dương n từ bàn phím. Hãy viết phương thức để kiểm tra xem n
        //có phải là số thuận nghịch hay không và in kết quả tương ứng ra màn hình.
        //Chú thích: số thuận nghịch hay số đẹp là số đọc từ trái sang phải hay từ phải sang trái đều cho
        //cùng một giá trị.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        var result = (isRevert(n)) ? "YES" : "NO";
//        System.out.println(result);

        //Bài 3. Nhập vào ba số thực a, b và c từ bàn phím. Hãy viết phương thức tìm giá trị lớn nhất trong
        //ba số a, b và c. In kết quả tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        double c = scanner.nextDouble();
//        double max = getMaxNum(a, b, c);
//        System.out.println(max);

        //Bài 4. Nhập vào ba số thực a, b và c từ bàn phím. Hãy viết phương thức tìm giá trị nhỏ nhất trong
        //ba số a, b và c. In kết quả tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        double c = scanner.nextDouble();
//        double min = getMinNum(a, b, c);
//        System.out.println(min);

        //Bài 5. Nhập vào ba số thực a, b và c từ bàn phím. Hãy viết phương thức tìm trung bình cộng của
        //ba số a, b và c. In kết quả tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        double c = scanner.nextDouble();
//        double agv = getAgvNum(a, b, c);
//        DecimalFormat decimalFormat = new DecimalFormat("####.##");
//        System.out.printf(decimalFormat.format(agv));

        //Bài 6. Nhập vào từ bàn phím một số nguyên dương n. Hãy viết phương thức tìm chữ số đầu tiên
        //của n. In kết quả ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int firstNum = getFirstNumber(n);
//        System.out.println(firstNum);

        //Bài 7. Nhập vào từ bàn phím một số nguyên dương n. Hãy viết phương thức tính tổng các chữ số
        //của n. In kết quả ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int sumDigit = sumDigit(n);
//        System.out.println(sumDigit);

        //Bài 8. Nhập vào hai số nguyên a và b từ bàn phím, trong đó a > 0 và b > 0. Hãy viết phương thức
        //tìm ước chung lớn nhất của hai số a và b. In kết quả ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        if (a > 0 && b > 0){
//            gcd(a,b);
//        }

        //Bài 9. Nhập vào một chuỗi kí tự từ bàn phím. Hãy viết phương thức chuẩn hóa chuỗi vừa nhập
        //sao cho không có 1 hay nhiều dấu cách ở đầu và cuối câu, mỗi từ cách nhau 1 dấu cách. Sau đó
        //viết thêm phương thức đếm xem trong chuỗi vừa nhập có bao nhiêu từ và in kết quả số lượng ra
        //màn hình.
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine().trim();
//        str = str.replaceAll("\\s+", " ");
//        int words = countWords(str);
//        System.out.println(words);

        //Bài 10. Nhập vào một câu tiếng anh từ bàn phím. Hãy viết phương thức chuẩn hóa chuỗi vừa
        //nhập sao cho không có 1 hay nhiều dấu cách ở đầu và cuối câu, mỗi từ cách nhau 1 dấu cách. Sau
        //đó viết thêm phương thức để đếm xem có bao nhiêu kí tự là nguyên âm trong câu đó và in ra
        //màn hình kết quả tương ứng.
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine().trim();
//        str = str.replaceAll("\\s+", " ");
//        int count = countVowl(str.toLowerCase());
//        System.out.println(count);

        //Bài 11. Nhập vào từ bàn phím một số nguyên dương m. Hãy viết phương thức vẽ ra màn hình
        //hình vuông rỗng cạnh m với các đường chéo chính và phụ. Hình vẽ được thể hiện bằng các kí tự
        //*.
//        Scanner scanner = new Scanner(System.in);
//        int m = scanner.nextInt();
//        if (m > 0) {
//            drawEmtySquare(m);
//        }

        //Bài 12. Nhập vào từ bàn phím một số nguyên dương h. Hãy viết phương thức vẽ ra màn hình
        //hình tam giác vuông góc phải dưới với độ dài 2 cạnh góc vuông bằng h. Hình vẽ được thể hiện
        //bằng các kí tự *.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        if (h > 1) {
//            drawRightTriangle(h);
//        }

        //Bài 13. Nhập vào từ bàn phím một số nguyên dương h. Hãy viết phương thức vẽ ra màn hình
        //hình tam giác vuông góc trái dưới với độ dài 2 cạnh góc vuông bằng h. Hình vẽ được thể hiện
        //bằng các kí tự *.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        if (h > 1) {
//            drawLeftTriangle(h);
//        }

        //Bài 14. Nhập vào từ bàn phím một số nguyên dương h. Hãy viết phương thức vẽ ra màn hình
        //hình tam giác vuông góc trái trên với độ dài 2 cạnh góc vuông bằng h. Hình vẽ được thể hiện bằng
        //các kí tự *.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        if (h > 1) {
//            drawLeftAboveTriangle(h);
//        }

        //Bài 15. Nhập vào từ bàn phím một số nguyên dương h. Hãy viết phương thức vẽ ra màn hình
        //hình tam giác vuông góc phải trên với độ dài 2 cạnh góc vuông bằng h. Hình vẽ được thể hiện
        //bằng các kí tự *.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        if (h > 1) {
//            drawRightAboveTriangle(h);
//        }

        //Bài 16. Nhập vào từ bàn phím một số nguyên dương h. Hãy viết phương thức vẽ ra màn hình
        //hình tam giác cân đặc với chiều cao bằng h. Hình vẽ được thể hiện bằng các kí tự *.isosceles triangle
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        if (h > 1) {
//            drawIsoscelesTriangle(h);
//        }

        //Bài 17. Nhập vào từ bàn phím một số nguyên dương h. Hãy viết phương thức vẽ ra màn hình
        //hình tam giác cân rỗng với chiều cao bằng h. Hình vẽ được thể hiện bằng các kí tự *. In hình tam
        //giác cân tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        if (h > 1) {
//            drawEmtyIsoscelesTriangle(h);
//        }

        //Bài 18. Nhập vào từ bàn phím một số nguyên dương h. Hãy viết phương thức vẽ ra màn hình
        //hình tam giác số đối xứng với chiều cao bằng h. Hình vẽ được thể hiện bằng các chữ số 1, 2, ..., h.
        //In hình tam giác cân tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        if (h > 1) {
//            drawNumberIsoscelesTriangle(h);
//        }

        //Bài 19. Nhập vào hai số nguyên dương a và b từ bàn phím, trong đó a < b. Hãy viết phương
        //thức liệt kê các số chính phương trong đoạn [a, b] và in kết quả ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        listedSquareNumber(a, b);

        //Bài 21. Nhập vào từ bàn phím một số nguyên n, trong đó n > 0. Hãy viết chương trình sử dụng
        //các phương thức để liệt kê các số nguyên có n chữ số thỏa mãn 3 điều kiện sau dưới đây. In các
        //đáp án thỏa mãn ra màn hình.
        //Điều kiện:
        //1. Là số thuận nghịch.
        //2. Không chứa chữ số 8.
        //3. Tổng các chữ số chia hết cho 9.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int lowBound = (int) Math.pow(10, n - 1);
        int heightBound = (int) Math.pow(10, n) -1;
        if (n > 0) {
            for (int i = lowBound; i <= heightBound; i++) {
                if (isRevert(i) && !isContain8(i) && isDivBy9(i)) {
                    System.out.print(i + " ");
                }
            }
        }

    }

    //kiểm tra tổng các chữ số có chia hết cho 9 không
    private static boolean isDivBy9(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return (sum % 9) == 0;
    }

    //kiểm tra sô có chứ sô 8 không?
    private static boolean isContain8(int n) {
        boolean result = false;
        while (n > 0) {
            int i = n % 10;
            if(i == 8){
                result = true;
                break;
            }
            n /= 10;
        }
        return result;
    }

    private static void listedSquareNumber(int a, int b) {
        int lowBound = (int) Math.sqrt(a);
        int heightBound = (int) Math.sqrt(b);
        for (int i = lowBound; i <= heightBound; i++) {
            System.out.print(i * i);
            if (i != heightBound) {
                System.out.print(", ");
            }
        }
    }


    private static void drawNumberIsoscelesTriangle(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h * 2 - 1; j++) {
                if (j > h - i && j < h + i) {
                    System.out.print(" " + (i - Math.abs(h - j)) + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    private static void drawEmtyIsoscelesTriangle(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h * 2 - 1; j++) {
                if (j == h - i + 1 || j == h + i - 1 || i == h) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    private static void drawIsoscelesTriangle(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h * 2 - 1; j++) {
                if (j > h - i && j < h + i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    private static void drawRightAboveTriangle(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h; j++) {
                if (j <= i) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    private static void drawLeftAboveTriangle(int h) {
        for (int i = h; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    private static void drawLeftTriangle(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    private static void drawRightTriangle(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h; j++) {
                if (j > h - i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    private static void drawEmtySquare(int m) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == m || j == 1 || j == m || i == j || (i + j) == m + 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    private static int countVowl(String str) {
        int count = 0;
        int sizeStr = str.length();
        for (int i = 0; i < sizeStr; i++) {
            if (str.charAt(i) == 'u' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'a' ||
                    str.charAt(i) == 'i') {
                count++;
            }
        }
        return count;
    }

    private static int countWords(String str) {
        int lenghtStr = str.length();
        int count = 0;
        if (!str.isEmpty()) {
            count++;
        }
        for (int i = 0; i < lenghtStr; i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    private static void gcd(int a, int b) {
        while (a != b) {
            if (a >= b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println(a);
    }

    private static int sumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    private static int getFirstNumber(int n) {
        while (n > 10) {
            n /= 10;
        }
        return n;
    }

    private static double getAgvNum(double a, double b, double c) {
        double sum = a + b + c;
        return sum / 3;
    }

    private static double getMinNum(double a, double b, double c) {
        double min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    //tìm max trong ba số
    private static double getMaxNum(double a, double b, double c) {
        double max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    private static void getStringRevese(String str) {
        int lengtStr = str.length();
        for (int i = lengtStr - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    /**
     * phương tức kiếm tra n có phải số đẹp hay không ?
     *
     * @param n là tham số cần kiểm tra ở kiểu nguyên
     * @return true : là số đẹp; false: không là số đẹp
     */
    private static boolean isRevert(int n) {
        var rev = 0;
        var m = n;
        while (m > 0) {
            rev = rev * 10 + m % 10;
            m /= 10;
        }
        return rev == n;
    }

    /**
     * phương thức kiếm tra một số n có phải là số nguyên tố hay không ?
     *
     * @param n là giá trị cần kiểm tra
     * @return true: nếu n là số nguyên tố, false nếu n không phải số nguyên tố
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int bound = (int) Math.sqrt(n);
        for (int i = 2; i <= bound; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
