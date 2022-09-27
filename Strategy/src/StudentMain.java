public class StudentMain {
    public static void main(String[] args) {
        System.out.println("\nStudent");
        Student student = new Student();

        student.setAction(new Eating());
        student.doAction();

        student.setAction(new Homework());
        student.doAction();

        student.setAction(new Programming());
        student.doAction();

        student.setAction(new Sleeping());
        student.doAction();

        System.out.println("\nJava Developer");
        JavaDeveloper javaDeveloper = new JavaDeveloper();

        javaDeveloper.setAction(new Eating());
        javaDeveloper.doAction();

        javaDeveloper.setAction(new Homework());
        javaDeveloper.doAction();

        javaDeveloper.setAction(new Programming());
        javaDeveloper.doAction();

        javaDeveloper.setAction(new Sleeping());
        javaDeveloper.doAction();


        System.out.println("\nFrontend Developer");
        FrontendDeveloper frontendDeveloper = new FrontendDeveloper();

        frontendDeveloper.setAction(new Eating());
        frontendDeveloper.doAction();

        frontendDeveloper.setAction(new Homework());
        frontendDeveloper.doAction();

        frontendDeveloper.setAction(new Programming());
        frontendDeveloper.doAction();

        frontendDeveloper.setAction(new Sleeping());
        frontendDeveloper.doAction();
    }
}
