package FactoryDesignPattern;

public class AndroidDev implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting Android Dev Salary");
        return 50000;
    }
}
