package HW090922.level1.model;

import HW090922.level1.Color;
import HW090922.level1.interfac.Artist;
import HW090922.level1.interfac.Painter;

public class Figure implements Artist, Painter {

    private char cymbol;
    private Color color;

    public Figure(char cymbol, Color color) {
        this.cymbol = cymbol;
        this.color = color;
    }

    public char getCymbol() {
        return cymbol;
    }

    public void setCymbol(char cymbol) {
        this.cymbol = cymbol;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void areaOfaFigure() {
        System.out.println("Drawing figure's area");
    }

    @Override
    public void drawingFigures() {
        System.out.println("I draw figure");
    }

    @Override
    public void paintFigure() {
        System.out.println("I paint figure");
    }
}
