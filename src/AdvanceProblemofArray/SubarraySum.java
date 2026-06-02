package AdvanceProblemofArray;

public class SubarraySum {
    public static int maxSubarray(int[] nums){
        int sum =0;
        int maxi = Integer.MIN_VALUE;

        for (int i=0; i< nums.length; i++){
            sum = sum + nums[i];
            maxi = Math.max(maxi, sum);
            if (sum < 0)
                sum = 0;
        }
        return maxi;
    }
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarray(nums));
    }
}
