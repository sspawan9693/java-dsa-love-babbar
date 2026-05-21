package AdvanceProblemofArray;

public class pivotIndex {

    public static int getpivotIndex(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;

        // Step 1: Pure array ka total sum nikaal lo
        for (int num : arr) {
            totalSum += num;
        }

        // Step 2: Har ek index par check karo
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];


            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};

        int result = getpivotIndex(arr);
        System.out.println( result);
    }
}

