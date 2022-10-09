package HW020922;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle('*', Color.RED, 4, 6);
        Triangle triangle = new Triangle('^', Color.WHITE, 7, 6);
        Square square = new Square('#', Color.BLACK, 5);

        rectangle.drawFigure(rectangle.getSymbol());
        square.drawFigure(square.getSymbol());
        triangle.drawFigure(triangle.getSymbol());

        System.out.println("______________________________________________________________________");
        System.out.println();

        rectangle.paintFigure(rectangle.getColor());
        square.paintFigure(square.getColor());
        triangle.paintFigure(triangle.getColor());
    }
}
