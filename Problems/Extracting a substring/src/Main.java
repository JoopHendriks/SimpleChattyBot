import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here.
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(str.substring(num1, num2 + 1));
    }
}