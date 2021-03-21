import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        // Check from first two inputs if ascending or descending
        int busHeight = scanner.nextInt();
        int bridges = scanner.nextInt();
        int bridgeHeight;

        for (int i = 1; i <= bridges; i++) {
            bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight) {
                System.out.println("Will crash on bridge " + i);
                break;
            } else if (i == bridges) {
                System.out.println("Will not crash");
            }

        }


    }
}