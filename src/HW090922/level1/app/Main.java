package HW090922.level1.app;

import HW090922.level1.Color;
import HW090922.level1.model.Rectangle;
import HW090922.level1.model.Square;
import HW090922.level1.model.Triangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle('*', Color.RED, 4, 6);
        Triangle triangle = new Triangle('^', Color.WHITE, 7, 6);
        Square square = new Square('#', Color.BLACK, 5);

        rectangle.areaOfaFigure();
        triangle.areaOfaFigure();
        square.areaOfaFigure();

        rectangle.drawingFigures();
        rectangle.paintFigure();
        triangle.drawingFigures();
        triangle.paintFigure();
        square.drawingFigures();    // without override
        square.paintFigure();       // without override



    }
}
