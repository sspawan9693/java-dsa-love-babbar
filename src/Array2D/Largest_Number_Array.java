package Array2D;

public class Largest_Number_Array {
    public static void main(String[] args) {
        int numbers []= {1,2,6,3,5};
        //int n = numbers.length;
        int Max = numbers[0];
        for (int i=0; i< numbers.length; i++){
            if (numbers[i]>Max){
                Max=numbers[i];
            }
        }
        System.out.println("Largest value in Array:" +Max);
    }
}
