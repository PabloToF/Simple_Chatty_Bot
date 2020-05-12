import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = 0;
        int total = 0;

        do {
            value = scanner.nextInt();
            total = total + value; // total += value
        } while ((value != 0));

        System.out.println(total);
    }
}