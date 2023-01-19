package InterfaceTut.ambiguity;

public class main implements A,B {
    
    public void display() {
        System.out.println("Hello");
        System.out.println("Value of x in A: "+A.x);
        System.out.println("Value of x in B: "+B.x);
    }
    public static void main(String args[]) {
        main obj = new main();
        obj.display();

    }
    
}
