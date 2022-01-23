package ex7;

import java.math.BigDecimal;
import java.util.TreeSet;

class Employe implements Comparable<Employe> {
    private String name;
    private int ID;
    private BigDecimal salary;

    public Employe(String name, int ID, BigDecimal salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Employe employe) {
        System.out.print("Был вызван метод compareTo для сортировки сотрудников по возрастанию по ID, ");
        System.out.println("this.getID()= " + this.getID() + ", employee.getID()=" + employe.getID());
        if (this.getID() < employe.getID()) {
            return -1;
        } else if (this.getID() > employe.getID()) {
            return 1;
        } else return 0;
    }

    @Override
    public String toString() {
        return "Имя сотрудника=" + name + ", ID=" + ID + ", зарплата=" + salary + "";
    }
}
