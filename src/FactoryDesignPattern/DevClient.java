package FactoryDesignPattern;

public class DevClient {
    public static void main(String[] args) {

        Employee androidDev = EmployeeFactory.getEmployee("Android Dev");
        System.out.println(androidDev);
        System.out.println(androidDev.salary());

        Employee wevDev = EmployeeFactory.getEmployee("Web Dev");
        System.out.println(wevDev.salary());


    }
}
