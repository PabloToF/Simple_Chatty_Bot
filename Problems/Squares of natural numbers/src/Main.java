import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = scanner.nextInt();
        int count = 1;
        int result = 1;

        while(result <= limit) {
            System.out.println(result);
            count++;
            result = count * count;
        }
    }
}