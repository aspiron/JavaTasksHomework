package HW090922.level1.model;

import HW090922.level1.Color;
import HW090922.level1.interfac.Artist;
import HW090922.level1.interfac.Painter;

public class Square extends Figure implements Artist, Painter {
    int side;

    public Square(char cymbol, Color color, int side) {
        super(cymbol, color);
        this.side = side;
    }

    @Override
    public void areaOfaFigure() {
        System.out.println("Counting a square's area: " + side*side);
    }


}
