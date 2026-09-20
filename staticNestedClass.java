class Outer{
    static class Inner{
        void sound(){
            System.out.println("This is inner class");
        }
    }
}
public class staticNestedClass{
    public static void main(String[] args){
        Outer.Inner inner = new Outer.Inner();
        inner.sound();
    }
}