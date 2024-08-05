package chapter9.lesson98;

public class CallBackExample2 {
    public static void main(String[] args) {
        Button myButton = new Button();
        Handler handler = new Handler();
        myButton.onclick(handler);

//        new Button().onclick(new EventHandler() {
//            @Override
//            public void clickEventHandler() {
//                System.out.println("Một nút khác được nhấn ");
//            }
//        });
        //hoăc sử dụng biểu thức lamda
        new Button().onclick(() -> System.out.println("Một nút đăng kí khác được nhấn "));
        new Button().onclick(() -> System.out.println("Một nút đăng nhập khác được nhấn "));
        new Button().onclick(() -> System.out.println("Một nút đăng xuất khác được nhấn "));

    }
}

interface EventHandler{
    void clickEventHandler();
}

class Button{
    public void onclick(EventHandler handler){
        handler.clickEventHandler();
    }
}

class Handler implements EventHandler{
    @Override
    public void clickEventHandler() {
        System.out.println("Nút đang được nhấn");
    }
}