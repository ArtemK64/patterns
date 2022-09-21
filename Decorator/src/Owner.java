public class Owner extends EmployeeDecorator {
    public Owner(Employee employee) {
        super(employee);
    }

    public void controlCompany() {
        System.out.println("The company is under control");
    }

    @Override
    public void work() {
        super.work();
        controlCompany();
    }
}
