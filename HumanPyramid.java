import edu.princeton.cs.algs4.StdDraw;

public class HumanPyramid {

    public static void main(String[] args) {
        System.out.println("Weight at (5, 0) = " +String.valueOf(weightOnBack(5, 0)) + " pounds");
    }

    public static double weightOnBack(int row, int col) {
        if(row == 0) {
            return 0;
        } else {
            if(row == col) {
                return weightOnBack(row-1, col-1)/2+100;
            } else if(col == 0) {
                return weightOnBack(row-1, col)/2+100;
            } else {
                return weightOnBack(row-1, col)/2 + weightOnBack(row-1, col-1)/2+200;
            }
        }
    }

}