package BasicmathmaticsforDsa;

public class count_digit {
    public static int countDigit(int num){
        int count = 0;
        while (num !=0){
            int digit = num % 10;
            count++;
            num = num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        int num =53127;
        int ans = countDigit(num);
        System.out.println(ans);
    }
}
