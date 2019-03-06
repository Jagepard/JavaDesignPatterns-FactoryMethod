package Creational.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        FactoryMethodInterface factory = new FactoryMethod();

        Main.echo(factory.getProduct("First"));
        Main.echo(factory.getProduct("Second"));
    }

    private static void echo(ProductInterface data){
        System.out.printf("Created {%s}\n", data);
    }

    static void echo(String data){
        System.out.println(data);
    }
}
