import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = scanner.nextInt();
        int number;

        int maximumElement = 0;

        for (int i = 0; i < limit; i++) {
            number = scanner.nextInt();

           if (number % 4 == 0 && number > maximumElement) {
               maximumElement = number;
           }

           /**
            if (number % 4 == 0) {
                if ( number > maximumElement ) {
                    maximumElement = number;
                }
            }
            **/
        }
        System.out.println(maximumElement);
    }
}
