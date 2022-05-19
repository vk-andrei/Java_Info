package INPUT;
import java.util.Scanner;
public class input_text_numbers {
    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);

        System.out.println("Input some text");
        String str1 = str.nextLine();           // нельзя просто str.   Строковое значение
        System.out.println(str1);

        System.out.println("Input some integer number");
        int str2 = str.nextInt();               // Integer
        System.out.println(str2);

        int first, second, result;
        System.out.print("Enter first num: ");
        first = str.nextInt();
        System.out.print("Enter second num: ");
        second = str.nextInt();
        result = first + second;
        System.out.println("Result is: " + result);
    }

}
