import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float money = scanner.nextInt();
        float yearPercent = scanner.nextInt();
        float objective = scanner.nextInt();


        int time = 0;

        while (money < objective) {
            money += money * (yearPercent / 100);
            time++;
        }
        System.out.println(time);
    }
}
