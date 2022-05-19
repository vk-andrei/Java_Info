package Exceptions_Try_Catch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Start2 {
    public static void main(String[] args) {

        try {
            readFile();                         // здесь тоже должны обработать это исключение!!!
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!! (exception in method Main)");
        }

    }

// метод в котором читаем файл и в кот добавили исключение
    public static void readFile () throws FileNotFoundException {
        File file = new File("src/main/java/Exceptions_Try_Catch/test1.txt");
        Scanner scan = new Scanner(file);
    }

}



