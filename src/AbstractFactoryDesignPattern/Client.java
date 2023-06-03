package AbstractFactoryDesignPattern;

public class Client {

    public static void main(String[] args) {

        //android dev
        Employee employee = EmployeeFactory.getEmployee(new AndroidDevFactory());
        employee.name();
        System.out.println(employee.salary());

        Employee employee1 = EmployeeFactory.getEmployee(new WebDevFactory());
        employee1.name();
        System.out.println(employee1.salary());
    }
}
