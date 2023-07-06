import java.util.Scanner;

public class PrimeCompositeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int primeCount = 0;
        int compositeCount = 0;

        for (int num : numbers) {
            if (isPrime(num)) {
                primeCount++;
            } else {
                compositeCount++;
            }
        }

        System.out.println("Prime numbers count: " + primeCount);
        System.out.println("Composite numbers count: " + compositeCount);
    }

    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
