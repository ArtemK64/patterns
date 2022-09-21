public class EmployeeBuilderImplementation implements EmployeeBuilder {
    Employee employee = new Employee();

    @Override
    public EmployeeBuilder firstName(String firstName) {
        employee.firstName = firstName;
        return this;
    }

    @Override
    public EmployeeBuilder lastName(String lastName) {
        employee.lastName = lastName;
        return this;
    }

    @Override
    public EmployeeBuilder middleName(String middleName) {
        employee.middleName = middleName;
        return this;
    }

    @Override
    public EmployeeBuilder position(String position) {
        employee.position = position;
        return this;
    }

    @Override
    public EmployeeBuilder age(int age) {
        employee.age = age;
        return this;
    }

    @Override
    public EmployeeBuilder workExperience(int workExperience) {
        employee.workExperience = workExperience;
        return this;
    }

    @Override
    public EmployeeBuilder nameOfCompany(int nameOfCompany) {
        employee.nameOfCompany = nameOfCompany;
        return this;
    }

    @Override
    public EmployeeBuilder salary(int salary) {
        employee.salary = salary;
        return this;
    }

    @Override
    public Employee build() {
        return employee;
    }
}