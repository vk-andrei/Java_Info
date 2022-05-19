package FUNCTIONS;
import java.util.Scanner;
public class lesson_01 {

    public static void main(String[] args) {   // - это тоже функция! кот наз-ся main.
        // void - означает, что она ничего не возвращает (а вообще тут пишется
        // тип возвращаемых значений)
        // Она принимает параметры - это массив с именем args типа String
        int temp = func1(3, 4);
        System.out.println(temp);

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String userName = input.nextLine();

        func2(userName);

        int num = 5;
        int f = func3_factorial(num);
        System.out.println("Factorial " + num + " is " + f);

    }

    public static int func1(int a, int b) {       // a в степени b
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;                              // Возвращает result типа int
    }

    public static void func2(String name) {        // Ничего не возвращает.
        System.out.println("Hello, " + name);
    }

    public static int func3_factorial(int n) {     // Рекурсивная функция
        if (n == 0) {
            return 1;
        } else {
            return func3_factorial(n - 1) * n;
        }
    }

}

