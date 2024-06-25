import java.util.Scanner;

public class Lesson37 {
    public static void main(String[] args) {
        //VD1: vẽ hình chữ nhật đặc
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập kích thước hình chữ nhật");
//        int m = scanner.nextInt();
//        int n = scanner.nextInt();
//        if( m > 0 && n > 0){
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < n; j++) {
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            }
//        }else {
//            System.out.println("Kích thước phải nguyên dương");
//        }
        //VD2: ve hinh chữ nhật rỗng
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập kích thước hình chữ nhật");
//        int m = scanner.nextInt();
//        int n = scanner.nextInt();
//        if (m > 0 && n > 0) {
//            for (int i = 1; i <= m; i++) {
//                for (int j = 1; j <= n; j++) {
//                    if (i == 1 || i == m || j == 1 || j == n) {
//                        System.out.print(" * ");
//                    } else {
//                        System.out.print("   "); // 3 khoảng trăng tương đương " * "
//                    }
//
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("Kích thước phải nguyên dương");
//        }
        //VD3: vẽ tam giác vuông rônỗng
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập chiều cao cho tam giác");
//        int h = scanner.nextInt();
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= i; j++) {
//                    if(j == i || i == h || j ==1){
//                        System.out.print(" * ");
//                    }else{
//                        System.out.print("   ");
//                    }
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("Kích thước phải nguyên dương");
//        }
        //VD4 : tam giac vuong đặc
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập chiều cao cho tam giác");
//        int h = scanner.nextInt();
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            }
//        } else {
//            System.out.println("Kích thước phải nguyên dương");
//        }

        //VD5: ve hình chữ nhật lõi là các dấu - và viên tăng theo chiều số kim đồng hồ từ giá trị x có 2 chữ số nào đó
//        var input = new Scanner(System.in);
//        System.out.println("Giá trị bắt đầu: ");
//        int start = input.nextInt();
//        System.out.println("Chiều cao: ");
//        int width = input.nextInt();
//        System.out.println("Chiều rộng: ");
//        int height = input.nextInt();
//        int counter1 = start;
//        int counter2 = start + width;
//        int counter3 = start + 2 * width + height - 3;
//        int counter4 = start + 2 * (width + height) - 5;
//        for (int i = 1; i <= height; i++) {
//            for (int j = 1; j <= width; j++) {
//                if (i == 1) {
//                    System.out.printf("%3d", counter1++);
//                } else if (j == width) {
//                    System.out.printf("%3d", counter2++);
//                } else if (i == height) {
//                    System.out.printf("%3d", counter3--);
//                } else if (j == 1) {
//                    System.out.printf("%3d", counter4--);
//                } else {
//                    System.out.printf("%3s", "-");
//                }
//            }
//            System.out.println();
//        }


        //BÀI TẬP THỰC HÀNH
        //Bài 1. Nhập vào từ bàn phím một số nguyên dương m. Hãy vẽ hình vuông rỗng cạnh m với các
        //đường chéo chính và phụ. Hình vẽ được thể hiện bằng các kí tự *. In hình vuông tương ứng ra
        //màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int m = scanner.nextInt();
