// Posted from EduTools plugin
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int number = scanner.nextInt();

       if (number<=0){
           System.out.println("NO");
       }else {
           System.out.println("YES");
        }
    }
}