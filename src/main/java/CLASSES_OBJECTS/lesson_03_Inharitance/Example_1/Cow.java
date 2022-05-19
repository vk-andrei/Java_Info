package CLASSES_OBJECTS.lesson_03_Inharitance.Example_1;

import CLASSES_OBJECTS.lesson_03_Inharitance.Example_1.Animal;

public class Cow extends Animal {   // класс Cow унаследует все то, что есть у Animal
                                    // и имеет что-то свое. методы и прочее


    public Cow() {    }

    public Cow(String say, int teeth) {     // быстро - зажимаем ala + ins и выбираем Constructor
        setSay(say);
        setTeeth(teeth);
    }

    void mu() {
        System.out.println(getSay() + " во все " + getTeeth() + " зуба");
    }




}
