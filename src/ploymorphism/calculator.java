package ploymorphism;

public class calculator {
    int add(int a,int b){
        return a+b;
    }

    // overloading add, 3 int addtion

    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println(c.add(2,9));
        System.out.println(c.add(78,6,20));
    }
}
