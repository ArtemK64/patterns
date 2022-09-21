public interface EmployeeBuilder {
    EmployeeBuilder firstName(String firstName);
    EmployeeBuilder lastName(String lastName);
    EmployeeBuilder middleName(String middleName);
    EmployeeBuilder position(String position);
    EmployeeBuilder age(int age);
    EmployeeBuilder workExperience(int workExperience);
    EmployeeBuilder nameOfCompany(int nameOfCompany);
    EmployeeBuilder salary(int salary);

    Employee build();
}
