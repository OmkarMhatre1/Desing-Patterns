package FactoryDesignPattern;

public class Manger implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting manager salary");
        return 100000;
    }
}
