package CLASSES_OBJECTS.lesson_03_Inharitance.Example_2;

// Собака тоже животное. Она тоже умеет 1. есть и 2. спать

public class Dog extends Animal {  // собака расширяет класс Животное (класс Animal - родитель класса Dog)
                                   // и наследует все от Animal


    public void bark () {               // А это метод чисто для собаки
        System.out.println("Dog is barking");
    }

    // Можем переопределить метод. Указать более конкретно
    public void eat () {
        System.out.println("Dog is eating");
    }


}



