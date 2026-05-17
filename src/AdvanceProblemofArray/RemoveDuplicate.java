package AdvanceProblemofArray;

import java.lang.reflect.Array;

public class RemoveDuplicate {
    public static int[] getDuplicateElement(int[]nums){
        int i=0;
        int j=1;
        int n = nums.length;
        while (j<n){
            if (nums[i] == nums[j]){
                j++;
            }
            else {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int [] nums ={1,2,2,2,3,4,4,5};
        System.out.println(Array.set(getDuplicateElement(int[]nums)));
    }
}
