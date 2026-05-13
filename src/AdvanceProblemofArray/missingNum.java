package AdvanceProblemofArray;

public class missingNum {
    public static int getMissingNumber(int[] nums){
        int xorSum=0;
        for (int n: nums){
            xorSum = xorSum ^ n;
        }
        int n = nums.length;
        for (int i=0; i<=n; i++){
            xorSum = xorSum ^ i;
        }
        return xorSum;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,0,3,4};
        System.out.println(getMissingNumber(nums));
    }
}
