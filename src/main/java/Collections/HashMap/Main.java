package Collections.HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,String> passportsAndNames = new HashMap<>();
        HashMap<Integer,String> passportsAndNames2 = new HashMap<>();

        passportsAndNames.put(123,"Andrei" );
        passportsAndNames.put(121,"Lena" );
        passportsAndNames.put(120,"Sonya" );
        passportsAndNames2.put(200,"Artemii" );
        passportsAndNames2.put(120,"Mark" );

        System.out.println(passportsAndNames);
        System.out.println(passportsAndNames2);

        passportsAndNames.putAll(passportsAndNames2);
        System.out.println(passportsAndNames);

        HashMap<Integer,String> passportsAndNames_forClone = new HashMap<>();
        System.out.println(passportsAndNames.clone());

    }
}
