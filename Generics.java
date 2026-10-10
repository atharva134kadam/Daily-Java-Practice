class Box<T>{
    private T value;

    Box(T value){
        this.value=value;
    }

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}

public class Generics{
    public static void main(String[] args){
        Box<Integer> b1 = new Box<Integer> (10);
        Box<String> b2 = new Box<String> ("hello");
        Box<Boolean> b3 = new Box<Boolean> (false);

        System.out.println(b1.getValue() + 10);
        System.out.println(b2.getValue() + 10);
        System.out.println(b3.getValue());
    }
}