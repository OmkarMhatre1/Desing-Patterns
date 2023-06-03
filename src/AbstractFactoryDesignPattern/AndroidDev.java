package AbstractFactoryDesignPattern;

public class AndroidDev implements Employee {
    @Override
    public int salary() {
        return 5;
    }

    @Override
    public String name() {
        System.out.println("Android Dev");
        return "Android_Dev";
    }
}
