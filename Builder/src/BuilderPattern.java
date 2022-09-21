public class BuilderPattern {
    public static void main(String[] args) {
        Employee employee = new EmployeeBuilderImplementation().firstName("Ivan").age(30).position("Programmer").workExperience(10).build();
        System.out.println(employee);
    }
}