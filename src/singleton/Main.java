package singleton;

public class Main {

    public static void main(String[] args) {
        Student student1 = Student.getStudent();
        Student student2 = Student.getStudent();

        System.out.println(student1.hashCode() + " " + student2.hashCode());
    }
}
