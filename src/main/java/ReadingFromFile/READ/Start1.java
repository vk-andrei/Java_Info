package ReadingFromFile.READ;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
//F:\_GEEK\_projects\_training\01_training\src\main\java\ReadingFromFile\READ\test1.txt

public class Start1 {
    public static void main(String[] args) throws FileNotFoundException {
        String sep = File.separator;
        // можно и так:
        // String path1 = "F:\\_GEEK\\_projects\\_training\\01_training\\src\\main\\" +
        //            "java\\ReadingFromFile\\READ\\test1.txt";
        // можно и так:
        String path1 = "F:" + sep + "_GEEK" + sep + "_projects" + sep + "_training" + sep + "01_training" + sep +
                      "src" + sep + "main" + sep + "java" + sep + "ReadingFromFile" + sep + "READ" + sep + "test1.txt";

        File file1 = new File(path1);

        Scanner scan = new Scanner(file1);
        //////////////////////////////////////// ЧТЕНИЕ СТРОК /////////////////////////////////////////
        while (scan.hasNextLine()) {  // пока есть строки
            System.out.println(scan.nextLine());
        }
        System.out.println("-------------------------------------------");
        //////////////////////////////////////// ЧТЕНИЕ СТРОКИ с методом split ////////////////////////
        String path2 = "src/main/java/ReadingFromFile/READ/test2.txt";
        File file2 = new File(path2);

        scan = new Scanner(file2);
        String line = scan.nextLine();
        System.out.println(line); // 45 5 234 0 55 - строка. Если хотим каждое число в отдельности создаем массив

        String[] stringNumbers = line.split(" ");   // разделяем line методом split
        System.out.println(Arrays.toString(stringNumbers)); // но каждый элемент - это все равно строки!
        // чтобы переделать строки в числа вызовем метод parseInt который нах-ся в классе Integer
        int[] numbers = new int[5];
        int counter = 0;
        for (String strNumber : stringNumbers) {
            numbers[counter++] = Integer.parseInt(strNumber);
        }
        System.out.println();
        System.out.println("ЗДЕСЬ УЖЕ КАЖДЫЙ ЭЛЕМЕНТ - число!");
        System.out.println(Arrays.toString(numbers));

        scan.close();  // надо закрывать, чтобы освобождать память

    }
}
