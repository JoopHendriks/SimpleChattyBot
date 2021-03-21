import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int army = scanner.nextInt();
        String category;
        
        if (army < 1) {
            category = "no army";
        } else if (army < 20) {
            category = "pack";
        } else if (army < 250) {
            category = "throng";
        } else if (army < 1000) {
            category = "zounds";
        } else {
            category = "legion";
        }
        System.out.println(category);
    }
}
