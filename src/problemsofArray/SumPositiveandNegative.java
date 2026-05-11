package problemsofArray;

public class SumPositiveandNegative {
    public static int[] SumpositiveandNegative(int arr[]){
        int positiveSum = 0;
        int negativeSum = 0;

        for (int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                positiveSum = positiveSum + arr[i];
            }
            else {
                negativeSum = negativeSum + arr[i];
            }
        }
        int ans[] ={positiveSum,negativeSum};
        return ans;
    }
    public static void main(String[] args) {
        int []arr={2,-3,-5,-7,9};
        int ans[] = SumpositiveandNegative(arr);
        System.out.println("Positive Sum = " + ans[0]);
        System.out.println("Negavtive Sum = " + ans[1]);
    }
}
