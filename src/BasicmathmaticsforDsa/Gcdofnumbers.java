package BasicmathmaticsforDsa;

import java.util.Scanner;

public class Gcdofnumbers {
    public static int getGcd(int num1, int num2){
        //gcd(num1,num2) = gcd(b, a%b)
        while (num2 !=0){
            int olfvalueofnum2 = num2;
            num2 = num1%num2;
            num1 = olfvalueofnum2;
        }
        int ans = num1;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter the value of num1:"+ num1);
        int num2 = sc.nextInt();
        System.out.println("Enter the value of num2:"+ num2);
        System.out.println("GCD:"+ getGcd(18,12));
    }
}
