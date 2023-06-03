package FactoryDesignPattern;

public class EmployeeFactory {

    //get the employee
    public static Employee getEmployee(String empType) {

        if (empType.trim().equalsIgnoreCase("Android Dev")) {
            return new AndroidDev();
        } else if (empType.trim().equalsIgnoreCase("Web Dev")) {
            return new WebDev();
        } else {
            return null;
        }
    }

}
