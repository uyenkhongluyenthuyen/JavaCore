package chapter11.lesson112;


public class Example2 {
    public static void main(String[] args) {
        MyMap<Integer, String> mapOne = new MyMap<>(1, "One");
        System.out.println("Key: " + mapOne.getKey()
                + " - Value: " + mapOne.getValue() );

        MyMap<String, String> hello = new MyMap<>("hello", "Xin chao");
        System.out.println("Key: " + hello.getKey()
                + " - Value: " + hello.getValue() );
    }
}
