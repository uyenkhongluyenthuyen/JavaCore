package chapter10.exp1;

public class InvalidAgeException extends Exception{
    private int invalidAge;

    public InvalidAgeException() {
    }

    public InvalidAgeException(int invalidAge) {
        this.invalidAge = invalidAge;
    }

    public int getInvalidAge() {
        return invalidAge;
    }
}
