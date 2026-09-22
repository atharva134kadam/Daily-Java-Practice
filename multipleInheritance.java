interface A{
    void fun();
}

interface B extends A{
    public void fun();
}

interface C extends A{
    public void fun();
}

class D implements A,B{
    @Override 
    public void fun(){
        System.out.println("This is fun");
    }
}

public class multipleInheritance{
    public static void main(String[] args){
        D d = new D();
        d.fun();
    }
}