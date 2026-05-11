public class Array_Multiply_element {
    public static void main(String[] args) {
        int arr[] ={5,6,9,2,8};
        int multiply =1;
        int n= arr.length;
        for (int i=0; i<=n-1; i++){
            int value =arr[i];
            multiply=multiply*value;
        }
        System.out.println("Multiply:" +multiply );
    }
}
