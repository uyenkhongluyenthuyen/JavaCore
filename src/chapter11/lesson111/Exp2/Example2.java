package chapter11.lesson111.Exp2;

import chapter11.lesson111.Exp1.Student;

public class Example2 {
    //Bài 2. Viết phương thức cho phép tìm giá trị x trong mảng kiểu T nào đó và trả về vị trí đầu tiên
    //tìm được. Nếu không tìm thấy thì return -1;
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("S1", "Thu ha", 3.2f),
                new Student("S2", "Ming Quang", 3.5f),
                new Student("S3", "Thu Hien", 3.3f)
        };

        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] friends = {"Uyen", "ha", "Hien", "hao", "Ly"};

        int indexStudent = findX(students, new Student("S2"));
        System.out.println("1. vi tri cua student can tim la: " + indexStudent);

        int indexNumber = findX(numbers, 5);
        System.out.println("2. Vi tri cua so can tim la: " + indexNumber);

        int indexString = findX(friends, "Quang");
        System.out.println("3. Vi tri ten can tim la :" + indexString);
    }

    public static <T extends Comparable> int findX(T[] elements, T x){
        for (int i = 0; i < elements.length; i++) {
            if(elements[i].compareTo(x) == 0){
                return i;
            }
        }
        return -1;
    }
}
