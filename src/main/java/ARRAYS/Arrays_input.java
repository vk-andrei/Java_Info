package ARRAYS;
import java.util.Scanner;

public class Arrays_input {
    public static void main(String[] args) {

        int[] myArr;
        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("Input array's size: ");
        n = input.nextInt();
        myArr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("myArray [" + i + "] = ");
            myArr[i] = input.nextInt();
        }
    }
}
