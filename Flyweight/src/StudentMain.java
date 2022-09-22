import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        StudentFactory studentFactory = new StudentFactory();
        List<Student> students = new ArrayList<>();

        students.add(studentFactory.getStudentByPosition("bachelor"));
        students.add(studentFactory.getStudentByPosition("master"));
        students.add(studentFactory.getStudentByPosition("postgraduate"));

        students.forEach(Student::study);
    }
}
