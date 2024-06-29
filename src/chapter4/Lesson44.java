package chapter4;

import java.util.Scanner;

public class Lesson44 {
    public static void main(String[] args) {
        //VD1: swtich expression
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số thứ tự ngày của tuần (1-7):");
//        int index = scanner.nextInt();
//        System.out.println(dayOfWeek2(index));
        //VD2:
//        var question = "Logo hình quả táo cắn dở là hãng của công nghệ nào ? ";
//        var ans ="A. Apple\nB. Samsung\nC. Huawei\nD. Oppo\n";
//        System.out.println(question);
//        System.out.println(ans);
//        System.out.println("câu trả lời của bạn là: ");
//        var input = new Scanner(System.in);
//        char choice = input.next().charAt(0);
//        String result = switch (choice){
//            case 'a', 'A' -> "Chính xác!";
//            case 'b', 'B', 'c', 'C', 'd',  'D' -> "Sai rồi";
//            default -> "Nhập A, B, C, D !";
//        };
//        String result = switch (choice){
//            case 'a', 'A': yield  "Chính xác!";
//            case 'b', 'B', 'c', 'C', 'd',  'D': yield  "Sai rồi";
//            default: yield  "Nhập A, B, C, D !";
//        };
//        System.out.println(result);

        //BÀI TẬP THỰC HÀNH
        //Bài 1. Nhập vào một số nguyên từ bàn phím, số nguyên này là tháng của năm trong đoạn từ [0-
        //12]. Hãy viết chương trình sử dụng switch expression để phân loại và hiển thị các mùa trong năm
        //và in ra màn hình kết quả tương ứng.
//        Scanner scanner = new Scanner(System.in);
//        int month = 0;
//        do {
//            month = scanner.nextInt();
//            var result = switch (month) {
//                case 0 -> "";
//                case 1, 2, 3 -> "Mùa xuân";
//                case 4, 5, 6 -> "Mùa Hạ";
//                case 7, 8, 9 -> "Mùa Thu";
//                case 10, 11, 12 -> "Mùa Đông";
//                default -> "INVALID";
//            };
//            System.out.println(result);
//        } while (month != 0);

        //Bài 2. Nhập vào một số nguyên từ bàn phím, số nguyên này nằm trong đoạn từ [0-12]. Giả định
        //rằng các con giáp được đánh số từ 1-12 lần lượt là Tí, Sửu, Dần, Mão, Thìn, Tỵ, Ngọ, Mùi, Thân,
        //Dậu, Tuất, Hợi. Hãy viết chương trình sử dụng switch expression để phân loại và hiển thị ra màn
        //hình con giáp tương ứng.
        Scanner scanner = new Scanner(System.in);
        var n = 0;
        do{
            n = scanner.nextInt();
            String result = switch (n){
                case 0 -> "";
                case 1 -> "Tý";
                case 2 -> "Sửu";
                case 3 -> "Dần";
                case 4 -> "Mão";
                case 5 -> "Thìn";
                case 6 -> "Tỵ";
                case 7 -> "Ngọ";
                case 8 -> "Mùi";
                case 9 -> "Thân";
                case 10 -> "Dậu";
                case 11 -> "Tuất";
                case 12 -> "Hợi";
                default -> "INVALID";
            };
            System.out.println(result);
        }while (n != 0);

    }

    public static String dayOfWeek2(int index) {
        return switch (index) {
            case 1 -> "Thứ hai";
            case 2 -> "Thứ ba";
            case 3 -> "Thứ tư";
            case 4 -> "Thứ năm";
            case 6 -> "Thứ bảy";
            case 7 -> "Chủ nhật";
            default -> "Ngày không hợp lệ";
        };
    }

    public static String dayOfWeek(int index) {
        var res = "";
        switch (index) {
            case 1:
                res = "Thứ  hai";
                break;
            case 2:
                res = "Thứ  ba";
                break;
            case 3:
                res = "Thứ  tư";
                break;
            case 4:
                res = "Thứ  năm";
                break;
            case 5:
                res = "Thứ  sáu";
                break;
            case 6:
                res = "Thứ bảy";
                break;
            case 7:
                res = "Chủ nhật";
                break;
            default:
                res = "Ngày không hợp lệ";
        }
        return res;
    }
}
