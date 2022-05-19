package Serialization.part_02_Arrays;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/main/java/Serialization/part_02_Arrays/people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // считаем из файла ЧИСЛО (мы записывали туда длину массива)
            int l = ois.readInt();
            Person[] people = new Person[l];

            for (int i = 0; i < people.length; i++) {
                people[i] = (Person) ois.readObject();  // downcast
            }
            System.out.println(Arrays.toString(people));
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        //----------------------------- 2 СПОСОБ(проще)-------------------------------------------//

        try {
            FileInputStream fis = new FileInputStream("src/main/java/Serialization/part_02_Arrays/cars.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Car[] cars = (Car[]) ois.readObject();

            System.out.println(Arrays.toString(cars));
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }




}
