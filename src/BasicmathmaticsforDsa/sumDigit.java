package BasicmathmaticsforDsa;

public class sumDigit {
    public static int Sumofdigit(int num){
        int sum =0;
        while (num !=0){
            int digit = num % 10;
            sum = sum + digit;
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num =53127;
        int sum = Sumofdigit(num);
        System.out.println(sum);
    }
}
