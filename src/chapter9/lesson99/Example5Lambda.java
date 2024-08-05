package chapter9.lesson99;

interface Operater {
    double operater(double a, double b);
}

public class Example5Lambda {
    public static void main(String[] args) {
        Operater sub = (a, b) -> a + b;
        System.out.println(STR."a + b = \{sub.operater(20, 15)}");
    }
}
