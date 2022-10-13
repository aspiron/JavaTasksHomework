package HW090922.level1.model;

import HW090922.level1.Color;
import HW090922.level1.interfac.Artist;
import HW090922.level1.interfac.Painter;

import java.awt.*;

public class Rectangle extends Figure implements Artist, Painter {

    int width;
    int height;

    public Rectangle(char cymbol, Color color, int width, int height) {
        super(cymbol, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void areaOfaFigure() {
        System.out.println("Counting a rectangle's area: " + width*height);
    }

    @Override
    public void paintFigure() {
        System.out.println("I paint a " + getColor() + " rectangle");
    }

    @Override
    public void drawingFigures(){
        System.out.println("I draw a " + getColor() + " rectangle");
    }

}
