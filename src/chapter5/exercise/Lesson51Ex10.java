package chapter5.exercise;

import java.util.Scanner;

public class Lesson51Ex10 {
    public static void main(String[] args) {
        //Bài 10. Nhập vào từ bàn phím số nguyên n > 0, trong đó n là số lượng nhân viên trong công ty.
        //Với mỗi nhân viên hãy viết chương trình cho phép nhập vào ngày công của từng người. Sau đó
        //tính và hiển thị ra màn hình thông tin chi tiết về số công, tổng lương cứng, tổng phụ cấp, tổng
        //bonus và tổng lương được nhận của một danh sách gồm n nhân viên dưới dạng hàng và cột.

        //Chú thích: số ngày công không quá 30 và được phép lẻ 0.5 ngày. Ví dụ 22.5, 15.5. Lương cứng của
        //một ngày công là 330k. Phụ cấp 33k/công hoàn chỉnh. Lẻ 0.5 không được tính. Ví dụ 15.5 công
        //chỉ đc phụ cấp 15 công. Nếu số công tháng >= 25 thì nhân viên được bonus mỗi công từ 25 trở đi
        //thêm 50k.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float[] salarys = getSalarys(n, scanner);
        showResult(salarys, n);

    }

    //phương thức hiển thị kết quả ra màn hình
    private static void showResult(float[] salarys, int n) {
        System.out.printf("%-5s%-10s%-15s%-10s%-10s%-12s\n", "STT",
                "Số công", "Lương cứng", "Phụ cấp", "Bonus", "Tổng lương");
        for (int i = 0; i < n; i++) {
            var standard = 330 * salarys[i]; //lương cứng
            var pensision = 33 * (int) salarys[i]; //phu cap
            var bonusDay = (salarys[i] - 25 >= 0) ? (salarys[i] - 24) : 0; // số ngày được bonus thêm
            var bonus = bonusDay * 50;
            var total = standard + pensision + bonus;
            System.out.printf("%-5s%-10s%-15s%-10s%-10s%-12s\n", i + 1,
                    salarys[i], standard, pensision, bonus, total);

        }
    }

    //phương thức lấy ra các công của n nhân viên được nhập từ bàn phím
    private static float[] getSalarys(int n, Scanner scanner) {
        float[] salarys = new float[n];
        for (int i = 0; i < n; i++) {
            salarys[i] = scanner.nextFloat();
            while (salarys[i] > 30 && salarys[i] < 0) { // số công phải trong đoạn từ 0 - 30
                salarys[i] = scanner.nextFloat();
            }
        }
        return salarys;
    }
}
