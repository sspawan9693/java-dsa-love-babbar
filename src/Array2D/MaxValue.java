package Array2D;

public class MaxValue {
    public static void main(String[] args) {
        int [][] arr = { {1,2,3},{21,20,19}};
        int maxvalue = arr[0][0];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if (arr[i][j]>maxvalue){
                    maxvalue=arr[i][j];
                }
            }
        }
        System.out.println(maxvalue);
    }
}
