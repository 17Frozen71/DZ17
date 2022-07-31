package ru.learnup.maven;

public interface ProductExpirationDate {
    default int expiration(int date) {
        return date;
    }
    default int expiration_1() {
        return -1;
    }
}
