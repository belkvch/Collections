package ex7;

import java.math.*;
import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Employe> treeSet = new TreeSet<Employe>();
        Employe firstEmployee = new Employe("Андреенко Елена Алексеевна", 1101, new BigDecimal(40000));
        Employe secondEmployee = new Employe("Баденкова Оксана Петровна", 102, new BigDecimal(80000));
        Employe thirdEmployee = new Employe("Калаганова Наталья Игоревна", 123, new BigDecimal(150000));
        Employe fourthEmployee = new Employe("Калаганова Юлия Николаевна", 200, new BigDecimal(150000));
        Employe fifthEmployee = new Employe("Калаганова Юлиана Юрьевна", 180, new BigDecimal(150000));
        treeSet.add(firstEmployee);
        treeSet.add(secondEmployee);
        treeSet.add(thirdEmployee);
        treeSet.add(fourthEmployee);
        treeSet.add(fifthEmployee);
        System.out.println("--------------------------------------------");

        for (Employe employee : treeSet) {
            System.out.println("ID сотрудника: " + employee.getID());
            System.out.println("ФИО сотрудника: " + employee.getName());
            System.out.println("Зарплата сотрудника :" + employee.getSalary());
            System.out.println("--------------------------------------------");
        }
    }
}
