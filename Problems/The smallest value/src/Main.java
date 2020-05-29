import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();
        long factorial = 1;
        int n = 0;

        if (m == 1) {
            n = 0;
        } else {
            do {
                factorial = 1;
                n++;
                for (int i = 1; i <= n; i++) {
                    factorial *= i;
                }
            } while (factorial <= m);

            System.out.println(n);
        }
    }
}