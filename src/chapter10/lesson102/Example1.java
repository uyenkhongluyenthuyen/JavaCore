package chapter10.lesson102;

import javax.xml.transform.Source;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        method1();

        //cac cau lenh phia sau
        System.out.println("thuc hien cac cau lenh phia sau");
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
//        File file = new File("input.txt");
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        String str = "03/02/2003";
//
//        try {
//            Date birthday = dateFormat.parse(str);
//            System.out.println("Sinh Nhat: " + dateFormat.format(birthday));
//            Scanner fileReader = new Scanner(file); //checked exception
//
//        } catch (FileNotFoundException | ParseException e) { //gop ngoai le
//            System.out.println(e.getMessage());
////            e.printStackTrace();
//            var stack = e.getStackTrace();
//            for (StackTraceElement m : stack) {
//                System.out.println(m);
//            }
//        }

        String str = null;
        try{
            System.out.println(STR."So ki tu\{str.length()}");
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
