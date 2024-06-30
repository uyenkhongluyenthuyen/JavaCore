package chapter5.exercise;

import java.util.Scanner;

public class Lesson51Ex12 {
    public static void main(String[] args) {
        //Bài 12. Nhập vào một xâu kí tự từ bàn phím. Các từ trong xâu phân tách nhau bằng 1 dấu cách,
        //không có dấu cách thừa ở đầu và cuối xâu. Hãy viết chương trình viết hoa các chữ cái đầu mỗi từ
        //với điều kiện từ đó phải bắt đầu bằng nguyên âm. In kết quả ra màn hình.
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        var result = solve(str);
        System.out.println(result);
    }

    private static String solve(String str) {
        String name = str.toLowerCase();
        String[] words = name.split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            var characters = word.toCharArray();
            if(isVowel(characters[0])){
                characters[0] = Character.toUpperCase(characters[0]);
            }
            builder.append(new String(characters));
            builder.append(" ");
        }
        return builder.toString();
    }

    // Phương thức kiểm tra ký tự có phải là nguyên âm hay không
    private static boolean isVowel(char c) {
        char lowerCaseC = Character.toLowerCase(c);
        return lowerCaseC == 'a' || lowerCaseC == 'á' || lowerCaseC == 'ả' || lowerCaseC == 'à' || lowerCaseC == 'ạ'
                || lowerCaseC == 'e' || lowerCaseC == 'é' || lowerCaseC == 'ẻ' || lowerCaseC == 'è' || lowerCaseC == 'ẹ'
                || lowerCaseC == 'i' || lowerCaseC == 'í' || lowerCaseC == 'ỉ' || lowerCaseC == 'ì' || lowerCaseC == 'ị'
                || lowerCaseC == 'o' || lowerCaseC == 'ó' || lowerCaseC == 'ỏ' || lowerCaseC == 'ò' || lowerCaseC == 'ọ'
                || lowerCaseC == 'u' || lowerCaseC == 'ú' || lowerCaseC == 'ủ' || lowerCaseC == 'ù' || lowerCaseC == 'ụ'
                || lowerCaseC == 'ư' || lowerCaseC == 'ứ' || lowerCaseC == 'ử' || lowerCaseC == 'ừ' || lowerCaseC == 'ự';
    }
}
