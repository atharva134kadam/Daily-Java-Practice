class A {
    int x = 5;
    public int getx() {
        System.out.println("A's x: " + x);
        return x;
    }
}

class B extends A {
    int x = 10;
    
    public void display() {
        super.getx();
    }
}

public class superKeyword {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}