package ru.learnup.maven;

public interface ShopBook {
    default String category() {
        return "Книга";
    }
}
