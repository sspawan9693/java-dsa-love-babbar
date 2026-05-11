package String;

public class Length_String {
    public static int getLengthofString(String str){
        char[] arr =str.toCharArray();
        int len = arr.length;
        return len;
    }

    public static void main(String[] args) {
        String str = "pawan";
        System.out.println(getLengthofString(str));
    }
}
