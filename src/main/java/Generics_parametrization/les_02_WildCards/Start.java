package Generics_parametrization.les_02_WildCards;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {

        List<Animal> listOfAnimal = new ArrayList<>();

        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        listInfo(listOfAnimal); // переопределили метод toString

        // Создадим list собак (наследника Animal) и запихнем туда пару собак
        List<Dog> listOfDogs = new ArrayList<>();

        listOfDogs.add(new Dog(5));
        listOfDogs.add(new Dog(7));

        listInfo(listOfDogs); // - не получается. Тут полиморфизм не работает (когда в метод для родителя можно пихать
                              // и наследников. Чтобы заработало надо WildCard
    }
        ////////////    ДО WildCard    //////////////////
    /*private static void listInfo (List<Animal> anyList) {
        for (Animal element : anyList) {
            System.out.println(element);
        }
    }*/
    ////////////    ПОСЛЕ WildCard    //////////////////
    private static void listInfo (List<? extends Animal> anyList) {  // мы дали понять Java что будем сюда поставлять
        for (Animal element : anyList) {                             // листы Animal или любого другого класса кот наследуется
            System.out.println(element);                             // от него
        }                                       // теперь мы можем рассматривать элементы anyList как животных

        }

}
