import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int total = 0;
        while (number != 0) {
            number = scanner.nextInt();
            total += number;
            if (total >= 1000) {
                total -= 1000;
                break;
            }
        }

        System.out.println(total);
    }
}
