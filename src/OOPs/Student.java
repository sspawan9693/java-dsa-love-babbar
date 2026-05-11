package OOPs;

public class Student {
    public int id;
    public int age;
    public String name;
    public int nos;

    //Default ctor // attr. -> garbage
    public Student(){
        System.out.println("Student Default ctor called");
    }

    //Parametrized constructor
    public Student(int id, int age, String name, int nos){
        System.out.println("Student parametrised constructor called");
        this.id = id;
        this.age  = age;
        this.name = name;
        this.nos =nos;
    }

    //Methods/Beahviour
    public void study(){
        System.out.println(name + " Studing");
    }

    public void sleep(){
        System.out.println(name + " Sleeping");
    }
    public void bunk(){
        System.out.println(name + " bunking");
    }
}
