interface Animal{
    void sleep();
    default void eat(){
        System.out.println("Animal eats");
        drinks();
    }

    private void drinks(){
        System.out.println("Animal drinks");
    }

    static void plays(){
        System.out.println("Animal plays!!");
    }
}

class Cat implements Animal{
    @Override
    public void sleep(){
        System.out.println("Cat sleeps");
    }
}

public class defaultInterface{
    public static void main(String[] args){
        Animal a = new Cat();
        a.sleep();
        a.eat();
        Animal.plays();
    }
}