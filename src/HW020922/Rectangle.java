package HW020922;

public class Rectangle extends Figure{
    int width;
    int height;

    public Rectangle(char symbol, Color color, int width, int height) {
        super(symbol, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void drawFigure(char symbol){
        System.out.println("Now I am drawing a rectangle");
        for (int i=1; i<=this.width; i++){
            for (int j=1; j<=this.height; j++){
                System.out.print(" " + symbol);
            }
            System.out.println();
        }
    }

    @Override
    public void paintFigure(Color color){
        System.out.println("Now I paint rectangle in " + color);
    }
}
