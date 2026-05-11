package AdvanceProblemofArray;

public class ReverseanArray {
   public static void getReverseofAnArray(int[]arr){
       int n = arr.length;
       int i =0;
       int j = n-1;

       while(i<=j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;

           i++;
           j--;


           }
       for (int k: arr){
           System.out.println(k);
       }
   }

    public static void main(String[] args) {
        int[] arr ={2,4,6,8,9};
        getReverseofAnArray(arr);

    }
}
