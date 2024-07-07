package chapter6;

public class Lesson64 {
    enum Size{
        EXTRA_SMALL, SMALL, LARGE, EXTRA_LARGE
    }

    public static void main(String[] args) {
        //VD1:
//        Season winter = Season.WINTER;
//        Season summer = Season.SUMMER;
//        System.out.println(winter.getValue());
//        System.out.println(winter == summer);  //false

        //VD2:
        Size mySize = Size.EXTRA_LARGE;
        Size brotherSize = Size.EXTRA_SMALL;

        if(mySize == brotherSize){
            System.out.println("Hai anh em có thê mặc chung quàn áo");
        }else {
            System.out.println("Hai anh em không thể mặc cùng một quần áo ");
        }
    }

}

