package CLASSES_OBJECTS.lesson_08_method_overload;

public class Method_overloading {

    public static int summ (int a, int b) {        // Создали ОДИН метод (одно название) с разными входными данными
        return a + b;                              // чтобы не плодить лишних методов
    }                                              // Сам этот процесс наз-ся - ПЕРЕГРУЗКА МЕТОДОВ

    public static int summ (int a, int b, int c) {
        return a + b + c;
    }

    public static String summ (String str1, String str2) {
        return str1 + str2;
    }


    public static void main(String[] args) {
        System.out.println(summ(20, 30));
        System.out.println(summ(20, 30, 10));
        System.out.println(summ("My name is ", "Andrei"));
    }
}