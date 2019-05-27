import colorable.Colorable;

public class SquareColor extends Square implements Colorable {
    public SquareColor() {
    }

    public SquareColor(double size) {
        super(size);
    }

    public SquareColor(double size, String color, boolean filled) {
        super(size, color, filled);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
