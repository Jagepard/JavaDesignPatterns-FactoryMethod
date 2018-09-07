package Creational.FactoryMethod;

public class SecondProduct implements ProductInterface {

    @Override
    public void getClassName() {
        Main.echo(getClass().getName());
    }
}
