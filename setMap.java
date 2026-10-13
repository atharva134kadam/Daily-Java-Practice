import java.util.*;

public class setMap {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);

        System.out.println(set1.contains(10));
        System.out.println(set1.isEmpty());

        Map<Integer , String> map1 = new HashMap<>();
        map1.put(10,"Atharva");
        map1.put(20,"Meghana");
        map1.put(30,"Madhav");
        map1.put(40,"Ashis");

        System.out.println(map1.containsKey(20));
    }
}
