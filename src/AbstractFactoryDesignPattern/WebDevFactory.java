package AbstractFactoryDesignPattern;

public class WebDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new WebDev();
    }

    @Override
    public Employee getSalary() {
        return new WebDev();
    }


}
