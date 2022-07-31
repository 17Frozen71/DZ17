package ru.learnup.maven;

import java.util.*;
import java.util.stream.Stream;

public class Index {
    public static Stream<Product> serch_Stream (String name, HashMap<String, List<Product>> shop) {
        String[] result = name.split(" ");
        Set <Product> set = new HashSet<>();
        for (String i : result )
            set.addAll(shop.get(i.toLowerCase()));
        Stream <Product> search = set.stream();
        System.out.println("\nПо запросу \"" + name + "\" нашлись товары: ");
        search.forEach(System.out::println);
        return search;
    }

    //Метод создания поисковых индексов для начальных товаров
    public static List<Product> products(List<Product> arr, String name) {
        List<Product> New_Array = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            String[] words = (arr.get(i).name).split(" ");
            for (String word : words) {
                if (((word).equalsIgnoreCase(name)))
                    New_Array.add(arr.get(i));
            }
        }
        return New_Array;
    }

    //Метод для создания поисковых слов
    public static Set<String> words_P(List<Product> list) {
        Set<String> wordP = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            String[] words = (list.get(i).name).split(" ");
            for (String word : words)
                wordP.add(word.toLowerCase());
        }
        return wordP;
    }
}

