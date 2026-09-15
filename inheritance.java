class Animal{
    void Sound(){
        System.out.println("Makes sound");
    }
}

class Dog extends Animal{
    void Bark(){
        System.out.println("Dog Barks");
    }
}

public class inheritance{
    public static void main(String[] args){
        Dog d = new Dog();
        d.Bark();
        d.Sound();
    }
}