package ARRAYS.lesson_05;
import java.util.Arrays;
import java.util.Random;
// Отсортируйте элементы в строках двумерного массива по возрастанию
public class Arrays_05_sort {
    public static void main(String[] args) {

        int [][] array2d = new int[3][4];
        Random ran = new Random();

        for (int[] elem : array2d) {
            for (int j = 0; j < array2d[0].length; j++) {
                elem[j] = ran.nextInt(21);          // 0 - 20
            }
        }
        for (int[] elem : array2d) {
            for (int j = 0; j < array2d[0].length; j++) {
                System.out.print(elem[j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n------------SORTED-------------");

        for (int[] elem : array2d) {
            Arrays.sort(elem);
        }

        for (int[] elem : array2d) {
            for (int j = 0; j < array2d[0].length; j++) {
                System.out.print(elem[j] + " ");
            }
            System.out.println();
        }
    }
}

