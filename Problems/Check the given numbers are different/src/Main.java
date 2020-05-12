// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number_1= scanner.nextInt();
        int number_2= scanner.nextInt();
        int number_3= scanner.nextInt();

        boolean result = number_1!=number_2 && number_2!=number_3 && number_1 != number_3;

        System.out.println(result);
    }
}