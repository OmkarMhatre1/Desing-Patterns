package AbstractFactoryDesignPattern;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory factory) {
        return factory.createEmployee();
    }

    public static Employee getSalary(EmployeeAbstractFactory factory){
        return factory.getSalary();
    }

}
