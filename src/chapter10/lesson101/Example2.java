package chapter10.lesson101;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example2 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat =
                new SimpleDateFormat("dd/MM/yyyy");
        var dateString = "27-05/2025";
        // chuyển đổi string sang đối tượng date:
        Date myBirthday = null;
        try {
            myBirthday = dateFormat.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);

        }
        System.out.println("Đối tượng date hoàn chỉnh: " + dateFormat.format(myBirthday));

        // các câu lệnh kế tiếp phía sau
        System.out.println("Thực hiện các câu lệnh tiếp theo...");
    }
}
