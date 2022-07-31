package ru.learnup.maven;

public class CakeFactory implements ProductFactory {

    @Override
    public Product createProduct(String name, int price, int weight) {
        return null;
    }

    @Override
    public Product createProduct(String name, int price, int weight, int exeption_date) {
        return new Cake(name, price, weight,exeption_date);
    }
}
