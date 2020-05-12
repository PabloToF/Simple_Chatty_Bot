import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int bridgesTotal = Integer.parseInt(scanner.nextLine().trim());
        int bridgeHeight = 0;
        boolean crash = false;

        for (int bridgeNumber = 1; bridgeNumber < bridgesTotal; bridgeNumber++) {

            bridgeHeight = scanner.nextInt();

            if (bridgeHeight <=  busHeight) {
                System.out.println("Will crash on bridge" + " " + bridgeNumber);
                crash = true;
                break;
            }
        }
        if (!crash) {
            System.out.println("Will not crash");
        }
    }
}
