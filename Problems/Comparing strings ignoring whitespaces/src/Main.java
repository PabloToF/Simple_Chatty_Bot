// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text1= scanner.nextLine();
        String text2= scanner.nextLine();


        String first = text1.replace(" ", "");
        String second = text2.replace(" ", "");

        System.out.println(second.equals(first));

    }
}