//        if (m > 0) {
//            for (int i = 1 ; i <= m ; i++) {
//                for (int j = 1; j <= m; j++) {
//                    if(i == 1 || i == m || j == 1 || j ==m || j==i || i + j == m +1 ){
//                        System.out.print(" * ");
//                    }else {
//                        System.out.print("   ");
//                    }
//                }
//                System.out.println();
//            }
//        }

        //Bài 2. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác vuông góc phải dưới
        //với độ dài 2 cạnh góc vuông bằng h. Hình vẽ được thể hiện bằng các kí tự *. In hình tam giác
        //vuông tương ứng ra màn hình.1
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        for (int i = 1; i <= h; i++) {
//            for (int j = 1; j <= h; j++) {
//                if (j <= h - i) {
//                    System.out.print("   ");
//                }else {
//                    System.out.print(" * ");
//                }
//            }
//            System.out.println();
//        }

        //Bài 3. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác vuông góc trái dưới
        //với độ dài 2 cạnh góc vuông bằng h. Hình vẽ được thể hiện bằng các kí tự *. In hình tam giác
        //vuông tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            }
//        }

        //Bài 4. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác vuông góc trái trên
        //với độ dài 2 cạnh góc vuông bằng h. Hình vẽ được thể hiện bằng các kí tự *. In hình tam giác
        //vuông tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        if(h > 0){
//            for (int i = 0; i <h ; i++) {
//                for (int j = 1; j <= h - i ; j++) {
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            }
//        }

        //Bài 5. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác vuông góc phải trên
        //với độ dài 2 cạnh góc vuông bằng h. Hình vẽ được thể hiện bằng các kí tự *. In hình tam giác
        //vuông tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j <= h; j++) {
//                    if(j >= i){
//                        System.out.print(" * ");
//                    }else{
//                        System.out.print("   ");
//                    }
//                }
//                System.out.println();
//            }
//        }

        //Bài 6. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác cân đặc với chiều cao
        //bằng h. Hình vẽ được thể hiện bằng các kí tự *. In hình tam giác cân tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j < h*2 ; j++) {
//                    if(j > h - i && j < h + i){
//                        System.out.print(" * ");
//                    }else {
//                        System.out.print("   ");
//                    }
//                }
//                System.out.println();
//            }
//        }

        //Bài 7. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác cân rỗng với chiều
        //cao bằng h. Hình vẽ được thể hiện bằng các kí tự *. In hình tam giác cân tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j < h*2 ; j++) {
//                    if(j == h - i + 1 || j == h + i - 1 || i == h){
//                        System.out.print(" * ");
//                    }else {
//                        System.out.print("   ");
//                    }
//                }
//                System.out.println();
//            }
//        }

        //Bài 8. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác số đối xứng với chiều
        //cao bằng h. Hình vẽ được thể hiện bằng các chữ số 1, 2, ..., h. In hình tam giác cân tương ứng ra
        //màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        if (h > 0) {
//            for (int i = 1; i <= h; i++) {
//                for (int j = 1; j < h * 2; j++) {
//                    if (j >= h - i + 1 && j <= h + i - 1) {
//                        System.out.print(STR." \{i - Math.abs(h - j)} ");
//                    } else {
//                        System.out.print("   ");
//                    }
//                }
//                System.out.println();
//            }
//        }

        //Bài 9. Nhập vào hai số nguyên dương a và b từ bàn phím, trong đó a < b. Hãy viết chương trình
        //liệt kê các số chính phương trong đoạn [a, b] và in kết quả ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        for (int i = a; i <= b ; i++) {
//            if(isSquareNumber(i)){
//                System.out.print(i+", ");
//            }
//
//        }
        //Bài 10. Nhập vào từ bàn phím một số nguyên dương n, trong đó 2 ≤ n ≤ 9. Hãy viết chương
        //trình liệt kê các số thuận nghịch có n chữ số và in kết quả các số đó ra màn hình.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        var from = (long) Math.pow(10, n - 1);
        var to = (long) Math.pow(10, n) - 1;
        int count = 0; // đếm phần tử trong 1 dòng 
        for (long i = from; i <= to; i++) {
            if(isBeautyNumber(i)){
                System.out.print(i);
                if(i != to){
                    System.out.print(", ");
                }
                count ++;
            }

            if(count == 10){
                System.out.println();
                count =0;
            }
        }


    }

    //    private static boolean isSquareNumber(int m){
//        var sqrtNum = Math.sqrt(m);
//        return (sqrtNum - Math.floor(sqrtNum) == 0);
//    }
    private static boolean isBeautyNumber(long m) {
        long n = m;
        long rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return m == rev;
    }

}

