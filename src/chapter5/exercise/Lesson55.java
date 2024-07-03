package chapter5.exercise;

import com.sun.source.doctree.EscapeTree;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson55 {
    public static void main(String[] args) {
        //Bài 1. Nhập vào từ bàn phím một số nguyên dương m. Hãy vẽ hình vuông rỗng cạnh m với hai
        //đường chéo sử dụng mảng hai chiều, mỗi phần tử trong mảng được thể hiển bằng kí tự * hoặc
        //các khoảng trắng. In hình vuông tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int m = scanner.nextInt();
//        String[][] square = new String[m][m];
//        fillSquare(square);
//        onScreen(square);

        //Bài 2. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác vuông góc phải dưới
        //với độ dài 2 cạnh góc vuông bằng h sử dụng mảng hai chiều, mỗi phần tử trong mảng được thể
        //hiển bằng kí tự * hoặc các khoảng trắng. In hình tam giác vuông tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        String[][] triangle = new String[h][h];
//        fillSquareTriangle(triangle);
//        onScreen(triangle);

        //Bài 3. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác vuông góc trái dưới
        //với độ dài 2 cạnh góc vuông bằng h sử dụng mảng hai chiều, mỗi phần tử trong mảng được thể
        //hiển bằng kí tự * hoặc các khoảng trắng. In hình tam giác vuông tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        String[][] triangle = new String[h][];
//        fillSquareTriangle2(triangle);
//        onScreen(triangle);

        //Bài 4. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác vuông góc trái trên
        //với độ dài 2 cạnh góc vuông bằng h sử dụng mảng hai chiều, mỗi phần tử trong mảng được thể
        //hiển bằng kí tự * hoặc các khoảng trắng. In hình tam giác vuông tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        String[][] triangle = new String[h][];
//        fillSquareTriangle3(triangle);
//        onScreen(triangle);

        //Bài 5. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác vuông góc phải trên
        //với độ dài 2 cạnh góc vuông bằng h sử dụng mảng hai chiều, mỗi phần tử trong mảng được thể
        //hiển bằng kí tự * hoặc các khoảng trắng *. In hình tam giác vuông tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        String[][] triangle = new String[h][h];
//        fillSquareTriangle4(triangle);
//        onScreen(triangle);

        //Bài 6. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác cân đặc với chiều cao
        //bằng h sử dụng mảng hai chiều, mỗi phần tử trong mảng được thể hiển bằng kí tự * hoặc các
        //khoảng trắng. In hình tam giác cân tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        String[][] triangle = new String[h][2 * h - 1];
//        fillIsoscelesTriangle(triangle);
//        onScreen(triangle);

        //Bài 7. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác cân rỗng với chiều
        //cao bằng h sử dụng mảng hai chiều, mỗi phần tử trong mảng được thể hiển bằng kí tự * hoặc các
        //khoảng trắng. In hình tam giác cân tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        String[][] triangle = new String[h][2 * h - 1];
//        fillIsoscelesTriangle2(triangle);
//        onScreen(triangle);

        //Bài 8. Nhập vào từ bàn phím một số nguyên dương h. Hãy vẽ hình tam giác số đối xứng với chiều
        //cao bằng h sử dụng mảng hai chiều, mỗi phần tử trong mảng được thể hiển bằng các chữ số
        //1,2,3,...,h hoặc các khoảng trắng. In hình tam giác cân tương ứng ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int h = scanner.nextInt();
//        String[][] triangle = new String[h][2 * h - 1];
//        fillIsoscelesTriangle3(triangle);
//        onScreen(triangle);

        //Bài 9. Viết chương trình cho phép vào từ bàn phím hai số nguyên dương m và n, trong đó m là số
        //hàng và n là số cột của một ma trận số nguyên cấp m x n. Hãy sắp xếp các phần tử trên từng hàng
        //của ma trận theo thứ tự tăng dần từ trái qua phải và hiển thị kết quả ra màn hình.
//        Scanner scanner = new Scanner(System.in);
//        int m = scanner.nextInt();
//        int n = scanner.nextInt();
//        int[][] matrix = new int[m][n];
//        fillMatrix(matrix, scanner);
//        sortMatrix(matrix);
//        onScreen(matrix);

        //Bài 10. Nhập vào từ bàn phím hai số nguyên dương m và n, trong đó m là số hàng và n là số cột
        //của một ma trận số nguyên cấp m x n. Hãy viết chương trình cho phép nhập các phần tử của hai
        //ma trận cấp m x n và tính tổng của hai ma trận đó. Sau đó, in kết quả tổng của hai ma trận ra màn
        //hình.
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[m][n];
        System.out.println("Nhập các phần tử cho ma trận 1:");
        fillMatrix(matrix1, scanner);
        System.out.println("Nhập các phần tử cho ma trận 2:");
        fillMatrix(matrix2, scanner);

        int[][] sumMatrix = sumMatrix(matrix1, matrix2);
        onScreen(sumMatrix);
        
        //Bài 11. Nhập vào từ bàn phím hai số nguyên dương m và n, trong đó m và n là số hàng và cột của
        //một ma trận chỉ chứa hai số 0 hoặc 1. Hãy viết chương trình vẽ ma trận cấp m x n bằng các số 0
        //và 1 rồi in ra màn hình. Lưu ý phần tử đầu tiên của ma trận bằng 0, phần tử tiếp theo là 1 và cứ
        //thế tiếp tục.

    }

    //tính tổng hai ma trận
    private static int[][] sumMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] matrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix;
    }

    private static void onScreen(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    // sắp xếp lại các phần tử trong hàng tăng dân
    private static void sortMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    //vẽ tam gia đối xưng với số
    private static void fillIsoscelesTriangle3(String[][] triangle) {
        int h = triangle.length;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < h*2; j++) {
                if(j >= h - i + 1 && j <= h + i - 1){
                    triangle[i -1 ][j - 1] = " " + String.valueOf(j - Math.abs(h - i)) + " ";
                }else {
                    triangle[i - 1][j - 1] = "   ";
                }
            }
        }
    }

    private static void fillIsoscelesTriangle2(String[][] triangle) {
        int h = triangle.length;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < h * 2; j++) {
                if (i == h || j == h + i - 1 || j == h - i + 1) {
                    triangle[i -1][j-1] = " * ";
                }else {
                    triangle[i -1][j-1] = "   ";
                }

            }
        }
    }

    //vex tam giac can
    private static void fillIsoscelesTriangle(String[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j >= triangle.length - 1 - i && j <= triangle.length - 1 + i) {
                    triangle[i][j] = " * ";
                } else {
                    triangle[i][j] = "   ";
                }
            }
        }
    }

    //vẽ tam giác vuông góc phải trên
    private static void fillSquareTriangle4(String[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j >= i) {
                    triangle[i][j] = " * ";
                } else {
                    triangle[i][j] = "   ";
                }
            }
        }
    }

    //Hình tam giác vuông góc trên bên trái
    private static void fillSquareTriangle3(String[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new String[triangle.length - i];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = " * ";
            }
        }
    }

    //hình tam giác vuông góc trái dưới
    private static void fillSquareTriangle2(String[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new String[i + 1];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = " * ";
            }
        }
    }

    //điền *  tam giác vuông góc phải dưới
    private static void fillSquareTriangle(String[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j >= triangle.length - i - 1) {
                    triangle[i][j] = " * ";
                } else {
                    triangle[i][j] = "   ";
                }
            }
        }
    }


    private static void onScreen(String[][] square) {
        for (String[] strings : square) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }

    private static void fillSquare(String[][] square) {
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                if (i == 0 || i == square.length - 1 || j == 0 || j == square.length - 1 ||
                        i + j == square.length - 1 || i == j) {
                    square[i][j] = " * ";
                } else {
                    square[i][j] = "   ";
                }
            }
        }
    }
}
