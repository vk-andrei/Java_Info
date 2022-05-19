package INPUT;
import java.sql.SQLOutput;
import java.util.Locale;

public class Strings {
    public static void main(String[] args) {

        String str1 = new String("Hello, "); // можно так
        String str2 = "world!";                     // можно и так
        String str3 = str2;                         // ссылочн тип данных. если изменим str3 изменится и str2
        // ----------- поэтому надо так:
        String str4 = str2.substring(0, 3);         // копирует все символы с 0-ого по 3-ий не включительно
        System.out.println(str4);
        // -------------------------------------------------------------
        // ----------- СРАВНЕНИЕ СТРОК ---------------------------------
        String str5 = "Andrei";
        String str6 = "ANDREI";
        System.out.println(str5 == str6);           // так не надо
        System.out.println(str5.equals(str6));      // ВОТ ТАК НАДО
        System.out.println(str5.equalsIgnoreCase(str6));
        String str7 = str6.toLowerCase();
        System.out.println(str7);
        int l = str7.length();                      // длина строки
        System.out.println(l);

    }



}
