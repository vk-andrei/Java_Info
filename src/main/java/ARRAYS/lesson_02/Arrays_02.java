package ARRAYS.lesson_02;
// Даны матрицы С и D размерностью 3 на 4 и заполненные случайными числами в диапазоне от 0 до 9.
// Выполните по отдельности сначала сложение, потом умножения матриц друг на друга.
// Выведете исходные матрицы и результат вычислений на консоль.
public class Arrays_02 {
    public static void main(String[] args) {

        int[][] matrixC = new int[3][4];
        int[][] matrixD = new int[3][4];
        int[][] matrixSumCD = new int[3][4];
        int[][] matrixMultiplyCD = new int[3][4];

        for (int i = 0; i < matrixC.length; i++) {
            for (int j = 0; j < matrixC[0].length; j++) {
                matrixC[i][j] = (int) (Math.random() * 9);
                matrixD[i][j] = (int) (Math.random() * 9);
                matrixSumCD[i][j] = matrixC[i][j] + matrixD[i][j];
                matrixMultiplyCD[i][j] = matrixC[i][j] * matrixD[i][j];
            }
        }

        printMatrix(matrixC);
        printMatrix(matrixD);
        printMatrix(matrixSumCD);
        printMatrix(matrixMultiplyCD);

        // System.out.println(matrixC.length);
        // System.out.println(matrixC[0].length);   -- длина строки (вторая размерность массива)
    }

    public static void printMatrix(int [][] anyMatrix) {
        for (int i = 0; i < anyMatrix.length; i++) {
            for (int j = 0; j < anyMatrix[0].length; j++) {
                System.out.print(anyMatrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}