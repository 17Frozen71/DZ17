package ru.learnup.maven;

import java.util.HashMap;
import java.util.List;

public class Singleton {
    private static Singleton instance;
    private static Singleton instance_synchronized;

    public static Singleton getInstance(String name, HashMap<String, List<Product>> shop) {
        if (instance == null){
            instance = new Singleton(name, shop);
        }
        return instance;
    }

    public static synchronized Singleton getInstance_synchronized(String name, HashMap<String, List<Product>> shop){
        if (instance_synchronized == null){
            instance_synchronized = new Singleton(name, shop);
        }
        return instance_synchronized;
    }

    private Singleton(String name, HashMap<String, List<Product>> shop) {
        Index.serch_Stream(name,shop);
    }
}

