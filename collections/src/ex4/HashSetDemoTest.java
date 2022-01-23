package ex4;

import java.util.HashSet;

import static org.junit.Assert.*;

public class HashSetDemoTest {
    HashSet<String> hashSet;
    HashSet<String> clonedHashSet;

    @org.junit.jupiter.api.Test
    public void test() {
        hashSet = new HashSet<String>();
        hashSet.add("Славянская Елена");
        hashSet.add("Левандовская Анна");
        hashSet.add("Владова Алина");
        hashSet.add("Поплавская Эльвира");
        hashSet.add("Воронцова Наталья");
        hashSet.add("Южная Елизавета");
        for (String s : hashSet) {
            System.out.println(s);
        }
        clonedHashSet = (HashSet<String>) hashSet.clone();
        System.out.println("--------------------------------------");
        System.out.println("Дубликат хеш-множества:");
        for (String s : clonedHashSet) {
            System.out.println(s);
        }
        assertEquals(hashSet, clonedHashSet);// метод assertEquals()
        // проверяет совпадают ли существующий объект и полученный

    }
}
