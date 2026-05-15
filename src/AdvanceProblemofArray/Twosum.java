package AdvanceProblemofArray;

import java.util.Arrays;

public class Twosum {
    public static int[] gettwoSum(int[] num , int target){
        int n = num.length;

        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (num[i] + num[j] == target){
                    return new int[]{num[i],num[j]};
                }
            }
        }
       return new int[]{};
    }
    public static void main(String[] args) {
        int [] num = {2,1,3,5,4,6};
        int target =10;
        System.out.println(Arrays.toString(gettwoSum(num,target)));
    }
}
