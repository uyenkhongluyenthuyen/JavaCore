package chapter10.lesson105;

public class Student {
    private String id;
    private String fullName;
    private float agvGrade;

    public Student() {
    }

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Student(String id, String fullName, float agvGrade)
            throws InvalidGradeException {
        this.id = id;
        this.fullName = fullName;
        setAgvGrade(agvGrade);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getAgvGrade() {
        return agvGrade;
    }

    //kiem tra truc khi gan
    public void setAgvGrade(float agvGrade) throws InvalidGradeException {
        if (agvGrade >= 0.0 && agvGrade <= 10.0) {
            this.agvGrade = agvGrade;
        } else {
            this.agvGrade = 0.0f;
            String msg = "Ban da nhap diem ko hop le";
            throw new InvalidGradeException(msg, agvGrade); //vang 1 ngoai le checked exception tu viet ra
        }
    }
}
