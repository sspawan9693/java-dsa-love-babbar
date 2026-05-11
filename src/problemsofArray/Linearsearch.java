package problemsofArray;

public class Linearsearch {
    public static boolean search(int[]arr){
        int n = arr.length;;
        int key = 9;

        for (int i=0; i<n; i++){
            if (arr[i] == key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr ={2,8,4,9,1,5,7};
        System.out.println(search(arr));
    }
}
