package chapter10.exp1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String petName = scanner.nextLine();
        cat.setPetName(petName);
        System.out.println("Nhap tuoi:");
        int age = Integer.parseInt(scanner.nextLine());
        try {
            cat.setAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Loi nhap tuoi");
            System.out.println("Thong diep: " + e.getInvalidAge());;
        }
        System.out.println("ten : " + cat.getPetName());
        System.out.println("Tuoi: " + cat.getAge());
    }
}
