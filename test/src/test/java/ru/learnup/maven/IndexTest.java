package ru.learnup.maven;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class IndexTest {

    @Test
    @DisplayName("Тест на проверку количества созданых поисковых индексов для начальных товаров")
    void products() {
        List<Product> list_product = new ArrayList<>() ;
        list_product.add(new Soap("Хозяйственное мыло", 50, 100));
        list_product.add(new Book("Мыло", 350, 200));
        list_product.add(new Cake("Хозяйственное мороженое", 450, 578, 22));

        int actually = Index.products(list_product,"мыло").size();
        int expected = 2;
        assertEquals(expected, actually);
    }

    @Test
    @DisplayName("Тест на проверку количества составленных слов")
    void words_P() {
        List<Product> list_product = new ArrayList<>() ;
        list_product.add(new Soap("Хозяйственное мыло", 50, 100));
        list_product.add(new Book("Мыло", 350, 200));
        list_product.add(new Cake("Хозяйственное мороженое", 450, 578, 22));

        int actually = Index.words_P(list_product).size();
        int expected = 3;
        assertEquals(expected, actually);
    }
}