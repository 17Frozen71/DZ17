package ru.learnup.maven;

public interface ShopCake {
    default String category() {
        return "Торт";
    }
}
