package chapter5.example;

import java.util.Scanner;

public class Lesson51 {
    public static void main(String[] args) {
//        String[] brands = new String[]{"Apple", "Samsung", "Huawei", "Oppo"};
////        String[] other = brands; // cung tham chiếu tới 1 mảng
////        other[3] = "XiaoMi"; // khi thay đổi này thì cả hai brands và other tại index 3 đều là XiaoMi-> sinh ra copy
//        String[] other = Arrays.copyOf(brands, 10);
//        System.out.println(brands[3]);
//        System.out.println(other[4]);

        //VD1:nhập tên n người bạn, lưu vào mảng, những người nào có tên dài nhất thì hiển thị ra màn hình
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số lượng người bạn: ");
//        int n = scanner.nextInt();
//        if(n > 0){
//            String[] friends = getFriends(n, scanner);
//            int maxLength = findMaxLength(friends);
//            showResult(friends, maxLength);
//        }else {
//            System.out.println("Nhập số lượng là số nguyên dương");
//        }

        //BÀI TẬP THỰC HÀNH
        //Bài 1. Viết chương trình cho phép nhập vào một mảng số nguyên gồm n phần tử và tính tổng tất
        //cả các số nguyên tố trong mảng đó. Yêu cầu tự viết các phương thức phù hợp. In kết quả tương
        //ứng ra màn hình.

        
    }

    private static void showResult(String[] friends, int maxLength) {
        System.out.println("Danh sach những người có tên dài nhất: ");
        for (String friend : friends) {
            if(friend.length() == maxLength){
                System.out.print(friend + "; ");
            }
        }
    }

    //tim độ dài lớn nhất của tên có trong danh sách
    private static int findMaxLength(String[] friends) {
        int max = 0;
        for (int i = 0; i < friends.length; i++) {
            if(friends[i].length() > max){
                max = friends[i].length();
            }
        }
        return max;
    }

    //trả về danh sách tên friends nhập từ bàn phím
    private static String[] getFriends(int n, Scanner scanner) {
        String[] friends = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập tên người bạn thứ "+ (i+1) +": ");
            friends[i] = scanner.next();
        }
        return friends;
    }
}
