package Array2D;

public class Zaged2D_Array {
    public static void main(String[] args) {
        int [][] arr;
        arr = new int[3][4];
        int [][] brr={
                {1,2},
                {2,3,4,5},
                {3,4,4,5,6,7},
                {4}
        };

        int rowLength = brr.length;

        for (int rowIndex=0; rowIndex<=rowLength-1; rowIndex++){
            int colLength =brr[rowIndex].length;
            for (int colIndex=0; colIndex<=colLength-1;colIndex++){
                System.out.print(brr[rowIndex][colIndex] +" ");

            }
            System.out.println();
        }
    }
}
