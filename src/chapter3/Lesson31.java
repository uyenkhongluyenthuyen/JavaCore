package chapter3;

import java.util.Scanner;

public class Lesson31 {
    public static void main(String[] args) {
        //HƯỚNG DẪN
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap so nguyen n");
//        var number = scanner.nextInt();
//
//        //Kiểm tra xem có là số chẵn không
//        if (number % 2 == 0) {
//            System.out.println(STR."\{number} là so chẵn.");
//        }else{
//            System.out.println(STR."\{number} là so lẻ.");
//        }
//        //số âm
//        if (number < 0) {
//            System.out.println(STR."\{number} là số âm.");
//        }else if(number==0){
//            System.out.println(STR."\{number} không là số âm cũng không là số dương.");
//        }else{
//            System.out.println(STR."\{number} là số dương.");
//        }
//        //số chia hết cho k
//        System.out.println("Nhập số nguyên k: ");
//        var k = scanner.nextInt();
//        if (number % k == 0){
//            System.out.println(STR."\{number} chia hết cho \{k}");
//        }else{
//            System.out.println(STR."\{number} không chia hết cho \{k}");
//        }

        //vi du mức học bổng
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap điểm gpa của sinh viên: ");
//        var gpa = scanner.nextFloat();
//        if (gpa > 4.0f || gpa < 0) {
//            System.out.println("Diểm gpa không hợp lệ");
//        } else if (gpa >= 3.6f) {
//            System.out.println("Xuất sắc, 10000k");
//        } else if (gpa >= 3.2f) {
//            System.out.println("Giỏi, 5000k");
//        } else if (gpa >= 3.0f) {
//            System.out.println("Khá, 3500k");
//        } else  {
//            System.out.println("Không đạt học bổng");
//        }


        //VD
//        var scanner = new Scanner(System.in);
//        System.out.println("Họ và tên sinh viên: ");
//        var fullName = scanner.nextLine();
//        System.out.println("Nhập điểm gpa: ");
//        var gpa = scanner.nextFloat();
//
//        // bắt đầu khởi tạo và xét duyệt
//        var level = ""; // loại học bổng
//        int scholarship; // số tiền được thưởng tính theo vnđ
//
//        if (gpa > 4.0f || gpa < 0) {
//            level = "Gpa không hợp lệ";
//            scholarship = 0;
//        } else if (gpa >= 3.6f) { // điều kiện học bổng xuất sắc
//            level = "Xuất sắc";
//            scholarship = 10_000_000;
//        } else if (gpa >= 3.2f) { // điều kiện học bổng giỏi
//            level = "Giỏi";
//            scholarship = 5_000_000;
//        } else if (gpa >= 3.0f) { // điều kiện học bổng khá
//            level = "Khá";
//            scholarship = 3_500_000;
//        } else { // không đạt
//            level = "Không đạt";
//            scholarship = 0;
//        }
//
//        // kết luận
//        if (scholarship > 0) {
//            var numberFormat = new DecimalFormat("#,###");
//            System.out.println(STR."Chúc mừng sinh viên \"\{fullName}\" đã đạt học bổng!");
//            System.out.println(STR."Cấp độ học bổng: \{level}.");
//            System.out.println(STR."Mức thưởng: \{numberFormat.format(scholarship)}đ");
//        } else {
//            System.out.println(STR."Rất tiếc sinh viên \"\{fullName}\" không đạt học bổng.");
//            System.out.println(STR."Lý do: \{level}");
//        }

        //BÀI TẬP THỰC HÀNH
        //Bài 1. Nhập vào hai số nguyên từ bàn phím. Hãy so sánh giá trị của hai số đó và rút ra kết luận
        //tương ứng. In kết quả so sánh ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        if (a == b) {
//            System.out.println(STR."\{a} = \{b}");
//        } else if (a > b) {
//            System.out.println(STR."\{a} > \{b}");
//        } else {
//            System.out.println(STR."\{a} < \{b}");
//        }

        //Bài 2. Nhập vào một số nguyên n từ bàn phím. Hãy kiểm tra số đó chẵn hay lẻ và in kết luận tương
        //ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if (n % 2 == 0) {
//            System.out.println("CHẴN");
//        } else {
//            System.out.println("LẺ");
//        }

        //Bài 3. Nhập vào từ bàn phím ba số thực dương tương ứng với ba cạnh a, b, c của tam giác. Hãy
        //kiểm tra xem ba số đó có lập thành một tam giác được không. In kết quả ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        var a = scanner.nextDouble();
//        var b = scanner.nextDouble();
//        var c = scanner.nextDouble();
//
//        System.out.println(STR."\{a},\{b},\{c}");
//        if (a > 0 && b > 0 && c > 0) {
//            if (a + b > c && a + c > b && b + c > a) {
//                System.out.println("CÓ");
//            }else{
//                System.out.println("KHÔNG");
//            }
//        } else {
//            System.out.println("KHÔNG");
//        }

        //Bài 4: Nhập vào hai chuỗi str1 và str2 từ bàn phím. Hãy so sánh và kết luận mối tương quan(chuỗi
        //đứng trước, đứng sau hay tương đương) của hai chuỗi. Sau đó, in ra màn hình kết quả.
//        Scanner scanner = new Scanner(System.in);
//        var str1 = scanner.nextLine();
//        var str2 = scanner.nextLine();
//
//        var result = str1.compareTo(str2);
//        if (result == 0) {
//            System.out.println(STR."\{str1} tương đương \{str2}");
//        } else if (result < 0) {
//            System.out.println(STR."\{str1} đứng trước \{str2}");
//        } else {
//            System.out.println(STR."\{str1} đứng sau \{str2}");
//        }

        //Bài 5: Nhập vào một chuỗi kí tự từ bàn phím. Hãy kiểm tra chuỗi vừa nhập có bắt đầu bởi một
        //hoặc nhiều khoảng trắng hay không. In kết luận tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        //boolean result = str.startsWith(" ");
//        boolean result = str.matches("^\\s+.*");
//        if(result){
//            System.out.println("YES");
//        }else {
//            System.out.println("NO");
//        }

        //Bài 6. Nhập vào chuỗi họ-đệm-tên dạng không dấu từ bàn phím. Giả định rằng họ-đệm-tên hợp
        //lệ chỉ gồm một dấu cách giữa các từ và các kí tự chữ cái. Hãy kiểm tra xem chuỗi đó có hợp lệ hay
        //không và in ra màn hình kết luận tương ứng. ^[a-zA-Z\\s]+$
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        var result = str.matches("^[a-zA-Z\\s]+$");
//        if(result){
//            System.out.println("HỢP LỆ");
//        }else{
//            System.out.println("KHÔNG HỢP LỆ");
//        }

        //Bài 7. Nhập vào một dòng họ-đệm-tên từ bàn phím. Giả định họ-đệm-tên chỉ phân tách nhau
        //bằng 1 khoảng trắng và viết dưới dạng không dấu. Lưu ý không có 1 hoặc nhiều dấu cách ở đầu
        //và cuối chuỗi. Hãy kiểm tra xem chữ cái đầu tiên của tên có viết hoa hay không. In kết quả ra màn hình.
        // ^[A-Z].*
//        Scanner scanner = new Scanner(System.in);
//        String fullname = scanner.nextLine().trim();
//        var lastIndex = fullname.lastIndexOf(" ");
//        var firstName = fullname.substring(lastIndex + 1);
//
//        if (firstName.matches("^[A-Z].*")) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }

        //Bài 8. Nhập vào một chuỗi kí tự từ bàn phím. Lưu ý không có một hoặc nhiều dấu cách ở đầu và
        //cuối chuỗi. Hãy kiểm tra xem kí tự đầu chuỗi và cuối chuỗi có trùng nhau không. In kết quả ra
        //màn hình.
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine().trim();
//        var startChar = str.charAt(0);
//        var endChar = str.charAt(str.length() - 1);
//        if (startChar == endChar) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }

        //Bài 9. Nhập từ bàn phím thông số hình thang gồm đáy lớn, đáy nhỏ, chiều cao. Sau đó kiểm tra
        //các thông số có hợp lệ hay không(các thông số > 0). Tính toán và in ra màn hình kết quả của
        //diện tích hình thang nếu hợp lệ. Ngược lại in ra INVALID INPUT.
//        Scanner scanner = new Scanner(System.in);
//        var a = scanner.nextDouble();
//        var b = scanner.nextDouble();
//        var h = scanner.nextDouble();
//        if (a > 0 && b > 0 && h > 0) {
//            var s = (a + b) * h / 2;
//            System.out.println(s);
//        } else {
//            System.out.println("INVALID INPUT");
//        }

        //Bài 10*. Viết chương trình giải phương trình bậc 2 có dạng ax^2 + bx + c = 0.
        //Trong đó a, b, c là các tham số và x là nghiệm của phương trình.
        //Hãy kiểm tra các điều kiện của của các tham số để
        //tìm các trường hợp tương ứng, mỗi trường hợp sẽ có các nghiệm x khác nhau.
        // In kết quả các nghiệm ra màn hình.
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextDouble();
        var b = scanner.nextDouble();
        var c = scanner.nextDouble();
        if (a != 0) {
            var detal = b * b - 4 * a * c;
            if (detal < 0) {
                System.out.println("VÔ NGHIỆM");
            } else if (detal == 0) {
                var x = -b / (2 * a);
                System.out.println(STR."x = \{x}");
            } else {
                var x1 = (-b + Math.sqrt(detal)) / (2 * a);
                var x2 = (-b - Math.sqrt(detal)) / (2 * a);
                System.out.println(STR."x1 = \{x1}, x2 = \{x2}");
            }
        } else {
            if (b != 0) {
                System.out.println("x = " + (-c / b));
            }else if (c == 0){
                System.out.println("VÔ SỐ NGIỆM");
            }else {
                System.out.println("VÔ NGHIỆM");
            }
        }
    }
}
