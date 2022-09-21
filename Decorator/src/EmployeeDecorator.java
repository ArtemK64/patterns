public class EmployeeDecorator implements Employee {
    Employee employee;

    public EmployeeDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void work() {
        employee.work();
    }
}
