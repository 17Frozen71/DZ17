package ru.learnup.maven;

public abstract class Product {

    protected String name;
    protected int price;
    public int weight;
    public String category;
    public int expiration_date;

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "название: " + name +
                ", цена: " + price +
                ", вес: " + weight +
                ", категория: " + category +
                ", срок годности: " + expiration_date;
    }

}
