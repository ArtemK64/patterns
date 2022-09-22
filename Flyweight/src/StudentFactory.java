import java.util.*;

public class StudentFactory {
    private static final Map<String, Student> students = new HashMap<>();

    public Student getStudentByPosition(String position) {
        Student student = students.get(position);

        if (student == null) {
            switch (position.toLowerCase()) {
                case "bachelor" -> {
                    System.out.println("This is a bachelor");
                    student = new Bachelor();
                }
                case "master" -> {
                    System.out.println("This is a master");
                    student = new Master();
                }
                case "postgraduate" -> {
                    System.out.println("This is a postgraduate student");
                    student = new Postgraduate();
                }
                default -> throw new IllegalArgumentException("You wrote incorrect value");
            }
            students.put(position, student);
        }
        return student;
    }
}
