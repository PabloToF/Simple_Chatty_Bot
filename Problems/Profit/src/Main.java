import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int money = scanner.nextInt();
        int year_percent = scanner.nextInt();
        int objective = scanner.nextInt();

        int time = 1;

        while (money < objective) {
            money += year_percent;
            time++;
        }
        System.out.println(time);
    }
}
