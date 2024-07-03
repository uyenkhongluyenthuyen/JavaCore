package chapter5.example;

import java.util.Scanner;

public class Lesson55 {
    public static void main(String[] args) {
        //vd1: vẽ hình chữ nhật đặc với dấu *
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng số cột của hình chữ nhật:");
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        if (height > 0 && width > 0) {
            String[][] rectangle = new String[height][width];
            fillStar(rectangle);
            onScreen(rectangle);
        }else {
            System.out.println("Số hàng, số cột phải nguyên dương!!!");
        }

        //vd2: vẽ tam giác số -> sử dụng mảng zigzag
        System.out.println("Nhập chiều cao của tam giác");
        int h = scanner.nextInt();
        //cấp phát hàng
        int[][] triangle = new int[h][];
        for (int i = 0; i < h; i++) {
            triangle[i] = new int[i + 1];
        }
        fillTriangle(triangle);
        onScreen(triangle);
    }

    private static void onScreen(int[][] triangle) {
        for (int[] ints : triangle) {
            for (int anInt : ints) {
                System.out.printf("%5d",anInt);
            }
            System.out.println();
        }
    }

    /**
     * vẽ hình tam giác sô vuông góc hình trái dưới
     * @param triangle
     */
    private static void fillTriangle(int[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = i + j ;
            }
        }
    }

    /**
     * Phương thức hiển thị rect lên màn hình
     * @param rectangle : chứa dữ liệu cần vẽ
     */
    private static void onScreen(String[][] rectangle) {
        for (String[] strings : rectangle) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }

    /**
     * Phương thức điền dấu * vào hình chữ nhật
     * @param rectangle : mảng chứa hình chữ nhật
     */
    private static void fillStar(String[][] rectangle) {
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                rectangle[i][j] = " * ";
            }
        }
    }
}
