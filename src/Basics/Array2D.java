public class Array2D {
    public static void main(String[] args) {
        int[][] arr;
        arr =new int[3][4];
        int[][] brr= {
                {1,2},
                {2,3},
                {3,4},
                {4,5}
        };
        //System.out.println(brr[0][0]);
        int iLength = brr.length;
        int jLength = brr[0].length;
        for (int i=0; i<=iLength-1; i++){
            for (int j=0; j<=jLength-1; j++){
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
