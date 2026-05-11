package String;

public class SplitMethod_String {
    public static void main(String[] args) {
        String input = "My,name,is,pawan,kumar";
        String[] words = input.split( ",");
        for (String str: words){
            System.out.println(str);
        }
    }
}
