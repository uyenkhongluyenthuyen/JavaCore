package chapter10.exp2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(123456, 000010, "Thu Uyên", 150000);
        BankAccount acc2 = new BankAccount(654321, 200001, "Ngọc Hảo", 200000);

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do{
            showMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 0 -> {
                    System.out.println("Cảm ơn đã sử dụng");
                }
                case 1 -> {
                    System.out.println("Nhập số tiền cần nạp: ");
                    long amount = Long.parseLong(scanner.nextLine());
                    try {
                        acc1.deposit(amount);
                    } catch (InvalidAmountException e) {
                        e.printStackTrace();
                        System.out.println("thông điệp: " + e.getInvalidAmount());
                    }
                }
                case 2 -> {
                    System.out.println("Nhập số tiền cần rút:");
                    long amount = Long.parseLong(scanner.nextLine());
                    try {
                        acc1.withdraw(amount);
                    } catch (InvalidAmountException e) {
                        e.printStackTrace();
                    }
                }
                case 3 -> {
                    System.out.println("Nhập số tiền cần chuyển: ");
                    long amount = Long.parseLong(scanner.nextLine());
                    try {
                        acc1.transfer(amount, acc2);
                    } catch (InvalidAmountException e) {
                        e.printStackTrace();
                    }
                }

                case 4 -> {
                    System.out.println("Nhập số tiền cần chuyển: ");
                    long amount = Long.parseLong(scanner.nextLine());
                    try {
                        acc1.payBill(amount);
                    } catch (InvalidAmountException e) {
                        e.printStackTrace();
                    }
                }
                case 5 -> {
                    System.out.println("Số dư: " + acc1.getBalance());
                }

            }
        }while (choice != 0);
    }

    private static void showMenu() {
        System.out.println("=============MENU=============");
        System.out.println("1. Nạp tiền");
        System.out.println("2. Rút tiền");
        System.out.println("3. Chuyển tiền");
        System.out.println("4. Thanh toán Bill");
        System.out.println("5. Xem số dư");
        System.out.println("0. Thoát");
    }
}
