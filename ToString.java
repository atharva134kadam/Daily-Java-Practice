class Parent{
    String Name;
    int age;

    Parent(String Name, int age){
        this.Name = Name;
        this.age = age;
    }

    public String toString(){
        return "Name: "+Name+" , "+"age: "+age;
    }
}
public class ToString{
    public static void main(String[] args){
        Parent p = new Parent("Atharva",21);

        System.out.println(p);

    }
}