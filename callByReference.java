public class callByReference{
    public static void main(String[] args){
        Random r1 = new Random(2,3);

        System.out.println(r1.x+" , "+r1.y);

        add(r1);

        System.out.println(r1.x+" , "+r1.y);
    }
    static void add(Random r){
        r.x = r.x+10;
        r.y = r.y+10;
    }
}

class Random{
    int x;
    int y;

    public Random(int x, int y){
        this.x=x;
        this.y=y;
    }
}