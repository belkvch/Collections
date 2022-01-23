package ex6;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Андреенко Елена");
        linkedHashSet.add("Баденкова Оксана");
        linkedHashSet.add("Беседа Мария");
        linkedHashSet.add("Борбух Владимир");
        linkedHashSet.add("Ковальчук Александр");
        System.out.println("Список сотрудников: ");
        for (String s : linkedHashSet) {
            System.out.println(s);
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Андреенко Елена");
        arrayList.add("Борбух Владимир");
        arrayList.add("Ковальчук Александр");
        arrayList.add("Имя");
        System.out.println("Список сотрудников, которые едут в командировку:");
        for (String s : arrayList) {
            System.out.println(s);
        }
        boolean isRetained = linkedHashSet.retainAll(arrayList);
        System.out.println("успешно сформирован список командировки: " + (isRetained ? "да" : "нет"));
        System.out.println("Список сотрудников, которые едут в командировку: ");
        for (String s : linkedHashSet) {
            System.out.println(s);
        }
    }
}
