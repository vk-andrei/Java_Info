package Exceptions_Try_Catch;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) { //throws FileNotFoundException} //- один из вариантов сработки исключения

        File file1 = new File("src/main/java/Exceptions_Try_Catch/test1.txt");
        try {                                       // - 2й вариант - обрабатываем исключение сами
            Scanner scan = new Scanner(file1);
            System.out.println("After successful scanner ");
            System.out.println(scan.nextLine());
        } catch (FileNotFoundException e) {
            // e.printStackTrace();               // - по дефолту ( тоже самое что и throws FileNotFoundException
            System.out.println("File not found!");      // А это мы сами можем создать
        }

    }
}
///////////   Еще вариант в Start2