package chapter9.lesson99;

import java.util.Arrays;

public class Example4Lambda {
    public static void main(String[] args) {
        String[] friends = new String[] {"mai", "uyen", "tuan"};
        Arrays.sort(friends, (f1, f2) -> f2.compareTo(f1));
        for (String f : friends) {
            System.out.println(f);
        }
    }
}
