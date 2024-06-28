package chapter3;

import java.util.Scanner;

public class Lesson38 {
    public static void main(String[] args) {
        //VD1: in giá trị đau tiên chia hết cho k trong đoạn [a,b]
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào hai số nguyên a < b");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println("Nhập vào số nguyên k khác 0:");
//        int k = scanner.nextInt();
//        if( k ==0){
//            System.out.println("Nhập k khác 0 ");
//        }else {
//            for (int i = a; i <=b ; i++) {
//                if( i % k == 0){
//                    System.out.println("Giá trị đầu tiên thỏa mãn: " + i);
//                    break; // thoát khỏi vòng lặp gần nhất chứ break;
//                }
//            }
//        }

        //VD2: Liệt kê các giá trị trong đoan a,b thỏa mãn chia hết cho k ( k khác 0)
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập hai số nguyên a < b");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        System.out.println("Nhập vào s k khác 0:");
//        int k = scanner.nextInt();
//        if (k != 0) {
//            for (int i = a; i <= b; i++) {
//                if (i % k != 0) {
//                    continue; // bỏ qua các câu lênh dưới, mà không thoát khỏi vòng lặp for
//                }
//                System.out.print(i + " ");
//            }
//        } else {
//            System.out.println("Nhập k khác 0!");
//        }

        //Bài 1. Nhập vào từ bàn phím một số nguyên dương n. Hãy tìm ước số của n thỏa mãn hai điều
        //kiện là ước số nhỏ nhất và là số nguyên tố. In kết quả tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if( n > 0){
//            for (int i = 2; i <=n ; i++) {
//                boolean isPrime = true;
//                if(n % i != 0){
//                    continue;
//                }
//                int bound = (int) Math.sqrt(i);
//                for (int j = 2; j <= bound ; j++) {
//                    if(i % j == 0){
//                        isPrime = false;
//                        break;
//                    }
//                }
//                if(isPrime){
//                    System.out.println(i);
//                    break;
//                }
//            }
//        }else {
//            System.out.println("Nhập số n nguyên dương");
//        }

        //BÀI TẬP THỰC HÀNH
        //Bài 2. Nhập vào từ bàn phím một số nguyên dương n. Hãy tìm ước số của n thỏa mãn hai điều
        //kiện là ước số lớn nhất và là số nguyên tố. In kết quả tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if( n > 0){
//            for (int i = n; i >=2 ; i--) {
//                boolean isPrime = true;
//                if(n % i != 0){
//                    continue;
//                }
//                int bound = (int) Math.sqrt(i);
//                for (int j = 2; j <= bound ; j++) {
//                    if(i % j == 0){
//                        isPrime = false;
//                        break;
//                    }
//                }
//                if(isPrime){
//                    System.out.println(i);
//                    break;
//                }
//            }
//        }else {
//            System.out.println("Nhập số n nguyên dương");
//        }

        //Bài 3. Nhập vào từ bàn phím một số nguyên dương N. Hãy viết chương trình tìm số nguyên dương
        //n nhỏ nhất để thõa mãn bất đẳng thức S phía dưới. In kết quả của n ra màn hình.
        //S = 1 + 2 + 3 + ⋯ + n ≥ N
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int n = 0;
//        int i = 1;
//        while (num >= 0) {
//            num -= i;
//            i++;
//        }
//        System.out.println(i-1);

        //cach 2:
//        int N = scanner.nextInt();
//        int sum =0;
//        int i = 1;
//        while (true){
//            sum += i;
//            if(sum >= N){
//                break;
//            }
//            i++;
//        }
//        System.out.println(i);

        //Bài 4. Nhập vào 3 giá trị nguyên a, b, k từ bàn phím, trong đó 0 < a < b và k != 0. Hãy tìm số chính
        //phương đầu tiên chia hết cho k trong đoạn [a, b] và in kết quả tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int k = scanner.nextInt();
//        for (int i = a; i <=b ; i++) {
//            if(i % k != 0){
//                continue;
//            }
//            int sqrtNum = (int) Math.sqrt(i);
//            if( sqrtNum * sqrtNum == i){
//                System.out.println(i);
//                break;
//            }
//        }
//        if (k != 0) { // thực hiện tiếp
//            var lowBound = (int) Math.ceil(Math.sqrt(a));
//            var heightBound = (int) Math.floor(Math.sqrt(b));
//            for (int i = lowBound; i <= heightBound; i++) {
//                if (i * i % k == 0) {
//                    System.out.println((i * i));
//                    break;
//                }
//            }
//        }

        //Bài 5. Nhập vào hai số tự nhiên k và m từ bàn phím, trong đó k và m là các số tự nhiên dương giá
        //trị không quá 1000. Hãy viết chương trình tìm k số đầu tiên có 5 chữ số mà tổng các chữ số chia
        //hết cho m. In kết quả ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int k = scanner.nextInt();
//        int m = scanner.nextInt();
//        int lowBound = 10000;
//        int hightBound = 99999;
//        int count = 0;
//        StringBuilder result = new StringBuilder();
//        for (int i = lowBound; i <= hightBound ; i++) {
//            if(sumNumber(i) % m == 0){
//                count ++;
//                result.append(i + ", ");
//                if(count == k){
//                    break;
//                }
//            }
//        }
//        //xóa dấu phẩy và khoảng trắng cuôi
//        if(result.length() > 0){
//            result.setLength(result.length() - 2);
//        }
//        System.out.println(result);

        //Bài 6. Hãy viết chương trình cho phép nhập liên tục các giá trị số nguyên từ bàn phím. Việc đọc
        //vào sẽ dừng khi người dùng nhập vào số nguyên tố bất kỳ đầu tiên. Hãy in giá trị của số nguyên
        //tố đã nhập lên màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int num = 0;
//        while (true){
//            num = scanner.nextInt();
//            if(isPrime(num)){
//                System.out.println(num);
//                break;
//            }
//        }

        //Bài 7*. Nhập vào từ bàn phím 3 giá trị d, m và y, trong đó d là ngày của tháng, m là tháng của
        //năm và y là năm. Dựa trên dự kiện ngày, tháng, năm vừa nhập hãy tìm xem hôm đó là thứ mấy.
        //In kết quả tương ứng ra màn hình.
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int y = scanner.nextInt();

        //kiểm tra tính hợp lệ của dữ liệu nhập vào
        if (isValidDate(d, m, y)) {
            //tính toán kết quả
            String dayOfWeek = getDayOfWeek(d, m, y);
            System.out.println(dayOfWeek);
        }else {
            System.out.println("INVALID DATE");
        }

    }

