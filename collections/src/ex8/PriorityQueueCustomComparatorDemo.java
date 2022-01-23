package ex8;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustomComparatorDemo {
    public static void main(String[] args) {
        Comparator<String> stringLengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };
        /*
The above Comparator can also be created using lambda
expression like this =>
Comparator<String> stringLengthComparator = (s1, s2) -> {
            return s1.length() - s2.length();
        };
        Which can be shortened even further like this =>
Comparator<String> stringLendgthComparator = Comparator.comparingInt(String::length);
*/
        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);
        namePriorityQueue.add("Петровский Василий");
        namePriorityQueue.add("Иванова Татьяна");
        namePriorityQueue.add("Гук Илья");
        namePriorityQueue.add("Петражицкая Екатерина");
        namePriorityQueue.add("Зарудный Илья");
        namePriorityQueue.add("Пасынков Вадим");
        while (!namePriorityQueue.isEmpty()) {
            System.out.println(namePriorityQueue.remove());
        }
    }
}

