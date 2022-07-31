package ru.learnup.maven;

import java.io.Serializable;

public class Book extends Product implements ShopBook, ProductExpirationDate, Serializable {

    public Book(String name, int price, int weight) {
        super(name,price,weight);
        this.expiration_date = expiration_1();
        this.category = category();
    }
}
