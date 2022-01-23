package ex15;

import java.util.*;

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> addressLinkedList = new LinkedList<Address>();
        addressLinkedList.add(new Address("Sidorov", "address1", "Minsk", "3333"));
        addressLinkedList.add(new Address("Sid", "address2", "Brest", "2323"));
        addressLinkedList.add(new Address("Orov", "address3", "Mogilev", "3233"));
        for (Address element : addressLinkedList) {
            System.out.println(element + "\n");
        }
    }
}
