package FactoryDesignPattern;

public class WebDev implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting web dev salary");
        return 40000;
    }
}
