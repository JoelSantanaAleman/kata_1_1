package es.ulpgs.dis;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person joel = new Person("Joel", LocalDate.of(2003, 7,26));
        System.out.println(joel);
    }
}
