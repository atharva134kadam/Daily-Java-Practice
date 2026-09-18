class Father{
    protected void Father(){
        System.out.println("I am Father");
    }
}

class Son extends Father{
    protected void Son(){
        System.out.println("I am Son");
    }
}

class Daughter extends Father{
    protected void Daughter(){
        System.out.println("I am Daughter");
    }
}

public class hierarchicalInheritance{
    public static void main(String[] args){
        Son c = new Son();
        Daughter d = new Daughter();
        c.Father();
        c.Son();
        d.Daughter();
        
    }
}