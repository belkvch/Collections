package ex9;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> countries = new ArrayDeque<String>();
        countries.add("Германия");
        countries.addFirst("Франция");//добавляем элемент в начало
        countries.push("Великобритания");//добавляем элемент вначало коллекции
        countries.addLast("Испания");//добавляем элемент в конец коллекции
        countries.add("Беларусь");
        System.out.println(countries.getFirst());
        System.out.println(countries.getLast());
        System.out.println("Размер очереди:\n" + countries.size());
        while (countries.peek() != null) {// извлечение c начала
            System.out.println(countries.pop());
        }
    }
}
