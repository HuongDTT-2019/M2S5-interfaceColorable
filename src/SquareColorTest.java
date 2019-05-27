public class SquareColorTest {
    public static void main(String[] args) {
        SquareColor[] squareColors = new SquareColor[3];
        squareColors[0] = new SquareColor(5);
        squareColors[1] = new SquareColor(6,"red",false);
        squareColors[2] = new SquareColor(7,"yelow",true);

        for (SquareColor squareColor:squareColors){
            System.out.println("Area:"+squareColor.getArea()+"__ Color:"+squareColor.getColor());
            if (squareColor.isFilled()){
                squareColor.howToColor();
            }
        }
    }
}
