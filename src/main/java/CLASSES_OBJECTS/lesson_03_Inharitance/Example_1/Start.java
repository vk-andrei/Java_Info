package CLASSES_OBJECTS.lesson_03_Inharitance.Example_1;

import CLASSES_OBJECTS.lesson_03_Inharitance.Example_1.Cow;
import CLASSES_OBJECTS.lesson_03_Inharitance.Example_1.Lion;

public class Start {
    public static void main(String[] args) {


        Cow burenka = new Cow();
        Cow alenka = new Cow("muuuuuuuuuuu", 32);

        Lion vasya = new Lion("IM A LION", 25, "yellow");


        //System.out.println(vasya.getSay());
        burenka.mu();   // создали метод у буренки
        alenka.mu();

        // System.out.println(vasya.getSay());
        vasya.rr();
        vasya.setColor("RED");
        System.out.println(vasya.getColor());

        System.out.println(burenka.getSay());
        System.out.println(alenka.getSay());
        System.out.println(vasya.getSay());    // метод getSay тут переопределен. Чуть изменен

    }
}
