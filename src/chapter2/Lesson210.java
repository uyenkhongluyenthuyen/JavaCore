package chapter2;

import static java.lang.StringTemplate.STR;

public class Lesson210 {
    public static void main(String[] args) {
//        var scaner = new Scanner(System.in);
//        System.out.print("Họ: ");
//        var lastName = scaner.nextLine().trim();
//        System.out.print("Đệm: ");
//        var midName = scaner.nextLine().trim();
//        System.out.print("Tên: ");
//        var firstName = scaner.nextLine().trim();
//
//        var nameBuilder = new StringBuilder();
//        nameBuilder.append(lastName.toLowerCase())
//                .append(" ")
//                .append(midName.toLowerCase())
//                .append(" ")
//                .append(firstName.toLowerCase());
//        //Phuong thuc trong StringBuilder
//        nameBuilder.setCharAt(0, Character.toUpperCase(nameBuilder.charAt(0)));
//        var previousIndex = 0;
//        while (true){
//            var index = nameBuilder.indexOf(" ", previousIndex);
//            if(index >=0){
//                var character = nameBuilder.charAt(index+1);
//                nameBuilder.setCharAt(index+1, Character.toUpperCase(character));
//                previousIndex = index + 1;
//            }else {
//                break;
//            }
//        }
//
//        System.out.println(STR."Họ và tên: \{nameBuilder}");

        //StringBuffer
        var buffer = new StringBuffer();
        var task1 = new MyRunnable(buffer, 700, "Hello ");
        var task2 = new MyRunnable(buffer, 500, "World!");
        var thread1 = new Thread(task1);
        var thread2 = new Thread(task2);
        thread2.start();
        thread1.start();
        try {
            thread2.join();
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(STR."Kết quả: \{buffer}");

    }
}

class MyRunnable implements  Runnable{
    private final StringBuffer buffer;
    private final String message;
    private final int duration;

    public MyRunnable(StringBuffer buffer, int sleepDuration, String message) {
        this.buffer = buffer;
        this.message = message;
        this.duration = sleepDuration;
    }

    @Override
    public void run() {
        synchronized (buffer) {
            buffer.append(message);
            System.out.println(buffer);
            try {
                Thread.sleep(duration);
                buffer.append(message);
                System.out.println(buffer);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
