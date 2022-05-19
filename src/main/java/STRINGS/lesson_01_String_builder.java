package STRINGS;

import java.util.Locale;

public class lesson_01_String_builder {
    public static void main(String[] args) {
        /*String x = "hello";
        x.toUpperCase();        // Так НЕЛЬЗЯ. Все методы String не оперируют на строке в кот они вызываются.
        System.out.println("NOT RIGHT: " + x);  // они ВОЗВРАЩАЮТ НОВУЮ строку, кот явл-ся результатом выполнения этого метода

        x = x.toUpperCase();    // Надо делать ТАК
        System.out.println("RIGHT: " + x);*/

        StringBuilder sb1 = new StringBuilder("Hello");  // Обычная конкатенация строк занимает много памяти и тормозит.
                                                        // для больших операций со строками StringBuilder
        System.out.println(sb1.toString());
        sb1.append(" my");       // метод append возвращет тот же самый объект на кот был вызван
        sb1.append(" friend!");
        System.out.println(sb1.toString());

        StringBuilder sb2 = new StringBuilder();
        sb2.append("How").append(" are").append(" you?"); // МОЖНО И ТАК!!!!!!!
        System.out.println(sb2);


    }

}
