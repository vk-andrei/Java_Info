package Exceptions_Try_Catch;
import java.io.IOException;
import java.util.Scanner;

public class Start3 {
    public static void main(String[] args) {  // напишем прогу - если пользователь ввел не 0, то вызовем ошибку
        Scanner scan = new Scanner(System.in);          // обработаем это как ИСКЛЮЧЕНИЕ

        while (true) {
            int x = Integer.parseInt(scan.nextLine());

            if (x != 0) {
                try {
                    throw new IOException();        // выбрали такой Exception
                } catch (IOException e) {
                    System.out.println("User inputted not 0");
                }
            }
        }


    }
}
