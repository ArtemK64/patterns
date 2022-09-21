public class Director extends EmployeeDecorator {
    public Director(Employee employee) {
        super(employee);
    }

    public void negotiateWithPartners() {
        System.out.println("Director was negotiated with partners");
    }

    @Override
    public void work() {
        super.work();
        negotiateWithPartners();
    }
}
