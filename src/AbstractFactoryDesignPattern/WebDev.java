package AbstractFactoryDesignPattern;

public class WebDev implements Employee {

    @Override
    public int salary() {
        return 4;
    }

    @Override
    public String name() {
        System.out.println("Web Dev");
        return "Web_Dev";
    }
}
