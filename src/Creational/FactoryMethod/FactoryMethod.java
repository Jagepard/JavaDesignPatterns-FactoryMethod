package Creational.FactoryMethod;

public class FactoryMethod implements FactoryMethodInterface {

    @Override
    public ProductInterface getProduct(String name) {
        if (name == "Second") {
            return new SecondProduct();
        }

        return new FirstProduct();
    }
}
