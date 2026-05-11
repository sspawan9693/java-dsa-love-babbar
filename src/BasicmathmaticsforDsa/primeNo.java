package BasicmathmaticsforDsa;

import java.util.Scanner;

public class primeNo {
    public static boolean isPrimeorNot(int num) {
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
               // System.out.println("is not prime");
                return false;

            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrimeorNot(num));

    }
}
