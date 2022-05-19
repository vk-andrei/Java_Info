package Exceptions_Try_Catch;

import java.io.IOException;
import java.util.Scanner;

public class Start4 {                                      // Если на сайте JAVA в Exceptions нет нужного исключения
    public static void main(String[] args) throws Scanner_my_Exception {        // можно написать исключение самому
        Scanner scan = new Scanner(System.in);

        while (true) {
            int x = Integer.parseInt(scan.nextLine());

            if (x != 0) {
                throw new Scanner_my_Exception("User inputted not zero!");

            }
        }
    }
}


// Бывают Checked Exceptions (Compile time exception) - исключительные случае в работе программы
// Бывают Unchecked Exceptions (Runtime exception)    - ошибки в программе (напр деление на 0, вызов элемента массива за
//                                                      его пределами и пр)
// Все exceptions в Java - checked, кроме одного RuntimeException. (Все есть на сайте)