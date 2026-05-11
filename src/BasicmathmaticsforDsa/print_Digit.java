package BasicmathmaticsforDsa;

import java.util.Scanner;

public class print_Digit {
    public static void PrintDigits(int num){
        while (num !=0){
            int digit = num % 10;
            System.out.println(digit);
            num = num/10;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrintDigits(num);
    }
}
