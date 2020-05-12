// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String lower = text.toLowerCase();

        System.out.println(lower.endsWith("burg"));

    }
}