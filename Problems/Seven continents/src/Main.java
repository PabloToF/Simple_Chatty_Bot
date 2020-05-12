// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String africa = scanner.next();
        String antarctica = scanner.next();
        String asia = scanner.next();
        String australia = scanner.next();
        String europe = scanner.nextLine();
        String nAmerica = scanner.nextLine();
        String sAmerica = scanner.nextLine();

        System.out.println(asia);
        System.out.println(africa);
        System.out.println(nAmerica);
        System.out.println(sAmerica);
        System.out.println(antarctica);
        System.out.println(europe.trim());
        System.out.println(australia);

    }
}