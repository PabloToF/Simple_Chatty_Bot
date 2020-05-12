// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sleep_time= scanner.nextInt();

        if (sleep_time < a ){
            System.out.println("Deficiency");
        } else if (sleep_time > b) {
            System.out.println("Excess");
        } else if (a <= sleep_time || sleep_time < b){
            System.out.println("Normal");
        } else {
            System.out.println("Something went wrong. Please try again introducing valid numbers");
        }
    }
}