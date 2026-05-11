package problemsofArray;

public class AverageofArrayelements {
    public static double getaverage(int[] arr){
        double sum = 0;
        for (int i: arr){
            sum +=i;
        }
        int size = arr.length;
        double avg = sum / size;
        return  avg;
    }
    public static void main(String[] args) {
        int[] arr ={2,4,3,3};
        System.out.println(getaverage(arr));
    }
}
