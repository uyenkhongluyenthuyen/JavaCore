import java.util.Scanner;

public class Lesson36 {
    public static void main(String[] args) {
        //VD1: Kiểm tra xem n có phải là số đẹp hay không
//        var input = new Scanner(System.in);
//        System.out.println("Nhập vào một số nguyên dương n:");
//        var n = input.nextInt();
//        var m = n; // tao ra biến trung gian
//        var rev = 0; // lưu giá trị đảo của n
//        //kiểm tra
//        while (m > 0) {
//            rev = rev * 10 + m % 10;
//            m /= 10;
//        }
//        if (n == rev) {
//            System.out.println("n là số đẹp");
//        } else {
//            System.out.println("n không phải là số đẹp");
//        }

        //VD2:làm menu
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập 2 số thực a, b");
//        var a = scanner.nextDouble();
//        var b = scanner.nextDouble();
//        var choice = 0;
//        do {
//            System.out.println("Chọn chức năng:");
//            System.out.println("1. Cộng hai số");
//            System.out.println("2. Trừ hai số");
//            System.out.println("3. Nhân hai số");
//            System.out.println("4. Chia hai so");
//            System.out.println("0. Thoát chương trình");
//            System.out.println("Xin mời chọn");
//            choice = scanner.nextInt();
//            switch (choice) {
//                case 0:
//                    System.out.println("xin cảm ơn hẹn gặp lại");
//                    break;
//                case 1:
//                    var sum = a + b;
//                    System.out.println(a + " + " + b + "=" + sum);
//                    break;
//                case 2:
//                    var diff = a - b;
//                    System.out.println(a + " - " + b + "=" + diff);
//                    break;
//                case 3:
//                    var prod = a * b;
//                    System.out.println(a + " * " + b + "=" + prod);
//                    break;
//                case 4:
//                    var qout = a / b;
//                    System.out.println(a + " / " + b + "=" + qout);
//                    break;
//                default:
//                    System.out.println("Sai chức năng vui lòng chọn từ 0 đến 4");
//                    break;
//            }
//            System.out.println("==========================================");
//        } while (choice != 0);

        //BÀI TẬP THỰC HÀNH
        //Bài 1. Nhập vào một số nguyên dương n từ bàn phím. Hãy tìm tất cả các ước tự nhiên của n và in
        //kết quả ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int i = 1;
//        while (i <= n) {
//            if (n % i == 0) {
//                System.out.print(i);
//                if (i != n) {
//                    System.out.print(", ");
//                }
//            }
//            i++;
//        }

        //Bài 2. Nhập vào hai số nguyên dương a và b từ bàn phím. Hãy tìm ước chung lớn nhất và bội
        //chung nhỏ nhất của a và b. In kết quả tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        var cm = a * b; // common multiple BC
//        //tìm ước chung lớn nhất
//        while (a != b) {
//            if (a > b) {
//                a -= b;
//            } else {
//                b -= a;
//            }
//        }
//        //kết thúc vòng while thì UCLN =a=b;
//        //tìm BCNN bằng cách
//        var lcm = cm / a;
//        System.out.println("UCLN = " + a);
//        System.out.println("BCNN = " + lcm);

        //Bài 3. Nhập vào từ bàn phím một số nguyên dương n. Hãy tính tổng các chữ số của n sử dụng
        //vòng lặp while. In kết quả tương ứng ra màn hình khi thực hiện xong.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int sum = 0;
//        while(n > 0){
//            int i = n % 10;
//            sum += i;
//            n /= 10;
//        }
//        System.out.println(sum);

        //Bài 4. Nhập vào một thông điệp từ bàn phím. Hãy hiển thị các kí tự trong thông điệp từ cuối lên
        //đầu bằng cách sử dụng vòng lặp while. In kết quả tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        int i = str.length() - 1;
//        while (i>=0){
//            System.out.print(str.charAt(i));
//            i--;
//        }

        //Bài 5. Viết chương trình cho phép tính tổng các giá trị mà người dùng nhập vào từ bàn phím. Việc
        //nhập vào sẽ dừng lại khi người dùng nhập vào giá trị 0. Hãy in kết quả của tổng các số vừa nhập
        //lên màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = -1;
//        int sum = 0;
//        while (n != 0) {
//            n = scanner.nextInt();
//            sum += n;
//        }
//        System.out.println(sum);

        //Bài 6. Nhập vào từ bàn phím một số nguyên dương n. Hãy sử dụng vòng lặp while để tính tổng
        //biểu thức S dưới đây và in kết quả ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int i = 1;
//        Float sum = 0f;
//        while (i <= n) {
//            sum += 1f / (i * i);
//            i++;
//        }
//        //System.out.printf("%5.2f", sum);
//        System.out.println(String.format("%.2f", sum));

        //Bài 7. Viết chương trình giải và biện luận phương trình bậc hai ax^2 + bx + c = 0. Trong đó a, b,
        //c là các hệ số và x là giá trị của nghiệm. Hãy hiển thị kết quả của nghiệm lên màn hình.
        //Lưu ý: Yêu cầu khi nhập hệ số a bắt buộc phải khác 0, nếu cố tình nhập a = 0 thì chương trình sẽ
        //yêu cầu nhập lại đến khi a ≠ 0 mới dừng nhập.
//        Scanner scanner = new Scanner(System.in);
//        float a = scanner.nextFloat();
//        while (a == 0) {
//            System.out.println("Nhập a khác 0: ");
//            a = scanner.nextFloat();
//        }
//        float b = scanner.nextFloat();
//        float c = scanner.nextFloat();
//
//        var dental = b * b - 4 * a * c;
//        if(dental < 0){
//            System.out.println("VO NGHIEM");
//        } else if (dental==0) {
//            System.out.println(STR."x = \{-b/(2*a)}");
//        }else {
//            var x1 = -b + Math.sqrt(dental)/(2*a);
//            var x2 = -b - Math.sqrt(dental)/(2*a);
//            System.out.println(STR."x1 = \{x1}, x2 = \{x2}");
//        }

        //Bài 8. Nhập vào từ bàn phím một số nguyên dương n. Hãy tìm chữ số đầu tiên của n sử dụng
        //vòng lặp while và in kết quả ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        while (n > 10){
//            n /= 10;
//        }
//        System.out.println(n);

        //Bài 9. Nhập vào từ bàn phím một số nguyên dương n. Hãy tìm tổng chữ số đầu tiên và chữ số
        //cuối cùng của n sử dụng vòng lặp while. In kết quả ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        //chữ số đầu tiên
//        while (n > 10){
//            n /= 10;
//        }
//        int lastNum = n % 10; // chữ số cuối cùng
//        System.out.println(STR."\{n + lastNum}");

        //Bài 10. Nhập vào từ bàn phím một số nguyên dương n. Hãy sử dụng vòng lặp while để đếm xem
        //n có bao nhiêu chữ số. In kết quả ra màn hình là số chữ số của n.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int count = 0 ;
//        while (n > 0){
//            n /=10;
//            count ++;
//        }
//        System.out.println(count);

        //Bài 11. Nhập vào một số nguyên từ bàn phím, số nguyên này là tháng của năm trong đoạn từ [0-
        //12]. Hãy viết chương trình sử dụng biểu thức switch kết hợp với do-while để phân loại và hiển thị
        //các mùa trong năm và in ra màn hình kết quả tương ứng.
//        Scanner scanner = new Scanner(System.in);
//        var month = 0;
//        do{
//            month = scanner.nextInt();
//            switch (month){
//                case 0:
//                    break;
//                case 1,2,3:
//                    System.out.println("MÙA XUÂN");
//                    break;
//                case 4,5,6:
//                    System.out.println("MÙA HẠ");
//                    break;
//                case 7,8,9:
//                    System.out.println("MÙA THU");
//                    break;
//                case 10,11,12:
//                    System.out.println("MÙA ĐÔNG");
//                    break;
//                default:
//                    System.out.println("KHÔNG HỢP LỆ");
//                    break;
//            }
//
//        }while (month != 0);

        //Bài 12. Nhập vào một số nguyên từ bàn phím, số nguyên này nằm trong đoạn từ [0-12]. Giả định
        //rằng các con giáp được đánh số từ 1-12 lần lượt là Tí, Sửu, Dần, Mão, Thìn, Tỵ, Ngọ, Mùi, Thân,
        //Dậu, Tuất, Hợi. Hãy viết chương trình sử dụng biểu thức switch kết hợp với do-while để phân loại
        //và hiển thị ra màn hình con giáp tương ứng.
//        Scanner scanner = new Scanner(System.in);
//        int n = 0;
//        do {
//            n = scanner.nextInt();
//            switch (n) {
//                case 0:
//                    break;
//                case 1:
//                    System.out.println("Tý");
//                    break;
//                case 2:
//                    System.out.println("Sửu");
//                    break;
//                case 3:
//                    System.out.println("Dần");
//                    break;
//                case 4:
//                    System.out.println("Mão");
//                    break;
//                case 5:
//                    System.out.println("Thìn");
//                    break;
//                case 6:
//                    System.out.println("Tỵ");
//                    break;
//                case 7:
//                    System.out.println("Ngọ");
//                    break;
//                case 8:
//                    System.out.println("Mùi");
//                    break;
//                case 9:
//                    System.out.println("Thân");
//                    break;
//                case 10:
//                    System.out.println("Dậu");
//                    break;
//                case 11:
//                    System.out.println("Tuất");
//                    break;
//                case 12:
//                    System.out.println("Hợi");
//                    break;
//                default:
//                    System.out.println("KHÔNG HỢP LỆ");
//                    break;
//            }
//        } while (n != 0);

        //Bài 13. Thông tin về các cung hoàng đạo có ngày sinh và tháng sinh được cho trong bảng phía
        //dưới. Giả định rằng chỉ nhập số. Nếu ngày không hợp lệ hoặc tháng không hợp lệ thì thông báo
        //cho người dùng biết. Hãy viết chương trình sử dụng biểu thức switch kết hợp với vòng lặp do-
        //while để cho người dùng nhập vào ngày sinh, tháng sinh rồi từ đó tìm cung hoàng đạo tương ứng.
//        Scanner scanner = new Scanner(System.in);
//        int month= 0;
//        do{
//            var day = scanner.nextInt();
//            month = scanner.nextInt();
//            var zodiac = "";
//            switch (month) {
//                case 0:
//                    break;
//                case 1:
//                    if (day >= 1 && day <= 19) {
//                        zodiac = "Ma kết";
//                    } else if (day > 19 && day <= 31) {
//                        zodiac = "Bảo Bình";
//                    } else {
//                        System.out.println("Không hợp lệ");
//                    }
//                    break;
//                case 2:
//                    if (day >= 1 && day <= 18) {
//                        zodiac = "Bảo Bình";
//                    } else if (day > 18 && day <= 29) {
//                        zodiac = "Song Ngư";
//                    } else {
//                        System.out.println("Không hợp lệ");
//                    }
//                    break;
//                case 3:
//                    if (day >= 1 && day <= 20) {
//                        zodiac = "Song Ngư";
//                    } else if (day > 20 && day <= 31) {
//                        zodiac = "Bạch Dương";
//                    } else {
//                        System.out.println("Không hợp lệ");
//                    }
//                    break;
//                case 4:
//                    if (day >= 1 && day <= 20) {
//                        zodiac = "Bạch Dương";
//                    } else if (day > 20 && day <= 30) {
//                        zodiac = "Kim Ngưu";
//                    } else {
//                        System.out.println("Không hợp lệ");
//                    }
//                    break;
//                case 5:
//                    if (day >= 1 && day <= 20) {
//                        zodiac = "Kim Ngưu";
//                    } else if (day > 20 && day <= 31) {
//                        zodiac = "Song Tử";
//                    } else {
//                        System.out.println("Không hợp lệ");
//                    }
//                    break;
//                case 6:
//                    if (day >= 1 && day <= 21) {
//                        zodiac = "Song Tử";
//                    } else if (day > 21 && day <= 30) {
//                        zodiac = "Cựu Giải";
//                    } else {
//                        System.out.println("Không hợp lệ");
//                    }
//                    break;
//                case 7:
//                    if (day >= 1 && day <= 22) {
//                        zodiac = "Cựu Giải";
//                    } else if (day > 22 && day <= 31) {
//                        zodiac = "Sư Tử";
//                    } else {
//                        System.out.println("Không hợp lệ");
//                    }
//                    break;
//                case 8:
//                    if (day >= 1 && day <= 22) {
//                        zodiac = "Sư Tử";
//                    } else if (day > 22 && day <= 30) {
//                        zodiac = "Xử Nữ";
//                    } else {
//                        System.out.println("Không hợp lệ");
//                    }
//                    break;
//                case 9:
//                    if (day >= 1 && day <= 22) {
//                        zodiac = "Xử Nữ";
//                    } else if (day > 22 && day <= 31) {
//                        zodiac = "Thiên Bình";
//                    } else {
//                        System.out.println("Không hợp lệ");
//                    }
//                    break;
//                case 10:
//                    if (day >= 1 && day <= 23) {
//                        zodiac = "Thiên Bình";
//                    } else if (day > 23 && day <= 30) {
//                        zodiac = "Bọ Cạp";
//                    } else {
//                        System.out.println("Không hợp lệ");
//                    }
//                    break;
//                case 11:
//                    if (day >= 1 && day <= 22) {
//                        zodiac = "Bọ Cạp";
//                    } else if (day > 22 && day <= 31) {
//                        zodiac = "Nhân Mã";
//                    } else {
//                        System.out.println("Không hợp lệ");
//                    }
//                    break;
//                case 12:
//                    if (day >= 1 && day <= 21) {
//                        zodiac = "Nhân Mã";
//                    } else if (day > 21 && day <= 30) {
//                        zodiac = "Ma Kết";
//                    } else {
//                        System.out.println("Không hợp lệ");
//                    }
//                    break;
//                default:
//                    System.out.println("Không hợp lệ");
//            }
//            if (zodiac != "") {
//                System.out.println(zodiac);
//            }
//        }while (month != 0);

        //Bài 14. Nhập vào từ bàn phím một chuỗi kí tự là tên thứ của một tuần. Tên thứ nhập vào phải ở
        //dạng tiếng việt. Hãy sử dụng vòng lặp do-while kết hợp với biểu thức switch để chuyển đổi tên
        //thứ sang tên tiếng Anh tương ứng.
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = "0";
        do {
            dayOfWeek = scanner.nextLine().toLowerCase();
            switch (dayOfWeek){
                case "0":
                    break;
                case "thứ hai":
                    System.out.println("Monday");
                    break;
                case "thứ ba":
                    System.out.println("Tuesday");
                    break;
                case "thứ tư":
                    System.out.println("Wednesday");
                    break;
                case "thứ năm":
                    System.out.println("Thurday");
                    break;
                case "thứ sáu":
                    System.out.println("Friday");
                    break;
                case "thứ bảy":
                    System.out.println("Saturday");
                    break;
                case "chủ nhật":
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("INVALID DAY OF WEEK");
                    break;
            }
        } while (!dayOfWeek.equals("0"));

    }
}
