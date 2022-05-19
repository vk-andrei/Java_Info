package ARRAYS.lesson_05_1;
import java.util.Arrays;
import java.util.Random;
public class Arrays_06_sort {
    public static void main(String[] args) {

        int [] myArr = new int[10];
        Random ran = new Random();
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = ran.nextInt(21);
        }
        for (int elem : myArr) {
            System.out.print(elem + " ");
        }

        // SORTED witn import java.util.Arrays;
        Arrays.sort(myArr);

        System.out.println("\n------------SORTED-------------");
        for (int elem : myArr) {
            System.out.print(elem + " ");
        }
    }
}