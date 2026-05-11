public class Operators {
    public static void main(String[] args) {
//        boolean completeDSA = true;
//        boolean completeCore = false;
//        System.out.println(completeDSA && completeCore);
//        System.out.println(completeDSA || completeCore);
//        System.out.println(!completeCore);

        // Assignment Operator

//        int ratingPoint = 100;
//
//        ratingPoint += 20; // 100+20 =120
//        System.out.println(ratingPoint);
//        ratingPoint -= 10; // 120-10 =110
//        System.out.println(ratingPoint);
//        ratingPoint *= 2; //110*2 =220
//        System.out.println(ratingPoint);
//        ratingPoint /= 4; // 220/4 =55
//        System.out.println(ratingPoint);
//        ratingPoint %= 30; // 55%30 =25
//        System.out.println(ratingPoint);

        // Unairy operator

        int activeUsers = 100;
        int prefix = ++activeUsers;
        int postfix = activeUsers++;

        System.out.println(prefix);
        System.out.println(postfix);
        System.out.println(activeUsers);
}
}
