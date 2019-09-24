import edu.princeton.cs.algs4.StdDraw;

public class SierpinskiTriangle {

    public static void main(String[] args) {
        makeTriangle(0, 0.1, 1, 7);
    }

    public static void makeTriangle(double x, double y, double sideLength, int order) {
        if(order == 0) {
            StdDraw.line(x, y, x+sideLength, y);
            StdDraw.line(x, y, x+sideLength/2, y+sideLength*(Math.sqrt(3)/2));
            StdDraw.line(x+sideLength/2, y+sideLength*(Math.sqrt(3)/2), x+sideLength,y);
        } else {
            makeTriangle(x, y, sideLength/2, order-1);
            makeTriangle(x+sideLength/2, y, sideLength/2, order-1);
            makeTriangle(x+sideLength/4, y+sideLength*(Math.sqrt(3)/4), sideLength/2, order-1);
        }
    }

 }