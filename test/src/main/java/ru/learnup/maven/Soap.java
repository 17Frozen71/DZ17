package ru.learnup.maven;

import java.io.Serializable;

public class Soap extends Product implements ShopSoap, ProductExpirationDate, Serializable {

    public Soap(String name, int price, int weight) {
        super(name, price, weight);
        this.expiration_date = expiration_1();
        this.category = category();
    }
}
