package AdvanceProblemofArray;

public class uniqueno {
    public static int FindUniqueElement(int[] num){
        int xorSum =0;
        for (int n: num){
            xorSum = xorSum ^ n;
        }
        return xorSum;
    }
    public static void main(String[] args) {
        int [] num ={2, 3, 5, 4, 5, 4, 3};
        System.out.println(FindUniqueElement(num));
    }
}
