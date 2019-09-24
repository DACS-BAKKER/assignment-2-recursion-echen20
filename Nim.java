public class Nim {

    public static void main(String[] args) {
        nim(30, 1);
        System.out.println(numVictories);
        System.out.println(winner);
    }

    public static int numVictories;
    public static int winner;

    public static void nim(int n, int player) {
        if (n > -1) {
            if (n == 0) {
                numVictories++;
                winner = -player;
            } else {
                if ((n - 1) % 3 == 0) {
                    nim(n - 1, -player);
                } else if ((n - 2) % 3 == 0) {
                    nim(n - 2, -player);
                } else if((n-4) % 3 == 0) {
                    nim(n-4, -player);
                } else {
                    nim(n - 1, -player);
                    nim(n - 2, -player);
                    nim(n - 4, -player);
                }
            }
        }
    }

    }