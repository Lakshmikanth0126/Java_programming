import java.util.Arrays;

public class MaximumMinimumNumbers {
    public static void main(String[] args) {
        int[] arr = {14, 16, 87, 36, 25, 89, 34};
        int m = 1;
        int n = 3;

        int mthMax = findMthMaximum(arr, m);
        int nthMin = findNthMinimum(arr, n);

        int sum = mthMax + nthMin;
        int difference = Math.abs(mthMax - nthMin);

        System.out.println("Mth maximum number: " + mthMax);
        System.out.println("Nth minimum number: " + nthMin);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }

    
    public static int findMthMaximum(int[] arr, int m) {
        Arrays.sort(arr);
        int length = arr.length;
        if (m <= length) {
            return arr[length - m];
        }
        return -1; // Mth maximum does not exist
    }

    
    public static int findNthMinimum(int[] arr, int n) {
        Arrays.sort(arr);
        int length = arr.length;
        if (n <= length) {
            return arr[n - 1];
        }
        return -1; // Nth minimum does not exist
    }
}
