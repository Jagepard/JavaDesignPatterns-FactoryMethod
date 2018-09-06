package Creational.FactoryMethod;

public class FirstProduct implements ProductInterface{

    @Override
    public void getClassName() {
        System.out.println(getClass().getName());
    }
}
