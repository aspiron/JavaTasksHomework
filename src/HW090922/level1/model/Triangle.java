package HW090922.level1.model;

import HW090922.level1.Color;
import HW090922.level1.interfac.Artist;
import HW090922.level1.interfac.Painter;

public class Triangle extends Figure implements Artist, Painter {
    int base;
    int height;

    public Triangle(char cymbol, Color color, int base, int height) {
        super(cymbol, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void areaOfaFigure() {
        System.out.println("Counting a triangle's area: " + base*height/2);
    }

    @Override
    public void paintFigure() {
        System.out.println("I paint a " + getColor() + " triangle");
    }

    @Override
    public void drawingFigures(){
        System.out.println("I draw a " + getColor() + " triangle");
    }

}
