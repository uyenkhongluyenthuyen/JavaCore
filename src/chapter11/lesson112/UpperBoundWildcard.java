package chapter11.lesson112;

import java.util.ArrayList;

public class UpperBoundWildcard {
    public static double averageValue(ArrayList<? extends Number> list) {
        if ((list == null || list.size() == 0)) {
            return 0;
        }
        double sum = 0;
        for (Number item : list) {
            sum += item.doubleValue();
        }
        return sum / list.size();
    }

    public static void main(String[] args) {
        // danh sách các số kiểu int
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(5);
        integers.add(8);
        // danh sách các số kiểu double
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(1.25);
        doubles.add(5.98);
        doubles.add(78.15);
        // danh sách các String object
        ArrayList<String> names = new ArrayList<>();
        names.add("Hoa");
        names.add("Hương");
        names.add("Phương");
        names.add("Linh");

        // lấy giá trị trung bình của mỗi danh sách:
        System.out.printf("Giá trị trung bình các số nguyên: %5.2f\n",
                averageValue(integers)); // 4.67

        System.out.printf("Giá trị trung bình các số thực: %5.2f\n",
                averageValue(doubles)); // 28.46

//        System.out.println("Giá trị trung bình các String object: %5.2f",
//                averageValue(names)); // error
    }
}
