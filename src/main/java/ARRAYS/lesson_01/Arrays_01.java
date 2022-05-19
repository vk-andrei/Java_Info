package ARRAYS.lesson_01;
// Создайте массив размерностью 5 на 6 и заполните его случайными числами (в диапазоне от 0 до 99).
// Выведите на консоль третью строку
public class Arrays_01 {
    public static void main(String[] args) {

        int[][] arr = new int[5][6];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                int x = (int) (Math.random() * 99);
                arr[i][j] = x;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}