package ex2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<BigDecimal> arrayListSalary = new ArrayList<BigDecimal>();
        arrayListSalary.add(new BigDecimal(10000.2));
        arrayListSalary.add(new BigDecimal(20000.3));
        arrayListSalary.add(new BigDecimal(30000.5));
        arrayListSalary.add(new BigDecimal(40000.1));
        arrayListSalary.add(new BigDecimal(40000.6));
        for (BigDecimal bd : arrayListSalary) {
            System.out.println("Содержимое коллекции: " + bd.setScale(0, RoundingMode.HALF_UP).doubleValue());
        }

        BigDecimal[] bigDecimalSalary = new BigDecimal[arrayListSalary.size()];
        bigDecimalSalary = arrayListSalary.toArray(bigDecimalSalary);
        BigDecimal sum = new BigDecimal(0);
        for (BigDecimal bd : bigDecimalSalary) {
            sum = sum.add(bd);
        }
        System.out.println("Сумма равна:" + sum.setScale(2,RoundingMode.HALF_UP));
    }
}
