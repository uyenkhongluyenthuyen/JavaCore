package chapter10.exp1;

public class Cat {
    private String color;
    private  int age;
    private String favFood;
    private String colorEye;
    private String petName;

    public Cat() {
    }

    public Cat(String petName) {
        this.petName = petName;
    }

    public Cat(int age, String petName) throws InvalidAgeException {
        setAge(age);
        this.petName = petName;
    }

    public Cat(String color, int age, String favFood, String colorEye, String petName)
            throws InvalidAgeException {
        this.color = color;
        setAge(age);
        this.favFood = favFood;
        this.colorEye = colorEye;
        this.petName = petName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if(age > 0 && age < 50){
            this.age = age;
        }else {
            this.age = 0;
            String msg = "Tuoi khong hop le";
            throw new InvalidAgeException(this.age);
        }
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public String getColorEye() {
        return colorEye;
    }

    public void setColorEye(String colorEye) {
        this.colorEye = colorEye;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}
