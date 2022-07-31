package ru.learnup.maven;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class Hello {
    public static void main(String[] args) throws URISyntaxException, IOException {
        System.out.println("Hello world");
        URL resours = Hello.class.getResource("1.txt");
        System.out.println(resours);
        Files.readAllLines(Path.of(resours.toURI()))
                .forEach(System.out::println);
    }
}
