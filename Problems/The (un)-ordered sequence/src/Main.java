import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        // Check from first two inputs if ascending or descending
        int inputNew;
        int inputOld = scanner.nextInt();
        int setSign = 0;
        int sign;

        while (true) {
            inputNew = scanner.nextInt();
            if (inputNew == 0) {
                System.out.println("true");
                break;
            }

            if (inputNew == inputOld) {
                sign = 0;
            } else {
                sign = (inputNew - inputOld) / Math.abs(inputNew - inputOld);
            }

            if (setSign == 0 && sign != 0) {
                setSign = sign;
            }

            if (sign != setSign && sign != 0) {
                System.out.println("false");
                break;
            }

            inputOld = inputNew;
        }
    }
}