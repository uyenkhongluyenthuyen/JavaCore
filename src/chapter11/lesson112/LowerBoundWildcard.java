package chapter11.lesson112;

import java.util.ArrayList;

public class LowerBoundWildcard {
    public static void addNewObjects(ArrayList<? super Grandchildren> list){
        list.add(new Grandchildren("Nhung"));
        list.add(new Grandchildren("Trang"));
        list.add(new Grandchildren("Hoa"));
    }

    public static void main(String[] args) {
        ArrayList<Father> fathers = new ArrayList<>();
        ArrayList<Child> children = new ArrayList<>();
        ArrayList<Grandchildren> grandchildren = new ArrayList<>();
        addNewObjects(fathers); // ok
        addNewObjects(children); // ok
        addNewObjects(grandchildren); // ok
    }
}
