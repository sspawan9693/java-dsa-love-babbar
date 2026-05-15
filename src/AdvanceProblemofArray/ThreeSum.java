package AdvanceProblemofArray;

import java.util.Arrays;

public class ThreeSum {
    public static int[] getThreeSum(int []num,int target){
        int n = num.length;
        for (int i=0; i<n-1; i++){
            for (int j=i+1; i<n;j++){
                for (int k=j+1; j<n; k++){
                    if (num[i]+num[j]+num[k] == target){
                        return new int[]{num[i],num[j],num[k]};
                    }
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int [] num ={1,4,3,2,8,9};
        int target =7;
        System.out.println(Arrays.toString(getThreeSum(num,target)));
    }
}
