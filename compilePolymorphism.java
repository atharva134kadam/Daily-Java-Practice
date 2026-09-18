class Animal{
    void run(){
        System.out.println("Animal runs");
    }
    String run(String animal){
        System.out.println(animal+" runs");
        return animal;
    }
}
public class compilePolymorphism{
    public static void main(String[] args){
        Animal a = new Animal();
        a.run();
        a.run("Peacock");
    }
}