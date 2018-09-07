package Creational.FactoryMethod;

public class FactoryMethod implements FactoryMethodInterface {

    ProductInterface product;

    @Override
    public ProductInterface getProduct(String name) {
        switch (name) {
            case "First":
                this.product = new FirstProduct();
                break;
            case "Second":
                this.product = new SecondProduct();
                break;
        }

        return this.product;
    }
}
