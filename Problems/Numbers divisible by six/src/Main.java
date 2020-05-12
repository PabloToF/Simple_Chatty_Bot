import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elements = scanner.nextInt();
        int number = 0;
        int total = 0;

        for (int i = 0; i < elements; i++){
            number = scanner.nextInt();

            if (number % 6 == 0) {
                total += number;
                //total = total + number;
            }
        }

        System.out.println(total);
    }
}