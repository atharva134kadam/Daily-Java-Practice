public class GenericMethod {
    public static void main(String[] args) {
        String s1 = method("hello");
        System.out.println(s1); 
    }

    public static <T> T method(T value){
        return value;
    }
}
