package Bitwiseoperator;

public class bitwiseoperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(a & b);

        //Bitwise OR operator
        System.out.println(a | b);

        //Bitwise XOR operator
        System.out.println(a ^ b);

        // Bitwise not operators
        System.out.println(~a);

        //Bitwise Left shift operators

        int n = 1;
        for (int i = 1; i <= 32; i++) {
            n = n << 1;
            System.out.println(n);
            System.out.println();

            int c = 11;
            if ((c & 1) == 0) {
                System.out.println("Even");
            } else {
                System.out.println("odd");
            }

            int m = 16;
            if ((m & (m - 1)) == 0) {
                System.out.println("power of 2 hai");
            } else {
                System.out.println("power of 2 nahi h");
            }
        }
    }
}
