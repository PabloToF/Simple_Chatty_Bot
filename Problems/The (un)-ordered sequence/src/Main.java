import java.util.Scanner;

class CustomSerialization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean result = true;
        int oldNum = scanner.nextInt();
        int newNum = scanner.nextInt();
        String order = "none";

        while (newNum != 0) {
            if (order.equals("none") && oldNum != newNum) {
                order = oldNum < newNum ? "asc" : "desc";

            } else if (order.equals("asc") && oldNum > newNum) {
                result = false;
                break;

            } else if (order.equals("desc") && oldNum < newNum) {
                result = false;
                break;
            }

            oldNum = newNum;
            newNum = scanner.nextInt();
        }

        System.out.println(result ? "true" : "false");
    }
}
