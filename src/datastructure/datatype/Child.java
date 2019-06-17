package src.datastructure.datatype;

public class Child extends Polymorphism{

    int a=20;

    public void display(){
        System.out.println("Parent");
    }

    public static void main(String[] args) {
        Polymorphism p1 = new Polymorphism();
        Polymorphism c1 = new Child();
        System.out.println(c1.a);
        c1.display();
    }
}
