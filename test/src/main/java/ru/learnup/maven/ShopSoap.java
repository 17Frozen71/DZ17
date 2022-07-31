package ru.learnup.maven;

public interface ShopSoap {
    default String category() {
        return "Мыло";
    }
}
