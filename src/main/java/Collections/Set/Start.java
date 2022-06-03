package Collections.Set;

import java.util.*;

public class Start {public static void main(String[] args) {

    String[] words = new String[]{"Ford", "Volkswagen", "Lada", "Bugatti", "Cadillac", "Volkswagen",
            "Lada", "Volvo", "Dodge", "Jaguar", "Hyundai", "Chevrolet", "Ferrari", "Fiat", "Audi",
            "Suzuki", "Lada", "Dodge", "Dodge"};
    Integer[] ints = new Integer[]{12, 12, 1, 1, 3, 45, 45, 55, 10, 55};

    uniqueNames(words);
    uniqueNames(ints);

}
    private static <T> void uniqueNames(T[] anyArray) {
        Set<T> set = new HashSet<>(Arrays.asList(anyArray));
        System.out.println(set);
        System.out.println("Qty unique names: " + set.size());
    }
}
