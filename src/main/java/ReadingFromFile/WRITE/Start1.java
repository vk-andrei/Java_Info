package ReadingFromFile.WRITE;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Start1 {
    public static void main(String[] args) throws FileNotFoundException {

        File file1 = new File("src/main/java/ReadingFromFile/WRITE/test_write.txt");

        PrintWriter pw = new PrintWriter(file1);  // класс для записи в файл информацию3

        pw.println("ROW 1...............");       // метод для записи в файл по строкам
        pw.println("ROW 2...............");
        pw.println("ROW 3...............");

        pw.close();   // ОБЯЗАТЕЛЬНО



    }
}
