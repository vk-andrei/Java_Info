package Serialization.part_02_Arrays;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        Person [] people = {new Person(1,"Andrei"), new Person(2, "Mark"),
                            new Person(3, "Sonya"), new Person(4, "Artemii")};

        Car [] cars = {new Car("Lada", 10000), new Car("Niva", 15000),
                       new Car("Kia", 50000)};

        //----------------------------- 1 СПОСОБ----------------------------------------------//

        try {
            FileOutputStream fos = new FileOutputStream("src/main/java/Serialization/part_02_Arrays/people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos); //

            // 1 способ записать массив файл:
            oos.writeInt(people.length); // - в файл запишем длину массива
            // затем в файл один за другим запишем объекты
            for (Person person : people) {
                oos.writeObject(person);
            }
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //----------------------------- 2 СПОСОБ(проще)------------------------------------------//

        try {
            FileOutputStream fos = new FileOutputStream("src/main/java/Serialization/part_02_Arrays/cars.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos); //

            // просто записываем туда массив как объект
            oos.writeObject(cars);
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}