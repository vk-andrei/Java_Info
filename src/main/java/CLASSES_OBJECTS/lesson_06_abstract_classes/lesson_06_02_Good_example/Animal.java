package CLASSES_OBJECTS.lesson_06_abstract_classes.lesson_06_02_Good_example;

public abstract class Animal { // мы дали понять JAVA что объекты этого классы НЕ ДОЛЖНЫ быть созданы. От него нужно
                                // наследоваться!!! И его наследники будут сущностями
    public void eat() {
        System.out.println("Animal is eating...");
    }

    public abstract void makeSound ();      // Абстрактный метод. Все животные как-то издают звуки.
                                            // Они обязаны иметь этот метод

}


// Все животные будут уметь ЕСТЬ одинаково, но все из них будут издавать РАЗНЫЕ звуки. Именно поэтому мы не можем
// создать животное.