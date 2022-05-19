// СОРТИРОВКА МАССИВА ПУЗЫРЬКОМ (BUBBLE METHOD)
package ARRAYS;
import java.util.Scanner;
public class Arrays_sort_manual {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input array's size: ");
        int n = input.nextInt();
        int[] myArr = new int[n];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (int) (Math.random() * 100);
        }
        for (int elem : myArr) {
            System.out.print(elem + " ");
        }
        System.out.println("\n---------BUBBLE SORT----------");

        int temp = 0;
        for (int i = 0; i < myArr.length - 1; i++) {
            for (int j = 0; j < myArr.length - 1 - i; j++) {
                if (myArr[j] > myArr[j + 1]) {
                    temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
            }
        }

        for (int elem : myArr) {
            System.out.print(elem + " ");
        }
    }
}