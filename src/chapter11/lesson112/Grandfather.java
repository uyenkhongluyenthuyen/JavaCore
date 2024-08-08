package chapter11.lesson112;

public class Grandfather {

}

class Father{

}

class Child extends Father{

}

class Grandchildren extends Child{
    private String name;

    public Grandchildren() {
    }

    public Grandchildren(String name) {
        this.name = name;
    }
}