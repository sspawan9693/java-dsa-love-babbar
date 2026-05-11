package problemsofArray;

public class counttheNumber {
    public static int[] getZeroesandOnes(int[] arr){
        int zeroCount =0;
        int oneCount = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i] == 0){
                zeroCount++;
            }
            else {
                oneCount++;
            }
        }
        int ans[] ={zeroCount,oneCount};
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,1};
        int ans[] = getZeroesandOnes(arr);
        System.out.println("zeroCount = " + ans[0]);
        System.out.println("oneCount = " + ans[1]);
    }
}
