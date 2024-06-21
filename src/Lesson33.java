import java.text.DecimalFormat;
import java.util.Scanner;

public class Lesson33 {
    public static void main(String[] args) {
        //TOÁN TỬ BA NGÔI
        //int n = 120;
//        var result = "";
//       if( n % 2 == 0){
//           result ="n là số chẵn";
//       }else {
//           result ="n là số lẻ";
//       }
//        result = (n % 2 == 0) ? "n là số chẵn" : "n là số lẻ";
//        System.out.println((n % 2 == 0) ? "n là số chẵn" : "n là số lẻ");

//        boolean isDivisible
//                = (n % 2 == 0) ? true
//                : (n % 3 == 0) ? true
//                : (n % 5 == 0);
//        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0) {
//            isDivisible = true;
//        }else {
//            isDivisible = false;
//        }
//        System.out.println("n chia hết cho 2 or 3 or 5 ?" + isDivisible);

        //VD2:  Học Bổng
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào điểm GPA");
//        var gpa = scanner.nextDouble();
//        var scholarship = (gpa > 4.0 || gpa < 3.0) ? 0
//                : (gpa >=3.6) ? 10_000_000
//                : (gpa >=3.2) ? 5_000_000
//                : 3_500_000;
//        var nuFormat = new DecimalFormat("#,###");
//        var result = nuFormat.equals(scholarship);
//        System.out.println(STR."Scholarship amount = \{scholarship}");

        //BÀI TẬP THỰC HÀNH
        //Bài 1. Nhập vào một số nguyên n từ bàn phím. Hãy sử dụng kiến thức về toán tử ba ngôi để kiểm
        //tra số đó chẵn hay lẻ và in kết luận tương ứng ra màn hình.


        //Bài 2. Nhập vào một số nguyên n từ bàn phím. Hãy sử dụng kiến thức về toán tử ba ngôi để kiểm
        //tra số đó âm, dương hay không âm không dương. Sau đó in kết luận tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        var n = scanner.nextInt();
//        var result = (n > 0) ? "POSITIVE"
//                : (n < 0) ? "NEGATIVE"
//                : "UNSIGNED";
//        System.out.println(result);

        //Bài 3. Nhập vào hai số nguyên a, b từ bàn phím. Hãy sử dụng kiến thức về toán tử ba ngôi để so
        //sánh và đưa ra kết luận xem hai số bằng nhau hay khác nhau. Nếu khác nhau thì độ chênh lệch
        //là bao nhiêu đơn vị. In kết quả tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        var a = scanner.nextInt();
//        var b = scanner.nextInt();
//
//        var result = (a == b) ? "EQUAL" : STR."DIFF \{Math.abs(a - b)}";
//        System.out.println(result);

        //Bài 4. Nhập vào ba số nguyên a, b và c từ bàn phím. Hãy sử dụng kiến thức về toán tử ba ngôi để
        //tìm giá trị lớn nhất trong ba số đó và in kết quả tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        var a = scanner.nextInt();
//        var b = scanner.nextInt();
//        var c = scanner.nextInt();

//        var result = (a > b && a > c) ? STR."MAX = \{a}"
//                : (b > c) ? STR."MAX = \{b}"
//                : (c > b) ? STR."MAX = \{c}"
//                : "NOT AVALIABLE";
//        System.out.println(result);
        //Cách 2:
//        var max = a;
//        max = (b > max) ? b : max;
//        max = (c > max) ? c : max;
//        var result = (a==b && b ==c) ? "NOT AVALIABLE" : STR."MAX = \{max}";
//        System.out.println(result);

        //Bài 5. Nhập vào ba số nguyên a, b và c từ bàn phím. Hãy sử dụng kiến thức về toán tử ba ngôi để
        //tìm giá trị nhỏ nhất trong ba số đó và in kết quả tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        var a = scanner.nextInt();
//        var b = scanner.nextInt();
//        var c = scanner.nextInt();
//        var min = a;
//        min = (b < min) ? b : min;
//        min = (c < min) ? c : min;
//        var result = (a==b && b==c) ? "NOT VALIABLE" : STR."MIM = \{min}";
//        System.out.println(result);

        //Bài 6 . Nhập vào hai số nguyên a và b từ bàn phím, trong đó a và b là hai thSỐ ÂM số của phương
        //trình bậc nhất có dạng ax + b = 0. Hãy sử dụng kiến thức về toán tử ba ngôi để giải và biện luận
        //phương trình rồi sau đó in các kết quả tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        var a = scanner.nextInt();
//        var b = scanner.nextInt();
//
//        var result = (a != 0) ? STR."x = \{-b/a}"
//                : (b==0) ? "VO SO NGHEM"
//                : "VO NGHIEM";
//        System.out.println(result);

        //Bài 7. Nhập vào ba số nguyên a, b và c từ bàn phím, trong đó a, b, c là các hệ số và x là
        //nghiệm của phương trình bậc 2 có dạng ax^2 + bx + c = 0. Hãy sử dụng kiến thức về toán tử ba
        //ngôi để kiểm tra các điều kiện của của các thSỐ ÂM số để tìm các trường hợp tương ứng, mỗi
        //trường hợp sẽ có các nghiệm x khác nhau. In kết quả các nghiệm ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        var a = scanner.nextInt();
//        var b = scanner.nextInt();
//        var c = scanner.nextInt();
//        var result = "";
//        if (a != 0) {
//            var dental = b * b - 4 * a * c;
//            result = (dental > 0)
//                    ? STR."x1 = \{(-b + Math.sqrt(dental)) / (2 * a)}, x2 = \{(-b - Math.sqrt(dental)) / (2 * a)}"
//                    : (dental == 0) ? STR."x = \{-b / (2 * a)}"
//                    : "VO NGHIEM";
//        } else {
//            result = (b != 0) ? STR."x = \{-c * 1f / b}"
//                    : (c == 0) ? "VO SO NGHIEM"
//                    : "VO NGHIEM";
//        }
//        if (result != "") {
//            System.out.println(result);
//        }

        //Bài 8. Nhập vào từ bàn phím ba số thực tương ứng với ba cạnh a, b, c của tam giác. Hãy sử dụng
        //kiến thức về toán tử ba ngôi để kiểm tra xem ba số đó có lập thành một tam giác được không. In
        //kết quả ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        var a = scanner.nextInt();
//        var b = scanner.nextInt();
//        var c = scanner.nextInt();
//        var result =  (a + b > c && a + c > b && b + c > a) ? "YES" : "NO";
//        System.out.println(result);


        //Bài 9. Nhập vào từ bàn phím ba số thực dương tương ứng với ba cạnh a, b, c của tam giác. Hãy
        //sử dụng kiến thức về toán tử ba ngôi để kiểm tra xem ba số đó có lập thành một tam giác vuông
        //được không. In kết quả ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        var a = scanner.nextFloat();
//        var b = scanner.nextFloat();
//        var c = scanner.nextFloat();
//        var result = ((a + b > c && a + c > b && b + c > a)
//                && ((b * b + c * c == a * a) || (b * b == a * a + c * c) || (c * c == a * a + b * b))) ? "YES" : "NO";
//        System.out.println(result);

        //Bài 10. Nhập vào từ bàn phím một số thực n, trong đó n là điểm của một sinh viên. Theo bảng
        //quy đổi dưới đây hãy sử dụng kiến thức về toán tử ba ngôi để cho biết điểm chữ tương ứng của
        //sinh viên đó. Lưu ý điểm nhập từ bàn phím phải hợp lệ (lớn hơn hoặc bằng 0 và nhỏ hơn hoặc
        //bằng 10).
//        Scanner scanner = new Scanner(System.in);
//        var n = scanner.nextFloat();
//        var result = (n > 10.0f || n < 0.0f) ? "Không hợp lệ"
//                : (n >= 9.0f) ? "A"
//                : (n >= 7.0f) ? "B"
//                : (n >= 5.0f) ? "C"
//                : (n >= 4.0f) ? "D"
//                : "F";
//        System.out.println(result);

        //Bài 11. Nhập vào từ bàn phím một số thực r, trong đó r là bán kính của một đường tròn. Hãy sử
        //dụng kiến thức về toán tử ba ngôi để tính chu vi và diện tích của đường tròn này, lấy PI = 3.14.
        //Sau đó in kết quả ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        var r = scanner.nextFloat();
//        final float PI = 3.14f;
//        var result = (r<=0)? "INVALID"
//                : STR."\{2*PI*r} \{PI*r*r}";
//        System.out.println(result);

        //Bài 12. Nhập vào hai số thực a và b từ bàn phím, trong đó a là chiều dài và b là chiều rộng của
        //một hình chữ nhật. Hãy sử dụng kiến thức về toán tử ba ngôi để tính chu vi và diện tích của hình
        //chữ nhật này và in ra màn hình kết quả tương ứng.
//        Scanner scanner = new Scanner(System.in);
//        var a = scanner.nextFloat();
//        var b = scanner.nextFloat();
//
//        var result = (a <=0 || b<= 0)? "INVALID"
//                : STR."\{2*(a+b)} \{a*b}";
//        System.out.println(result);

        //Bài 13. Nhập vào hai số thực a và h từ bàn phím, trong đó h là chiều cao hạ từ đỉnh đối diện cạnh
        //a của một tam giác. Hãy sử dụng kiến thức về toán tử ba ngôi để tính diện tích tam giác này và in
        //ra màn hình kết quả tương ứng.
//        Scanner scanner = new Scanner(System.in);
//        var a = scanner.nextFloat();
//        var h = scanner.nextFloat();
//        System.out.println((a <= 0 || h <=0 )? "INVALID" : STR."\{1.0f/2*a*h}");

        //Bài 14. Nhập vào từ bàn phím một số nguyên n trong đoạn [1-12], n tương ứng với 1 tháng trong
        //năm. Hãy sử dụng kiến thức về toán tử ba ngôi để in ra màn hình tên tháng tương ứng đó ở dạng
        //tiếng Anh.
        Scanner scanner = new Scanner(System.in);
        var n = scanner.nextFloat();
        var result = (n < 1 || n > 12) ? "INVALID"
                : (n == 1) ? "Janualy"
                : (n == 2) ? "February"
                : (n == 3) ? "March"
                : (n == 4) ? "April"
                : (n == 5) ? "May"
                : (n == 6) ? "June"
                : (n == 7) ? "July"
                : (n == 8) ? "August"
                : (n == 9) ? "September"
                : (n == 10) ? "Octorber"
                : (n == 11) ? "November"
                : "December";
        System.out.println(result);
    }
}
