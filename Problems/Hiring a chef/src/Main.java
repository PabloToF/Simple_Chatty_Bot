// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Name = scanner.next();
        String Age = scanner.next();
        String Education = scanner.next();
        String ExperienceYears = scanner.next();
        String CuisineType = scanner.next();

        System.out.println ("The form for " + Name + " is completed. We will contact you if we need a chef that cooks " + CuisineType + " dishes.");

    }
}