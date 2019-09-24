public class SumDigits {

    public static void main(String[] args) {
        System.out.println(sumDig(14756));
    }

    public static int sumDig(int x) {
        if(x<10) {
            return x;
        } else {
            return x%10 + sumDig(x/10);
        }
    }

}