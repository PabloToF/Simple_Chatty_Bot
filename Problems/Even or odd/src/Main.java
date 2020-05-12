import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int value = 0;

        do {
            value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            if (value % 2 == 0) {
                System.out.println("even");
            } 
            if (value % 2 == 1) {
                System.out.println("odd");
            }
        } while (value != 0);
    }
}
