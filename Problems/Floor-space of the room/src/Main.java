import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine().trim();

        switch (operation) {
            case "triangle":
                double aT = scanner.nextDouble();
                double bT = scanner.nextDouble();
                double cT = scanner.nextDouble();

                double p = (aT + bT + cT) / 2;

                System.out.println(Math.sqrt((p * (p - aT ) * (p - bT) * (p - cT))));
                break;
            case "rectangle":
                double aR = scanner.nextDouble();
                double bR = scanner.nextDouble();

                System.out.println(aR * bR);
                break;
            case "circle":
                double radius = scanner.nextDouble();

                System.out.println(3.14 * radius * radius);
                break;
            default:
                System.out.println("Invalid parameter");
        }
    }
}
