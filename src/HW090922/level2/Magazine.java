package HW090922.level2;

import HW090922.Main;

import java.util.ArrayList;
import java.util.List;

public class Magazine implements Printable{
private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String print() {
        return (Magazine.this.name.toUpperCase() + ", this is a magazine");
    }

    public static void printMagazine(Printable printable){
        System.out.println(" Only magazines this time. ");
    }
}
