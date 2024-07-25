package chapter8;

import java.util.Objects;

public class Person {
    private String id;
    private String phoneNumber;

    @Override
    public boolean equals(Object otherObj) { //bước 1
        if (this == otherObj) return true;//bước 2
        if (otherObj == null //bước 3
                || getClass() != otherObj.getClass()) //bước 4
            return false;
        Person other = (Person) otherObj; // bước 5
        return Objects.equals(id, other.id) && Objects.equals(phoneNumber, other.phoneNumber); //bước 6
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phoneNumber);
    }
}
