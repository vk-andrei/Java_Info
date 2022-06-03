package Collections.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        LinkedList<String> girls = new LinkedList<>();

        girls.add("Lena");
        girls.add("Nastya");
        girls.add("Masha");
        girls.add("Irina");
        girls.add("Olya");
        System.out.println(girls);

        girls.offerFirst("Yulya");
        System.out.println(girls);
        girls.addFirst("Yulya1");
        System.out.println(girls);

        girls.add("Natasha");
        System.out.println(girls);
        String who = girls.peekFirst();
        System.out.println(who);

    }
}
