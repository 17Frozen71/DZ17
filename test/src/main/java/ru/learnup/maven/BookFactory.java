package ru.learnup.maven;

public class BookFactory implements ProductFactory,ShopBook, ProductExpirationDate {

    @Override
    public Product createProduct(String name, int price, int weight) {
        return new Book(name, price, weight);
    }

    @Override
    public Product createProduct(String name, int price, int weight, int exeption_date) {
        return null;
    }
}