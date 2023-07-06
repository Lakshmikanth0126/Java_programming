import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int[] denominations = {2000, 500, 200, 100};

     
        int[] priority = new int[denominations.length];
        int[] notes = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            System.out.print("Enter the " + (i + 1) + " Denomination: ");
            priority[i] = scanner.nextInt();
            System.out.print("Enter the " + (i + 1) + " Denomination number of notes: ");
            notes[i] = scanner.nextInt();
        }

     
        int totalAmount = 0;
        for (int i = 0; i < denominations.length; i++) {
            int denomination = priority[i];
            int index = findIndex(denomination, denominations);
            totalAmount += denomination * notes[index];
        }

        
        System.out.println("Total Available Balance in ATM: " + totalAmount);
    }

    
    public static int findIndex(int denomination, int[] denominations) {
        for (int i = 0; i < denominations.length; i++) {
            if (denominations[i] == denomination) {
                return i;
            }
        }
        return -1; 
    }
}
