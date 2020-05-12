import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int c = 0;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (c < n) {
                    System.out.print(" " + i + " ");
                    c++;
                }
            }
        }
    }
}