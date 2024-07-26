package chapter9.lesson91;

public class Test  {
    public static void main(String[] args) {
        Person uyen = new Student();
        Person thanh = new Instructor();
        Person linh = new Programer();

        uyen.earnMoney();
        thanh.earnMoney();
        linh.earnMoney();
    }
}
