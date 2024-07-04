package chapter6;

public class Lesson61 {
    public static void main(String[] args) {
        Student lan = new Student("SV102", "Nguyễn Thúy Lan");
        Student nam = new Student("SV103", "Nguyễn Hải Nam", 3.26f,
                "nam@gmail.com", "Hà Nội");
        Student nga = new Student("SV104", "Lê Thu Nga", 3.2f,
                "nga@gmail.com", "Hà Nội");
        Student[] students = new Student[10];
        students[0] = lan;
        students[1] = nga;
        students[2] = nam;

        var loan = new Student("SV101", "Mai Loan");
        loan.doExam("Java OOP");
        loan.doHomework("DSA");

        showResult(students);

    }
    public static void showResult(Student[] students){
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
