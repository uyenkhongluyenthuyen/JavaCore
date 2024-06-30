package chapter5.exercise;

import java.util.Scanner;


public class Lesson51Ex6 {
    public static void main(String[] args) {
        //Bài 6. Nhập vào một số nguyên dương n từ bàn phím, trong đó n là số lượng tên trong danh sách.
        //Yêu cầu tự viết các phương thức phù hợp. Hãy viết chương trình cho phép nhập vào danh sách
        //tên những người bạn của bạn từ bàn phím. Sau đó liệt kê tên những người có độ dài ngắn nhất
        //ra màn hình.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] friends = getFriends(n, scanner);
        int min = findMinLength(friends);
        showResult(friends, min);

    }

    private static void showResult(String[] friends, int min) {
        for (String friend : friends) {
            if(friend.length() == min){
                System.out.print(friend+" ");
            }
        }
    }

    private static int findMinLength(String[] friends) {
        int min = friends[0].length();
        for (String friend : friends) {
            if(friend.length() < min){
                min = friend.length();
            }
        }
        return min;
    }

    private static String[] getFriends(int n, Scanner scanner) {
        String[] friends = new String[n];
        for (int i = 0; i < n; i++) {
            friends[i] = scanner.next();
        }
        return friends;
    }
}
