public class Main {
    public static void main(String[] args) {


        int satir = 7;
        int sutun = 5;

        char[][] harfB = {
                {'*', '*', '*', ' ', ' '},
                {'*', ' ', ' ', '*', ' '},
                {'*', ' ', ' ', '*', ' '},
                {'*', '*', '*', ' ', ' '},
                {'*', ' ', ' ', '*', ' '},
                {'*', ' ', ' ', '*', ' '},
                {'*', '*', '*', ' ', ' '}
        };

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                if (harfB[i][j] == '*') {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}