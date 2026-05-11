package problemsofArray;

public class MultiplyEachelementBy10 {
    public static int[] multiplyBy10(int[] arr){
        int n = arr.length;
        int newArray[] = new int[n];

        for (int i=0; i<n; i++){
            int element = arr[i];
            int newElement = element*10;
            newArray[i] = newElement;
        }
        return newArray;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,3,3};
        int ans[] = multiplyBy10(arr);
        System.out.println("Printing ans array: ");
        for (int i: ans){
            System.out.println(i);
        }
    }
}
