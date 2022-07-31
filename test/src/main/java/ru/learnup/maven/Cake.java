package ru.learnup.maven;

import java.io.Serializable;

public class Cake extends Product implements ShopCake, ProductExpirationDate, Serializable {


    public Cake(String name, int price, int weight, int expirationdate) {
        super(name, price, weight);
        this.expiration_date = expiration(expirationdate);
        this.category = category();
    }
}
