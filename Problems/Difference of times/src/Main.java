// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour1 = scanner.nextInt();
        int minute1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();

        int hour2 = scanner.nextInt();
        int minute2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        int hours1seconds = hour1 * 60 * 60;
        int minutes1seconds= minute1 * 60;
        int firstMoment = hours1seconds + minutes1seconds + seconds1;

        int hours2seconds = hour2 * 60 * 60;
        int minutes2seconds= minute2 * 60;
        int secondMoment = hours2seconds + minutes2seconds + seconds2;

        int timeDifference = secondMoment - firstMoment;

        System.out.println(timeDifference);

    }
}