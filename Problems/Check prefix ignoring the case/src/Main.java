// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();
        String lower = text.toLowerCase();

        System.out.println(lower.startsWith("j"));

    }
}