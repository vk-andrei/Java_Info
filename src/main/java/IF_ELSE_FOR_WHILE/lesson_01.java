package IF_ELSE_FOR_WHILE;
import java.util.Scanner;
public class lesson_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int first, second = 20;
        boolean isTrue = true;
        System.out.print("Input first num: ");
        first = input.nextInt();

        if (first > second && isTrue) {
            System.out.println("first > second");
        } else if (first == 10) {
            System.out.println("first is equal 10");
        } else if (first == second) {
            System.out.println("first = second");
        } else {
            System.out.println("first < second");
        }

        // ----------------------------------------------------
        isTrue = first == 50 ? true : false;    // if first = 50 --> isTrue = true    (можно не писать true & false)
        second = first == 50 ? 21 : 45;         // if first = 50 --> second = 21, if no then 45

        // ----------------------------------------------------
        switch (first) {
            case 51 -> System.out.println("Num is equal 51");
            case 48 -> System.out.println("Num is equal 48");
            case 11 -> System.out.println("Num is equal 11");
            case 100 -> System.out.println("Num is equal 100");
            default -> System.out.println("Num is ?????????");
        }
    }
}
