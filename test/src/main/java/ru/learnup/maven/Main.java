package ru.learnup.maven;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
// Для наполнения списка создадим 8 товаров
        //С помощью фабрики создадим часть продуктов
        Product product1 = new BookFactory().createProduct("Снежный десант", 147, 450);
        Product product2 = new Soap("Хозяйственное мыло", 50, 100);
        Product product3 = new CakeFactory().createProduct("Яблочное наслаждение", 350, 1500, 12);
        Product product4 = new Book("Мыло", 350, 200);
        Product product5 = new Cake("Торт Снежный", 100, 100, 25);
        Product product6 = new Soap("Яблочное мыло", 100, 100);


//Создаем массив, где храним все товары
        List<Product> list_product = new ArrayList<>() ;
        list_product.add(product1);
        list_product.add(product2);
        list_product.add(product3);
        list_product.add(product4);
        list_product.add(product5);
        list_product.add(product6);

//1.Создание поисковых индексов дл товаров
        //Создаем список слов всех товаров
        HashMap<String, List <Product>> shop = new HashMap<>();
        Set<String> wordi=Index.words_P(list_product);
        //Каждое слово становится поисковым индексом и к нему привязываются товары и сразу же выведем товары и их поисковый индекс
        for (String wow : wordi)
            shop.put(wow, Index.products(list_product, wow));
        System.out.println((Index.serch_Stream("мыло",shop).count()));

//2.Добавляем в поисковый индекс возможность по товару получить стрим из всех товаров, которые могут находиться вместе с ним при поиске по слову

        // Используем синглтон и проверим, что исполняться будет всего один раз
        Singleton.getInstance("Яблочное мыло", shop);
        Singleton.getInstance("Яблочное мыло", shop);

        //Используем синхронизированный
        Singleton.getInstance_synchronized("Торт Снежный",shop);
        Singleton.getInstance_synchronized("Торт Снежный",shop);
    }
}
