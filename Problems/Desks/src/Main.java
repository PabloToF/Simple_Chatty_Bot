// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int classroom1=(num1/2)+(num1%2);
        int classroom2=(num2/2)+(num2%2);
        int classroom3=(num3/2)+(num3%2);

        int desks= (classroom1 + classroom2 + classroom3);

        System.out.println(desks);
    }
}