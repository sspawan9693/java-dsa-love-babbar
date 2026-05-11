import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the string content:");
        String str = sc.nextLine();
        System.out.println("value of nextLine: " + str);

        String str2 = sc.next();
        System.out.println("value of next: " +str2);
    }
}
