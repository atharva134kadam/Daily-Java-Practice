class Grandfather{
    protected void grandFather(){
        System.out.println("I am Grandfather");
    }
}

class Parent extends Grandfather{
    protected void parent(){
        System.out.println("I am Parent");
    }
}

class Child extends Parent{
    protected void child(){
        System.out.println("I am Child");
    }
}

public class multilevelInheritance{
    public static void main(String[] args){
        Child c = new Child();
        c.child();
        c.parent();
        c.grandFather();
        
    }
}