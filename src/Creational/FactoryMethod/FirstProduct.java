package Creational.FactoryMethod;

public class FirstProduct implements ProductInterface {

    @Override
    public void getClassName() {
        Main.echo(getClass().getName());
    }
}
