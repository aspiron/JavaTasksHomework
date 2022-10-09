package HW020922;

public class Square extends Figure{
    int side;

    public Square(char symbol, Color color, int side) {
        super(symbol, color);
        this.side = side;
    }

    @Override
    public void drawFigure(char symbol){
        System.out.println("Now I am drawing a square");
        for (int i=1; i<=this.side; i++){
            for (int j=1; j<=this.side; j++){
                System.out.print("  " + symbol);
            }
            System.out.println();
        }
    }

    @Override
    public void paintFigure(Color color){
        System.out.println("Now I paint square in " + color);
    }
}
