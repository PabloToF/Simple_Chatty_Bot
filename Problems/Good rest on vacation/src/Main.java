// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int dailyFood = scanner.nextInt();
        int flight = scanner.nextInt();
        int hotel= scanner.nextInt();

        int total = flight*2 + dailyFood*days + hotel*(days-1);

        System.out.println(total);
    }
}