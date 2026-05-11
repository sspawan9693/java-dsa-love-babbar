package BasicmathmaticsforDsa;

public class Palindrome {
    public static int RevserseNum(int num){

        int revNum=0;
        while(num !=0){
            int digit = num % 10;
            revNum = revNum*10+digit;
            num = num/10;
        }
        return revNum;
    }
    public static boolean ispalidrme(int num){
        int originalNum =num;
        int reversedNum =RevserseNum(num);
        if (originalNum == reversedNum){
            System.out.println("It is a palindrome");
            return true;
        }else {
            System.out.println("It is not a palindrome");
            return false;
        }
    }
    public static void main(String[] args) {
        int num =1221;
        boolean ans = ispalidrme(num);
        System.out.println(ans);
    }
}
