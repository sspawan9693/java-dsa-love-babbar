package AdvanceProblemofArray;

public class right1Position {
    public static void Shift1St(int[]arr){
        int n =arr.length;
        int temp = arr[n-1];
        for (int i=n-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0] = temp;
    }
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50,60,70};
        Shift1St(arr);

        for (int a: arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
