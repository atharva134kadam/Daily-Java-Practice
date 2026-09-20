import java.util.*;
class questions {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(2, 8, 9, 10, 16, 62, 7);

        int result = l1.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .reduce((a, b) -> a + b)
                .orElse(0);

        System.out.println(result);
        
    }
}