    //hàm tính tổng các chữ số của một sôs
    private static int sumNumber(int m) {
        int sum = 0;
        while (m > 0) {
            sum += m % 10;
            m /= 10;
        }
        return sum;
    }

    private static boolean isPrime(int m) {
        boolean isPrime = true;
        if (m < 2) {
            return false;
        }
        int bound = (int) Math.sqrt(m);
        for (int i = 2; i <= bound; i++) {
            if (m % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    //kiểm tra tính hợp lệ của ngày tháng năm
    private static boolean isValidDate(int day, int month, int year) {
        //kiểm tra năm hợp lệ
        if (year < 1) {
            return false;
        }
        // kiểm tra tháng hợp lệ
        if (month < 1 || month > 12) {
            return false;
        }
        //kiểm tra ngày hợp lệ
        if (day < 1 || day > getDaysInMonth(month, year)) {
            return false;
        }
        return true;
    }

    //tính số ngày trong tháng month năm year
    private static int getDaysInMonth(int month, int year) {
        if (month == 2) {
            //nếu là năm nhuận thì 29 ngày
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 8 || month == 10 || month == 12) {
            return 30;
        } else {
            return 31;
        }
    }

    //kiểm tra năm nhuận
    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return false;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 400 == 0) {
            return false;
        } else {
            return true;
        }
    }

    //Lấy tên của thứ trong tuần
    private static String getDayOfWeek(int day, int month, int year) {
        String[] daysOfWeek = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ 7"};
        int dayOfWeekIndex = getDayOfWeekIndex(day, month, year);
        return daysOfWeek[dayOfWeekIndex];
    }
    //tính thứ của một ngày trong tuần
    //0: chủ nhật ; 1 : thứ hai ,...., 6: thứ 7
    private static int getDayOfWeekIndex(int day, int month, int year) {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 3) {
            year--;
        }
        return (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;
    }

}
