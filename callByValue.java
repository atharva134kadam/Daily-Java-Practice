public class callByValue{
    public static void main(String[] args){
        int x=3;
        int y=8;

        System.out.println(x+" , "+y);

        add(x,y);

        System.out.println(x+" , "+y);
    }
    static void add(int x, int y){
        x = x+10;
        y = y+10;
    }
}