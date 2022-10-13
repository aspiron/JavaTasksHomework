package HW090922;

import HW090922.level2.Book;
import HW090922.level2.Magazine;
import HW090922.level2.Printable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Printable> needToPrint = new ArrayList<>();
        needToPrint.add(new Book("azbuka"));
        needToPrint.add(new Book("slovarik"));
        needToPrint.add(new Book("uchebnik"));
        needToPrint.add(new Magazine("maxim"));
        needToPrint.add(new Magazine("forbes"));
        needToPrint.add(new Magazine("Men'sHealth"));

        for (Printable printable : needToPrint) {
            System.out.println("I need to print: " + printable.print());
        }


    }

}


