package J_Collection;
import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Student> A1 = new ArrayList<>();
        A1.add(new Student(1,"siva"));
        A1.add(new Student(2,"sanjay"));
        A1.add(new Student(3,"karan"));
        A1.add(new Student(4,"raj"));
        A1.add(new Student(5,"sathish"));

        for (Student student:A1) {
            System.out.println(student.getName());
        }
    }
}
