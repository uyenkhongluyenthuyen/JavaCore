package chapter11.lesson111;


import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Hien");
        friends.add("Quang");
        friends.add("Ha");
        friends.add("Hao");
        friends.add("Minh");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("S1"));
        students.add(new Student("S2"));
        students.add(new Student("S3"));

        Test obj = new Test();

        System.out.println("Danh sach nhung nguoi ban");
        showList(friends);
        System.out.println("Nguoi co ten sau cung trong danh sach abc" + obj.findMax(friends));

        System.out.println("Danh sach so");
        showList(numbers);
        System.out.println("Phan tu co gia tri lon nhat: " + obj.findMax(numbers));

        Student maxStudent = obj.findMax(students);




//        System.out.println("Phan tu chinh giua cua danh sach nhung nguoi ban: " + obj.getMid(friends));
//        System.out.println("Phan tu giua cua danh sach cac so: " + obj.getMid(numbers));

    }

    //giới hạn T phair thuwc thi Comparale neu T ko co Comarable thi se loi. VD nhu lop Student tu tao
    public <T extends Comparable> T findMax(ArrayList<T> list){
        if(list == null || list.size() == 0){
            return null;
        }else {
            T max = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if(list.get(i).compareTo(max) > 0){
                    max = list.get(i);
                }
            }
            return max;
        }

    }

    /**
     * hien thi danh sach mot list
     *
     * @param list
     * @param <T>
     */
    private static <T> void showList(ArrayList<T> list) {
        for (T e : list) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public <T> T getMid(ArrayList<T> list) {
        int midIndex = list.size() / 2;
        return list.get(midIndex);
    }


}
