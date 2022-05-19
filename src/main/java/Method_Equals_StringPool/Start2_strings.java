package Method_Equals_StringPool;

public class Start2_strings {
    public static void main(String[] args) {

        String str1 = "Hello";    //   str1   ->  {"Hello"}   (JAVA ссылает на одну и ту же строку ЕСЛИ она одинакова)
        String str2 = "Hello";    //   str2   ->

        System.out.println(str1 == str2);       // true Поттому что есть String Pool
        System.out.println(str1.equals(str2));  // true

        System.out.println("-------------------------------");
        String a = "Hello";                      // "Hello"
        String b = "Hello123".substring(0, 5);   // "Hello"

        System.out.println(a == b);              // FALSE
        System.out.println(a.equals(b));         // TRUE          - ЛУЧШЕ СРАВНИВАТЬ ТАК

    }
}
