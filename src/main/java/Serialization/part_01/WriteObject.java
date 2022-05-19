package Serialization.part_01;
import java.io.*;

public class WriteObject {
    public static void main(String[] args) {

        Person person1 = new Person(1, "Andrei");
        Person person2 = new Person(2, "Mark");

        try {
            // Этот класс записывает последовательность байтов в файл. Этот класс максимально абстрактен. Он может
            // записывать объекты, звуки, что угодно
            FileOutputStream fos = new FileOutputStream("src/main/java/Serialization/part_01/people.bin");
            // Этот же класс нужен исключительно для записи ОБЪЕКТОВ в файл, он более конкретный, узкоспециализированный и
            // приближенный к байтам. Для того чтобы ему записывать ему нужен (fos) более абстрактный и более приближ к байтам
            // файл fos
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1); // записываем объект в файл
            oos.writeObject(person2);

            oos.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }

    }
}