package ARRAYS.lesson_04;

import java.util.Random;

// Дан двумерный массив, содержащий отрицательные и положительные числа.
// Выведете на экран номера тех ячеек массива, которые содержат отрицательные числа.
public class Arrays_04 {
    public static void main(String[] args) {

        int[][] array2d = new int[4][4];
        Random ran = new Random();
        // System.out.println(ran.nextInt());

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                array2d[i][j] = ran.nextInt(21) - 10;  // random from -10 to 10
            }
        }
        for (int[] elem : array2d) {
            for (int j = 0; j < array2d[0].length; j++) {
                System.out.print(elem[j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                if (array2d[i][j] < 0) {
                    System.out.print("(" + i + ", " + j + ")  ");
                }
            }
            System.out.println();
        }





    }
}







