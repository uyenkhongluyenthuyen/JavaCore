package model;

public class Student {
    private String fullName;
    private float pga;

    public Student(String fullName, float pga) {
        this.fullName = fullName;
        this.pga = pga;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getPga() {
        return pga;
    }

    public void setPga(float pga) {
        this.pga = pga;
    }
}
