package ex13;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Иванов Иван");
        arrayList.add("Переходцева Ирина");
        arrayList.add("Петровский Максим");
        arrayList.add("Захаренко Юлия");
        arrayList.add("Зарудный Илья");
        arrayList.add("Петроченко Александр");
        System.out.println("Исходное содержимое списочного массива сотрудников: ");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element + " ");
        }
        System.out.println();
        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            listIterator.set(element + "+");
        }
        System.out.println("Измененное содержимое списочного массива сотрудников: ");
        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element + " ");
        }
        System.out.println();
        System.out.println("Список сотрудников в обратном порядке:");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println(element + " ");
        }
    }
}
