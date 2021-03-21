import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here.
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        str = str.toUpperCase();
        System.out.println(str.startsWith("J"));
    }
}