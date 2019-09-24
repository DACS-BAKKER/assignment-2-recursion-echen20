import edu.princeton.cs.algs4.StdDraw;

public class SierpinskiHexagon {

    public static void main(String[] args) {
        makeHexagon(0.3, 0.1, 0.4, 4);
    }

    public static void makeHexagon(double x, double y, double sideLength, int order) {
        if(order == 0) {
            StdDraw.line(x, y, x+sideLength, y);
            StdDraw.line(x+sideLength, y, x+sideLength+sideLength/2, y+sideLength*(Math.sqrt(3)/2));
            StdDraw.line(x+sideLength+sideLength/2, y+sideLength*(Math.sqrt(3)/2), x+sideLength, y+sideLength*Math.sqrt(3));
            StdDraw.line(x+sideLength, y+sideLength*Math.sqrt(3), x, y+sideLength*Math.sqrt(3));
            StdDraw.line(x, y+sideLength*Math.sqrt(3), x-sideLength/2, y+sideLength*(Math.sqrt(3)/2));
            StdDraw.line(x-sideLength/2, y+sideLength*(Math.sqrt(3)/2), x, y);
        } else {
            makeHexagon(x, y, sideLength/3, order-1);
            makeHexagon(x, y+sideLength*(Math.sqrt(3)/2+Math.sqrt(3)/6), sideLength/3, order-1);

            makeHexagon(x-sideLength*1.0/3.0, y+sideLength*(Math.sqrt(3)/3), sideLength/3, order-1);

            makeHexagon(x+2*sideLength/3, y+sideLength*(Math.sqrt(3)/2+Math.sqrt(3)/6), sideLength/3, order-1);
            makeHexagon(x+2*sideLength/3, y, sideLength/3, order-1);

            makeHexagon(x+sideLength, y+sideLength*(Math.sqrt(3)/3), sideLength/3, order-1);
        }
    }

}
