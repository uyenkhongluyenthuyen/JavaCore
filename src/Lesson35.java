import java.util.Scanner;

public class Lesson35 {
    public static void main(String[] args) {
        //VD1: đếm số lượng chữ cái từ bàn phím
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap vao chuoi ky tu: ");
//        var str = scanner.nextLine();
//        //viêt thường lại toàn bộ chuỗi str
//        str = str.toLowerCase();
//        var count = 0; // đếm số kí tự là chữ cái
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
//                count++;
//            }
//        }
//        System.out.println("chuoi: |"+ str+"|:");
//        System.out.println("so chu cai : "+ count);

        //VD2:
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap n: ");
//        var n = scanner.nextInt();
//        if (n > 0) {
//            var sum = 0.0;
//            for (int i = 1; i <= n; i++) {
//                sum += 1.0 / i;
//            }
//            System.out.printf("s = %10.2f" , sum);
//        } else {
//            System.out.println("Nhap n la so nguyen duong");
//        }

        //BÀI TẬP THỰC HÀNH
        //Nhập vào một số nguyên dương n từ bàn phím. Hãy tính tổng của biểu thức S sau và in ra
        //màn hình kết quả.
//        Scanner scanner = new Scanner(System.in);
//        var n = scanner.nextInt();
//        var sum = 0.0;
//        for (int i = 1 ; i <= n ; i++) {
//            sum += 1.0/i;
//        }
//        System.out.println(Math.round(sum)); // tự đồng làm tròn đến so nguyên gần nhất

        //Bài 2. Nhập vào một số nguyên dương n từ bàn phím. Hãy tính tổng của biểu thức S sau và in ra
        //màn hình kết quả. S = 1 + 2 + 3 + ⋯ + n
//        Scanner scanner = new Scanner(System.in);
//        var n = scanner.nextInt();
//        var sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        //Bài 3. Nhập vào một chuỗi kí tự từ bàn phím. Hãy viết hoa chữ cái đầu mỗi từ và in kết quả ra
        //màn hình.
        //sai sai tí sửa lại
//        Scanner scanner = new Scanner(System.in);
//        var str = scanner.nextLine();
//        for (int i = 0; i < str.length(); i++) {
//            if (i == 0 && str.charAt(i) != ' ') {
//                System.out.print(Character.toUpperCase(str.charAt(i)));
//            } else if (i != 0 && str.charAt(i) == ' ') {
//                System.out.print(" " + Character.toUpperCase(str.charAt(i + 1)));
//                i++;
//            } else {
//                System.out.print(str.charAt(i));
//            }
//        }

        //Bài 4: Nhập vào một chuỗi kí tự từ bàn phím. Chuẩn hóa chuỗi vừa nhập sao cho không có 1 hay
        //nhiều dấu cách ở đầu và cuối câu, mỗi từ cách nhau 1 dấu cách. Hãy đếm xem trong chuỗi vừa
        //nhập có bao nhiêu từ và in kết quả số lượng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        var str = scanner.nextLine().trim();
//        str = str.replaceAll("\\s++", " "); // thay thế tất cả khoảng trắng bằng 1 dấu cách
//        int count = 0;
//        //nếu chuỗi k rỗng thì có ít  nhất 1 ky từ
//        if(!str.isEmpty()){
//            count = 1;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == ' '){
//                count++;
//            }
//        }
//        System.out.println(count);

        //Bài 5. Nhập vào một chuỗi kí tự từ bàn phím. Chuẩn hóa chuỗi vừa nhập sao cho không có 1 hay
        //nhiều dấu cách ở đầu và cuối câu, mỗi từ cách nhau 1 dấu cách. Hãy sử dụng kiến thức đã học về
        //vòng lặp để in ra các kí tự của chuỗi theo thứ tự ngược lại.
//        Scanner scanner = new Scanner(System.in);
//        var str = scanner.nextLine().trim();
//        str = str.replaceAll("\\s++", " ");
//        for (int i = str.length() - 1; i >= 0; i--) {
//            System.out.print(str.charAt(i));
//        }

        //Bài 6. Nhập vào một số nguyên n từ bàn phím. Hãy viết chương trình kiểm tra n có phải số nguyên
        //tố hay không và in kết quả ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        boolean isPrime = true;
//        if(n < 2){
//           isPrime = false;
//        }else {
//            int bound = (int) Math.sqrt(n);
//            for (int i = 2; i <= n ; i++) {
//                if(n % i ==0){
//                    isPrime = false;
//                }
//            }
//        }
//        if (isPrime) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }

        //Bài 7. Nhập vào từ bàn phím hai số nguyên a và b, trong đó a < b. Hãy viết chương trình liệt kê
        //các số nguyên tố trong đoạn [a, b].
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        for (int i = a; i <= b; i++) {
//            boolean isPrime = true;
//            if(i >= 2){
//                int bound = (int) Math.sqrt(i);
//                for (int j = 2; j <= bound ; j++) {
//                    if(i % j ==0){
//                        isPrime = false;
//                    }
//                }
//                System.out.print(isPrime ? i + " " : "");
//            }
//        }

        //Bài 8. Nhập vào một số nguyên dương n từ bàn phím. Hãy kiểm tra xem n có phải là số đẹp hay
        //không và in kết quả tương ứng ra màn hình.
        //Chú thích: số đẹp là số đọc từ trái sang phải hay từ phải sang trái đều cho cùng một giá trị.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        //tiến hành lấy giá trị đảo của n
//        int revert = 0;
//        for (int i = n; i > 0; i /= 10) { // chừng nào n > 0
//            // đảo = đảo * 10 + phần đơn vị của i
//            revert = revert * 10 + i % 10;
//            // sau đó i phải loại bỏ phần đơn vị bằng cách chia nguyên cho 10
//        }
//        System.out.println(n == revert ? "YES" : "NO");

        //Bài 9. Nhập vào một số nguyên dương n từ bàn phím, trong đó 0 ≤ n ≤ 90. Hãy viết chương
        //trình tìm số fibonacci thứ n , kí hiệu Fn. In ra màn hình kết quả.
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int f0 = 0;
//        int f1 = 1;
//        int fn = (n < 2) ? n : 0;
//        for (int i = 2; i <= n; i++) {
//            fn = f0 + f1;
//            f0 = f1;
//            f1 = fn;
//        }
//        System.out.println(fn);

        //Bài 10. Nhập vào từ bàn phím hai số nguyên dương a và b, trong đó 0 ≤ a < b ≤ 90. Hãy viết
        //chương trình liệt kê các số trong dãy fibonacci từ Fa đến Fb.
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        for (int i = a ; i <= b ; i++) {
//            int f0 = 0;
//            int f1 = 1;
//            int fn = (i < 2) ? i : 0;
//            for (int j = 2; j <= i; j++) {
//                fn = f0 + f1;
//                f0 = f1;
//                f1 = fn;
//            }
//            System.out.print(fn);
//            if( i != b){
//                System.out.print(", ");
//            }
//        }

        //Bài 11*. Nhập vào hai số nguyên dương a và b từ bàn phím. Hãy kiểm tra xem cặp số a và b có
        //phải cặp số thân thiết hay không và in kết quả ra màn hình.
        //Chú thích: cặp số a và b là cặp số thân thiết khi tổng các ước của a cộng lại bằng b và tổng các
        //ước của b cộng lại bằng a. Ví dụ : a = 220 , b = 284 mà 220 = 1 + 2 + 4 + 5 + 10 + 11 + 20 + 45 +
        //55 + 110 = 284 và 284 = 1 + 2 + 4 + 71 + 142 = 220.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        var result = checkFriendlyNumber(a, b) && checkFriendlyNumber(b, a) ? "YES" : "NO";
        System.out.println(result);

    }

    private static boolean checkFriendlyNumber(int m, int n) {
        if (m < 2) {
            return false;
        }
        int sum = sumDivior(m);
        return sum == n;
    }

    //phương thức tính tổng các ước của một số
    private static int sumDivior(int m) {
        int sum = 1;
        int bound = (int) Math.sqrt(m);
        for (int i = 2; i < bound; i++) {
            if (m % i == 0) {
                if (m / i == i) {
                    sum += i;
                } else {
                    sum += i;
                    sum += m / i;
                }
            }
        }
        return sum;
    }
}
