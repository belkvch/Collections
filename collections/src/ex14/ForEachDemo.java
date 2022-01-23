package ex14;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("Исходное содержимое списочного массива arrayList:");
        arrayList.forEach(element -> System.out.println(element));
        int sum = 0;
        for (int element : arrayList) sum += element;
        System.out.println("Сумма числовых значений: " + sum);
    }
}
