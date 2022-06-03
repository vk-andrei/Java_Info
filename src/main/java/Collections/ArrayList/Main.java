package Collections.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> phoneNames = new ArrayList<>();
        phoneNames.add("Lena");
        phoneNames.add("Andrei");
        phoneNames.add("Mark");
        phoneNames.add("Sonya");
        phoneNames.add("Artemii");

        System.out.println(phoneNames);
        phoneNames.add(2, "Lyuba");

        System.out.println(phoneNames);
        phoneNames.set(2, "Lyubov");

        System.out.println(phoneNames);
        System.out.println("Element #2: " + phoneNames.get(2));

        String del = phoneNames.remove(0);
        System.out.println("Deleted element #0 [" + del + "] :" + phoneNames);

        phoneNames.trimToSize();
        System.out.println("size after trim: " + phoneNames.size());

        System.out.println("Andrei in list?: " + phoneNames.contains("Andrei"));

    }
}
