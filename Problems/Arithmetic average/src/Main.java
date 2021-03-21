import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double sum = 0;
        double counter = 0;

        for (double i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                counter++;
            }
        }
        double average = sum / counter;
        System.out.print(average);

    }
}