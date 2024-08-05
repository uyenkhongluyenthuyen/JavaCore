package chapter10.lesson105;

public class InvalidGradeException extends Exception{
    private float invalidGrade;

    public InvalidGradeException() {
    }

    public InvalidGradeException(float invalidGrade) {
        this.invalidGrade = invalidGrade;
    }

    public InvalidGradeException(String message, float invalidGrade) {
        super(message);
        this.invalidGrade = invalidGrade;
    }

    public float getInvalidGrade() {
        return invalidGrade;
    }
}
