import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value;
        int sum = 0;

        do {
            value = scanner.nextInt();
            sum += value;

            if (sum >= 1000) {
             break;
            }
        } while (value != 0);

        /* if (sum >= 1000) {
            System.out.println(sum - 1000);
        } else {
            System.out.println(sum);
        } */

        System.out.println(sum>=1000?sum-1000:sum);
    }
}
