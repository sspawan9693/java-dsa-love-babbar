package OOPs;

public class app {
    public static void main(String[] args) throws Exception {
//        Student A =new Student();
//        A.id =1;
//        A.age = 18;
//        A.name = "Pawan";
//        A.nos = 5;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);

        Student A = new Student(1, 18, "Pawan", 3);
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);
        
        A.bunk();
        A.study();
        A.sleep();
    }
}
