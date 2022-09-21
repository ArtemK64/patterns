public class Task {
    public static void main(String[] args) {
        Employee employee = new Owner(new Director(new Manager(new Consultant())));
        employee.work();
    }
}