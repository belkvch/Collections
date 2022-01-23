package ex3;

import java.util.LinkedList;

class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Не проблемы должны толкать Вас в спину, а впереди вести мечты.");
        linkedList.add("За черной полосой идет белая, за ночью – рассвет, за болезнью – выздоровление.");
        linkedList.add("Дойдя до конца, люди смеются над страхами, мучившими их вначале.");
        linkedList.add("Если ты не знаешь, чего хочешь, ты в итоге останешься с тем, чего точно не хочешь.");
        linkedList.addLast("Чтобы дойти до цели, надо идти.");
        linkedList.addFirst("Это своего рода забава, делать невозможное.");
        linkedList.add(1, "Пробуйте и терпите неудачу, но не прерывайте ваших стараний.");

        System.out.println("Исходное содержимое связного списка linkedList: ");
        for (String s : linkedList) {
            System.out.println(s);
        }
        System.out.println("-------------------------------------------------------------------------------");

        linkedList.remove("Пробуйте и терпите неудачу, но не прерывайте ваших стараний.");
        linkedList.remove(2);
        System.out.println("Содержимое связного списка linkedList после удаления элементов:");
        for (String s : linkedList) {
            System.out.println(s);
        }
        System.out.println("-------------------------------------------------------------------------------");

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Содержимое связного списка linkedList после удаления первого и последнего элементов: ");
        for (String s : linkedList) {
            System.out.println(s);
        }
        System.out.println("-------------------------------------------------------------------------------");

        String val = linkedList.get(2);
        val = val.substring(0, val.length() - 1);
        linkedList.set(2, val + " ЗНАТЬ. ");
        System.out.println("Содержимое связного списка linkedList после изменения:");
        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}
