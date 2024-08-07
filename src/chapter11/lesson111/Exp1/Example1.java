package chapter11.lesson111.Exp1;

public class Example1 {
    public static void main(String[] args) {
        //Viết phương thức generic cho phép hiển thị một mảng các phần tử kiểu T nào đó. Các phần
        //tử sẽ hiển thị cách nhau bởi 1 dấu cách.
        Student[] students = new Student[]{
                new Student("S1", "Thu ha", 3.2f),
                new Student("S2", "Ming Quang", 3.5f),
                new Student("S3", "Thu Hien", 3.3f)
        };

        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] friends = {"Uyen", "ha", "Hien", "hao", "Ly"};

        System.out.println("Danh sach hoc sinh: ");
        showList(students);
    }

    private static <T> void showList(T[] arr) {
        for (T e : arr) {
            System.out.println(e);
        }
        System.out.println();
    }
}
