import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Lesson210 {
    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        System.out.print("Họ: ");
        var lastName = scaner.nextLine();
        System.out.print("Đệm: ");
        var midName = scaner.nextLine();
        System.out.print("Tên: ");
        var firstName = scaner.nextLine();

        var nameBuilder = new StringBuilder();
        nameBuilder.append(lastName)
                .append(" ")
                .append(midName)
                .append(" ")
                .append(firstName);
        var fullName = nameBuilder.toString();
        System.out.println(STR."Họ và tên: \{fullName}");
        System.out.println(STR."Họ và tên viết HOA: \{fullName.toUpperCase()}");

    }
}
