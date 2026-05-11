package BasicmathmaticsforDsa;

public class reverseNo {
    public static int RevserseNum(int num){

        int revNum=0;
        while(num !=0){
            int digit = num % 10;
            revNum = revNum*10+digit;
            num = num/10;
        }
        return revNum;
    }
    public static void main(String[] args) {
        int num = 1234;
        int revNum = RevserseNum(num);
        System.out.println(revNum);
    }
}
