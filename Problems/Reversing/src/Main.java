// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int digit1 = n / 100;
        int digit3 = n % 10;
        int digit2 = ( n - digit1 * 100 - digit3) / 10;
        int reverseN = digit3 * 100 + digit2 * 10 + digit1;

        System.out.println(reverseN);
    }
}

