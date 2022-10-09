package HW020922;

public class Triangle extends Figure{
    int base;
    int height;

    public Triangle(char symbol, Color color, int base, int height) {
        super(symbol, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void paintFigure(Color color){
        System.out.println("Now I paint triangle in " + color);
    }
}
