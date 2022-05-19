package ARRAYS.lesson_03;
// Просуммируйте все элементы двумерного массива.

public class Arrays_03 {
    public static void main(String[] args) {

        int[][] array2d = new int[2][5];
        int sumArray2 = 0;

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                array2d[i][j] = (int) (Math.random() * 9);
                sumArray2 += array2d[i][j];

            }
        }

        for (int[] elements : array2d) {
            for (int j = 0; j < array2d[0].length; j++) {
                System.out.print(elements[j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of all numbers = " + sumArray2);

    }
}
