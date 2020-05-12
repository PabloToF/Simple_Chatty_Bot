// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number_1= scanner.nextInt();
        int number_2= scanner.nextInt();
        int number_3= scanner.nextInt();

        boolean result = (number_1>0 && number_2<=0 && number_3<=0) || (number_2>0 && number_1<=0 && number_3<=0)|| (number_3>0 && number_2<=0 && number_1<=0);

        System.out.println(result);
    }
}