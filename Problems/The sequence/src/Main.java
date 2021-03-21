import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        // Check from first two inputs if ascending or descending

        int input = scanner.nextInt();
        int number = 1;
        int counterPerNumber = 1;

        for (int i = 1; i <= input; i++) {
            if (counterPerNumber > number) {
                number++;
                counterPerNumber = 1;
            }
            counterPerNumber++;
            System.out.print(number + " ");
        }
    }
}