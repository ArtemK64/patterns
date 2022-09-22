public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();

        student.setAction(new Eating());
        student.doAction();

        student.setAction(new Homework());
        student.doAction();

        student.setAction(new Programming());
        student.doAction();

        student.setAction(new Sleeping());
        student.doAction();
    }
}
