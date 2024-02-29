import java.util.Scanner;
public class Fabonacci_series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        printFibonacciSeries(n);
    }
    static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}