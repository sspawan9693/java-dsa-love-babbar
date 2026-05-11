public class Max_element_inArrary {
    public static void main(String[] args) {
        int arr[] ={4,2,-5,21,15};
        int n= arr.length;
        int Max=arr[0];
        for (int i=0; i<=n-1; i++){
            if (arr[i]>Max){
               Max = arr[i];
            }
        }
        System.out.println("Maxvalue:"+Max);
    }
}
