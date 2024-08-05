package chapter9.lesson99;

public class Example1LamdaExpression{
    public static void main(String[] args) {
        ButtonClass button = new ButtonClass();
        button.pressClick(() -> System.out.println("Nút đang được ấn"));
    }
}

interface PressHandler{
    void pressEventHandler();
}

class ButtonClass {
    public void pressClick(PressHandler handler){
        handler.pressEventHandler();
    }
}
