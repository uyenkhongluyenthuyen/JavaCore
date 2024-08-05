package chapter10.lesson101;

public class Example {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 6, 5, 4, 7, 8, 9};
        int index = 100;
        if(index > 0 && index < numbers.length){
            System.out.println("Phần tử tại vị trí " +
                    index + " là: " + numbers[index]);
        }else {
            System.out.println("chi so cua mang khong hop le");
            System.out.println("chi so toi da: " + (numbers.length - 1));
        }

        System.out.println("cac cau lenh tiep theo");
    }
}
