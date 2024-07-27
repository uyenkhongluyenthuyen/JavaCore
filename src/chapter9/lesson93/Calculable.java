package chapter9.lesson93;

/**
 * interface chứa các phương thức có thể tính toán số học
 * hai số nguyên a, b
 */
public interface Calculable {
    int add(int a, int b); // cộng hai số

    int sub(int a, int b); // trừ hai số

    default float div(int a, int b) {
        return 1;
    }

    default float mul(int a, int b) {
        return 0;
    }
}

interface otherCalculable extends Calculable {
    @Override
    default float div(int a, int b) {
        return 1.0f * a / b;
    }

    float mul(int a, int b); // trở thành abstract methods
}

/**
 * lớp Calculator implements interface trên
 */
class Calculator implements otherCalculable {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public float div(int a, int b) {
        if (b == 0) {
            System.out.println("Mau phai khac 0");
            return Float.NaN;
        }
        return a * 1.0f / b;
    }
 
    @Override
    public float mul(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        Calculable cal = new Calculator();
        System.out.println(STR."\{a} + \{b} = \{cal.add(a, b)}");
        System.out.println(STR."\{a} - \{b} = \{cal.sub(a, b)}");

        //goi cac default method;
        System.out.println(STR."\{a} * \{b} = \{cal.div(a, b)}");
        System.out.println(STR."\{a} / \{b} = \{cal.mul(a, b)}");
    }
}




