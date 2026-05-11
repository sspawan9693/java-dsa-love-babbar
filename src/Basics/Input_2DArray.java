import java.util.Scanner;

public class Input_2DArray {
    public static void main(String[] args) {
        int arr[][]=new int[3][4];
        Scanner sc= new Scanner(System.in);
        for (int i=0; i<=arr.length-1;i++){
            for (int j=0; j<=arr[i].length-1; j++){
                arr[i][j]= sc.nextInt();
            }
        }
    }
}
