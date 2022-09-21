public class Manager extends EmployeeDecorator {
    public Manager(Employee employee) {
        super(employee);
    }

    public void checkReport() {
        System.out.println("The report was checked");
    }

    @Override
    public void work() {
        super.work();
        checkReport();
    }
}
