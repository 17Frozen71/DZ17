package ru.learnup.maven;

public interface ProductFactory {
    Product createProduct(String name, int price, int weight);
    Product createProduct(String name, int price, int weight, int exeption_date);
}
