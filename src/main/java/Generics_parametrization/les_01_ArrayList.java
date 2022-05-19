package Generics_parametrization;

import java.util.ArrayList;
import java.util.List;

public class les_01_ArrayList {
    public static void main(String[] args) {
        /////////////////////// JAVA 5 ///////////////////////////////
        List animals = new ArrayList();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");

        System.out.println(animals);  //  [Cat, Dog, Bird]

      //String animal = animals.get(1);  // так нельзя, потому что объект класса List хранит в себе объект класса Object
                                         // там не String. Поэтому надо сделать так: (DownCast)
        String animal11 = (String) animals.get(1);
        System.out.println("Указывали тип " + animal11);   // Dog

        ////////////////////// С появлением дженериков /////////////////////////

        List<String> animals2 = new ArrayList<String>();  // тут явно указали что за тип данных в ArrayList
        animals2.add("Cat");                              // не надо использовать Downcast
        animals2.add("Dog");                              // Java Знает что тут только строки
        animals2.add("Bird");

        String animal21 = animals2.get(2);
        System.out.println("Не указывали тип " + animal21);

        ////////////////////////// Java 7 ///////////////////////////////

        List<String> animals3 = new ArrayList<>(); // можно справа не указывать тип параметризации (т.к. и так понятно)



















    }
}
