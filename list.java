import java.util.*;

public class list {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.get(1));
        list.add(3, 4);
        System.out.println(list);

        ListIterator<Integer> it = list.listIterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        ListIterator<Integer> it1 = list.listIterator(4);

        while(it1.hasPrevious()){
            System.out.println(it1.previous());
        }
    }
}
