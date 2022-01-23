package ex12;

import java.util.*;

public class EnumSetDemo {
    public static void main(String[] args) {
        EnumSet<CARS> enumSet = EnumSet.of(CARS.AUDI, CARS.RANGE_ROVER);
        System.out.println("Initial set: " + enumSet);
        EnumSet<CARS> finalSaleEnumSet = EnumSet.complementOf(enumSet);
        System.out.println("The updated set is: " + finalSaleEnumSet);
    }
}
