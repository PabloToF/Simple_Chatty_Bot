import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int partsNumber = scanner.nextInt();
        int parts;
        int smaller = 0;
        int perfect = 0;
        int larger = 0;

        for (int i = 0; i < partsNumber; i++) {
            parts = scanner.nextInt();

            switch (parts) {
                case -1:
                    smaller++;
                    break;
                case 0:
                    perfect++;
                    break;
                case 1:
                    larger++;
                    break;
                default:
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}
