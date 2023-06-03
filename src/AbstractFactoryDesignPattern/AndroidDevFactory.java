package AbstractFactoryDesignPattern;

public class AndroidDevFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new AndroidDev();
    }

    @Override
    public Employee getSalary() {
        return new AndroidDev() ;
    }


}
