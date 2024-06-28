package chapter3;

import java.util.Scanner;

public class Lesson32 {
    public static void main(String[] args) {
        //VD1: Mùa
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập tên mùa trong tiếng anh: ");
//        var season = scanner.nextLine().toLowerCase();
//        String currentSeason = switch (season) {
//            case "spring" -> "Mùa Xuân";
//            case "summer" -> "Mùa Hạ";
//            case "fall", "autumn" -> "Mùa Thu";
//            case "winter" -> "Mùa Đông";
//            default -> "INVALID";
//        };

//        switch (season) {
//            case "spring":
//                currentSeason = "Mùa Xuân";
//                break;
//            case "summer":
//                currentSeason = "Mùa Hạ";
//                break;
//            case "fall":
//            case "autumn":
//                currentSeason="Mùa Thu";
//                break;
//            case "winter":
//                currentSeason ="Mùa Đông";
//                break;
//            default:
//                currentSeason ="INVALID";
//        }
//        System.out.println(STR."Tiếng Anh: \{season} => Tiếng Việt: \{currentSeason}");

        //VD2: Cộng, trừ, nhân chia hai số:
        //sử dụng switch statement
//        var scanner = new Scanner(System.in);
//        System.out.println("Nhập hai số a,b cách nhau một vài khoảng trăng");
//        var a = scanner.nextDouble();
//        var b = scanner.nextDouble();
//
//        System.out.println("==========> Các lựa chọn <==========");
//        System.out.println("1. Cộng hai số.");
//        System.out.println("2. Trừ a cho b.");
//        System.out.println("3. Nhân hai số.");
//        System.out.println("4. Chia hai số.");
//        System.out.println("0. Thoát chương trình.");
//        System.out.println("Xin mời lụa chọn");
//        var choice = scanner.nextInt();
//        var result = switch (choice) {
//            case 0 -> "Chương trình kết thúc";
//            case 1 -> {
//                var sum = a + b;
//                yield STR."\{a} + \{b} = \{sum}";
//            }
//            case 2 ->{
//                var diff = a-b;
//                yield STR."\{a} - \{b} = \{diff}";
//            }
//            case 3 -> {
//                var prod = a*b;
//                yield STR."\{a} * \{b} = \{prod}";
//            }
//            case 4 ->{
//                var qout = a/b;
//                yield STR."\{a} / \{b} = \{qout}";
//            }
//            default ->"==> Sai chức năng. vui lòng chọn lại !";
//
//        };
//        System.out.println(result);
//        switch (choice) {
//            case 0:
//                System.out.println("Chương trình kết thúc");
//                break;
//            case 1:
//                var sum = a+b;
//                System.out.println(STR."\{a} + \{b} = \{sum}");
//                break;
//            case 2:
//                var diff = a-b;
//                System.out.println(STR."\{a} - \{b} = \{diff}");
//                break;
//            case 3:
//                var prod = a*b;
//                System.out.println(STR."\{a} * \{b} = \{prod}");
//                break;
//            case 4:
//                var qout = a/b;
//                System.out.println(STR."\{a} / \{b} = \{qout}");
//                break;
//            default:
//                System.out.println("==> Sai chức năng. vui lòng chọn lại !");
//        }

        //BÀI TẬP THỰC HÀNH
        //Bài 1. Nhập vào một số nguyên từ bàn phím, số nguyên này nằm trong đoạn từ [1-12]. Giả định
        //rằng các con giáp được đánh số từ 1-12 lần lượt là Tí, Sửu, Dần, Mão, Thìn, Tỵ, Ngọ, Mùi, Thân,
        //Dậu, Tuất, Hợi. Hãy viết chương trình sử dụng biểu thức switch để phân loại và hiển thị ra màn
        //hình con giáp tương ứng.
//        Scanner scanner = new Scanner(System.in);
//        var number = scanner.nextInt();
//        switch (number) {
//            case 1 :
//                System.out.println("Tý");
//                break;
//            case 2:
//                System.out.println("Sửu");
//                break;
//            case 3:
//                System.out.println("Dần");
//                break;
//            case 4:
//                System.out.println("Mão");
//                break;
//            case 5 :
//                System.out.println("Thìn");
//                break;
//            case 6:
//                System.out.println("Tỵ");
//                break;
//            case 7:
//                System.out.println("Ngọ");
//                break;
//            case 8:
//                System.out.println("Mùi");
//                break;
//            case 9:
//                System.out.println("Thân");
//                break;
//            case 10:
//                System.out.println("Dậu");
//                break;
//            case 11:
//                System.out.println("Tuất");
//                break;
//            case 12:
//                System.out.println("Hợi");
//                break;
//            default:
//                System.out.println("KHÔNG HỢP LỆ");
//        }
        //Bài 2. Nhập vào một số nguyên từ bàn phím, số nguyên này là tháng của năm trong đoạn từ [1-
        //12]. Hãy viết chương trình sử dụng biểu thức switch để phân loại và hiển thị các mùa trong năm
        //và in ra màn hình kết quả tương ứng.
//        Scanner scanner = new Scanner(System.in);
//        var month = scanner.nextInt();
//        var season = switch (month){
//            case 1,2,3 -> {
//                yield "MÙA XUÂN";
//            }
//            case 4,5,6->{
//                yield "MÙA HẠ";
//            }
//            case 7,8,9-> {
//                yield "MÙA THU";
//            }
//            case 10,11,12 -> {
//                yield "MÙA ĐÔNG";
//            }
//            default -> {
//                yield "KHÔNG HỢP LỆ";
//            }
//        };
//        System.out.println(season);

        //Bài 3. Thông tin về các cung hoàng đạo có ngày sinh và tháng sinh được cho trong bảng phía dưới.
        //Hãy viết chương trình cho người dùng nhập vào ngày sinh, tháng sinh và từ đó tìm cung hoàng
        //đạo tương ứng. Giả định rằng chỉ nhập số. Nếu ngày không hợp lệ hoặc tháng không hợp lệ thì
        //thông báo cho người dùng biết.
//        Scanner scanner = new Scanner(System.in);
//        var day = scanner.nextInt();
//        var month = scanner.nextInt();
//        var zodiac = "";
//        switch (month) {
//            case 1:
//                if (day >= 1 && day <= 19) {
//                    zodiac = "Ma kết";
//                } else if (day > 19 && day <= 31) {
//                    zodiac = "Bảo Bình";
//                } else {
//                    System.out.println("Không hợp lệ");
//                }
//                break;
//            case 2:
//                if (day >= 1 && day <= 18) {
//                    zodiac = "Bảo Bình";
//                } else if (day > 18 && day <= 29) {
//                    zodiac = "Song Ngư";
//                } else {
//                    System.out.println("Không hợp lệ");
//                }
//                break;
//            case 3:
//                if (day >= 1 && day <= 20) {
//                    zodiac = "Song Ngư";
//                } else if (day > 20 && day <= 31) {
//                    zodiac = "Bạch Dương";
//                } else {
//                    System.out.println("Không hợp lệ");
//                }
//                break;
//            case 4:
//                if (day >= 1 && day <= 20) {
//                    zodiac = "Bạch Dương";
//                } else if (day > 20 && day <= 30) {
//                    zodiac = "Kim Ngưu";
//                } else {
//                    System.out.println("Không hợp lệ");
//                }
//                break;
//            case 5:
//                if (day >= 1 && day <= 20) {
//                    zodiac = "Kim Ngưu";
//                } else if (day > 20 && day <= 31) {
//                    zodiac = "Song Tử";
//                } else {
//                    System.out.println("Không hợp lệ");
//                }
//                break;
//            case 6:
//                if (day >= 1 && day <= 21) {
//                    zodiac = "Song Tử";
//                } else if (day > 21 && day <= 30) {
//                    zodiac = "Cựu Giải";
//                } else {
//                    System.out.println("Không hợp lệ");
//                }
//                break;
//            case 7:
//                if (day >= 1 && day <= 22) {
//                    zodiac = "Cựu Giải";
//                } else if (day > 22 && day <= 31) {
//                    zodiac = "Sư Tử";
//                } else {
//                    System.out.println("Không hợp lệ");
//                }
//                break;
//            case 8:
//                if (day >= 1 && day <= 22) {
//                    zodiac = "Sư Tử";
//                } else if (day > 22 && day <= 30) {
//                    zodiac = "Xử Nữ";
//                } else {
//                    System.out.println("Không hợp lệ");
//                }
//                break;
//            case 9:
//                if (day >= 1 && day <= 22) {
//                    zodiac = "Xử Nữ";
//                } else if (day > 22 && day <= 31) {
//                    zodiac = "Thiên Bình";
//                } else {
//                    System.out.println("Không hợp lệ");
//                }
//                break;
//            case 10:
//                if (day >= 1 && day <= 23) {
//                    zodiac = "Thiên Bình";
//                } else if (day > 23 && day <= 30) {
//                    zodiac = "Bọ Cạp";
//                } else {
//                    System.out.println("Không hợp lệ");
//                }
//                break;
//            case 11:
//                if (day >= 1 && day <= 22) {
//                    zodiac = "Bọ Cạp";
//                } else if (day > 22 && day <= 31) {
//                    zodiac = "Nhân Mã";
//                } else {
//                    System.out.println("Không hợp lệ");
//                }
//                break;
//            case 12:
//                if (day >= 1 && day <= 21) {
//                    zodiac = "Nhân Mã";
//                } else if (day > 21 && day <= 30) {
//                    zodiac = "Ma Kết";
//                } else {
//                    System.out.println("Không hợp lệ");
//                }
//                break;
//            default:
//                System.out.println("Không hợp lệ");
//        }
//        if (zodiac != "") {
//            System.out.println(zodiac);
//        }

        //Bài 4. Nhập vào từ bàn phím một chuỗi kí tự là tên thứ của một tuần. Tên thứ nhập vào phải ở
        //dạng tiếng việt. Hãy chuyển đổi tên thứ đó sang tên tiếng Anh tương ứng.
        Scanner scanner = new Scanner(System.in);
        var input = scanner.nextLine().trim().toLowerCase();
        var dayOfWeek = switch (input) {
            case "thứ hai" -> {
                yield "Monday";
            }
            case "thứ ba" -> {
                yield "Tuesday";
            }
            case "thứ tư" -> {
                yield "Wednesday";
            }
            case "thứ năm" -> {
                yield "Thursday";
            }
            case "thứ sáu" -> {
                yield "Friday";
            }
            case "thứ bảy" -> {
                yield "Saturday";
            }
            case "chủ nhật" -> {
                yield "Sunday";
            }
            default -> "Không hợp lệ";
        };
        System.out.println(dayOfWeek);


    }
}
