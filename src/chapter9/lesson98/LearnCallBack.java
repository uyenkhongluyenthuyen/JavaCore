package chapter9.lesson98;

//callback trong java đơn giản là goi 1 interface ở trong một cái method khác

interface Greetable{ //funtional interface: interface cos duy nhat 1 method
    void greet();
}

public class LearnCallBack {
    public static void main(String[] args) {
        CatGreeting  catGreeting = new CatGreeting();
        DuckGreeting duckGreeting = new DuckGreeting();
        PigGreeting pigGreeting = new PigGreeting();

        var test = new LearnCallBack();
        test.sayGreet(catGreeting);
        test.sayGreet(duckGreeting);
        test.sayGreet(pigGreeting);
    }

    public void sayGreet(Greetable greetable){
        greetable.greet();
    }
}

class CatGreeting implements Greetable{

    @Override
    public void greet() {
        System.out.println("mèo méo meo");
    }
}

class PigGreeting implements Greetable{
    @Override
    public void greet() {
        System.out.println("ecs ec");
    }
}

class DuckGreeting implements Greetable{
    @Override
    public void greet() {
        System.out.println("quac quac");
    }
}