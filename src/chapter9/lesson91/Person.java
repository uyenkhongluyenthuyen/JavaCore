package chapter9.lesson91;

import java.util.Date;

public abstract class Person {
    private String id;
    private String name;
    private String address;
    private Date dateOfBirth;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    //hành động kiếm tiền của một người nói chung
    protected abstract void earnMoney();
}

class Student extends Person{
    private String studentId;
    private String major;
    private float avgGrade;

    //...
    @Override
    public void earnMoney() {
        System.out.println(STR."Sinh viên kiếm tiền bằng cách đi làm thêm");
    }

}

class Instructor extends Person{

    @Override
    protected void earnMoney() {
        System.out.println("Giảng viên kiếm tiền bằng cách đi dạy...");
    }
}

class Programer extends Person{

    @Override
    protected void earnMoney() {
        System.out.println("Lập trình viên đi kiếm tiền bằng cách đi code dạo...");
    }
}