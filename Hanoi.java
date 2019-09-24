public class Hanoi {

    public static void main(String[] args) {
        solveHanoi(3, 1, 2, 3);
        System.out.println("Esketit my brody");
    }

    public static void solveHanoi(int n, int start, int middle, int finish) {
        if(n==1) {
            System.out.println(start + "=>" + finish);
        } else {
            solveHanoi(n-1, start, finish, middle);
            System.out.println(start + "=>" + finish);
            solveHanoi(n-1, middle, start, finish);
        }
    }
}