import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterableInterface {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        Iterator<Integer> it = list1.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
