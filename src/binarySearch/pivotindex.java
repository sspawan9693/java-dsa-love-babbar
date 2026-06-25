package binarySearch;

public class pivotindex {
    public static int PivotIndexRotatedArray(int[] nums){
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int ans =-1;

        while (s <= e){
            int mid = s + (e-s)/2;

            if (nums[mid] < nums[n-1]){
                // Iska mtlb hum L2 wali line pr h
                // answer toh L1 wali line pr h
                // iska mtlb move to L1, or left
                e = mid - 1;
            }
            else {
                // mid mera L1 pr hi h already
                // ans store
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums ={4,5,6,7,0,1,2};
        System.out.println(PivotIndexRotatedArray(nums));
    }
}
