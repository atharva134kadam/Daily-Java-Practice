class Animal{
    void run(){
        System.out.println("Animal runs");
    }
}
class Duck extends Animal{
    void run(){
        System.out.println("Duck runs");
    }
}
class Hen extends Animal{
    void run(){
        System.out.println("Hen runs");
    }
}
public class runPolymorphism{
    public static void main(String[] args){
        Duck d = new Duck();
        Hen h = new Hen();

        d.run();
        h.run();
    }
}