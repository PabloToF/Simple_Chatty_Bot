import java.util.*;

class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       int a = scanner.nextInt();
       int b = scanner.nextInt();

       long sum = 1;

       for (int i = a; i < b; i++) {
           sum *= i; //sum = i * sum
       }

       System.out.println(sum);
    }
}
