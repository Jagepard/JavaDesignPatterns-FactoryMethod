package Creational.FactoryMethod;

public class SecondProduct  implements ProductInterface{

    @Override
    public void getClassName() {
        System.out.println(getClass().getName());
    }
}
