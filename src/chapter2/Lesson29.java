package chapter2;

import java.time.LocalDateTime;

public class Lesson29 {
    public static void main(String[] args) {
        //1, dinh dang so nguyen
//        var number = 9999999999L;
//        // in ra số nguyên:
//        System.out.println("Giá trị gốc: ");
//        var result = String.format("%d", number);
//        System.out.println(result);
//        System.out.printf("%d%n", number);
//
//        // dành 10 vị trí in ra số nguyên number
//        System.out.printf("%10d%n", number);
//        System.out.printf("%-10d%n", number); // căn lề trái
//
//        // in ra có dấu
//        System.out.printf("%+d%n", number);
//
//        // in ra có phân tách phần nghìn
//        System.out.printf("%,+-15d%n", number);
//
//        // in ra số nguyên ở dạng biểu diễn cơ số 8, 16, mã băm
//        System.out.println("Chuyển đổi sang hệ cơ số 8, 16, hash code");
//        System.out.printf("Hệ 8: %o%n", number);
//        System.out.printf("Hệ 16: %x%n", number);
//        System.out.printf("Hệ 16: %X%n", number); // viết hoa
//        System.out.printf("Hash code: %h%n", number);
//        System.out.printf("Hash code: %H%n", number); // mã băm cơ số 16 viết hoa

        //2. Định dạng số nguyên
//        var number = 3.1415926;
//        // in ra giá trị gốc:
//        System.out.printf("Giá trị gốc: %f\n", number);
//
//        // làm tròn số và căn lề
//        System.out.printf("Làm tròn đến 2 chữ số: %10.2f\n", number);
//        System.out.printf("Làm tròn đến 3 chữ số: %-10.3f\n", number);
//
//        // sử dụng biểu diễn khoa học cho số thực:
//        System.out.printf("%e%n", number);
//        var result = String.format("%E", number);
//        System.out.println(result);

        //3. Định dan chuỗi ký tự
//        var fullName = "Họ và tên";
//        var address = "Địa chỉ";
//        var gpa = "Điểm GPA";
//
//        var result = String.format("%-35s%-30s%-15s", fullName, address, gpa);
//        System.out.println(result);
//        System.out.printf("%-35s%-30s%-15.2f\n", "Nguyễn Thị Thu Uyên", "Thái Bình", 3.66);
//        System.out.printf("%-35s%-30s%-15.2f\n", "Đào Minh Quang", "Hải Dương", 4.677);
//        System.out.printf("%-35s%-30s%-15.2f\n", "Nguyễn Thị Thu Hiền", "Thái Bình", 3.03);

        //4. Định dang thời gian
        var currentTime = LocalDateTime.now();
        System.out.printf("Năm: %ty\n", currentTime);
        System.out.printf("Năm: %tY\n", currentTime);
        System.out.printf("Tháng: %tb\n", currentTime);
        System.out.printf("Tháng: %tB\n", currentTime);
        System.out.printf("Ngày: %td\n", currentTime);
        System.out.printf("Ngày: %tD\n", currentTime);
        System.out.printf("Giờ: %tH\n", currentTime);
        System.out.printf("Phút: %tM\n", currentTime);
        System.out.printf("Giây: %tS\n", currentTime);
        System.out.printf("Mili Giây: %tL\n", currentTime);

        System.out.printf("%td %tm %tY %tH-%tM-%tS-%tL", currentTime,currentTime,currentTime,currentTime,
                currentTime,currentTime,currentTime);

    }
}
