import lombok.Data;

@Data
public class Employee {
    String firstName;
    String lastName;
    String middleName;
    String position;
    int age;
    int workExperience;
    int nameOfCompany;
    int salary;

    Employee(String firstName, String lastName, String middleName, String position, int age, int workExperience, int nameOfCompany, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.position = position;
        this.age = age;
        this.workExperience = workExperience;
        this.nameOfCompany = nameOfCompany;
        this.salary = salary;
    }

    Employee() {}
}
