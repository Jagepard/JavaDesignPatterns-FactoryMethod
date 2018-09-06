package Creational.FactoryMethod;

public class Main {

    public static void main(String[] args) {
        FactoryMethodInterface factory = new FactoryMethod();

        System.out.printf("Created {%s}\n", factory.getProduct("First"));
        System.out.printf("Created {%s}\n", factory.getProduct("Second"));
    }
}
