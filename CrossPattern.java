import java.util.Scanner;

public class CrossPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = scanner.nextInt();
        scanner.close();

        // Print the upper part of the cross
        for (int i = 0; i < n; ++i) {
            System.out.println(" ".repeat(n) + "*".repeat(n) + " ".repeat(n));
        }

        // Print the middle horizontal line repeated by the entered value
        for (int i = 0; i < n; ++i) {
        System.out.println("*".repeat(3*n));
        }
        // Print the lower part of the cross
        for (int i = 0; i < n; ++i) {
            System.out.println(" ".repeat(n) + "*".repeat(n) + " ".repeat(n));
        }
    }
}
