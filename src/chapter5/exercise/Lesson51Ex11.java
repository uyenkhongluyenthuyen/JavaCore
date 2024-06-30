package chapter5.exercise;

import java.util.Scanner;

public class Lesson51Ex11 {
    public static void main(String[] args) {
        //Bài 11. Nhập vào một dòng họ và tên từ bàn phím. Các từ trong xâu họ-đệm-tên phân tách nhau
        //bằng 1 dấu cách, không có dấu cách thừa ở đầu và cuối xâu. Hãy viết chương trình chuẩn hóa xâu
        //họ-đệm-tên đó theo quy chuẩn(Viết hoa chữ cái đầu từ, các chữ cái còn lại viết thường) và in ra
        //màn hình.
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine().trim();
        var result = solve(fullName);
        System.out.println(result);
    }

    private static String solve(String fullName) {
        String name = fullName.toLowerCase();
        String[] words = name.split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            var character = word.toCharArray(); //tách từ thành mảng các kí tự
            character[0] = Character.toUpperCase(character[0]);
            // new String(character) khởi tạo 1 O String với đối số truyền vào là một mảng kí tự
            builder.append(new String(character));
            builder.append(" ");
        }
        return builder.toString();
    }
}
