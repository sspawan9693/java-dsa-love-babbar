public class ArraySum_Element {
    public static void main(String[] args) {
        int arr[]={5,6,8,9,10,12,};
        int n= arr.length;
        int sum=0;
        for (int i=0; i<=n-1; i++){
            int value =arr[i];
            sum=sum+value;
        }
        System.out.println(" sum :" + sum);
    }
}
