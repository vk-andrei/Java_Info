package CLASSES_OBJECTS.lesson_03_Inharitance.Example_2;

public class MainApp {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        Dog bim = new Dog();
        bim.eat();               // наследие от Animal
        bim.sleep();             // наследие от Animal

        bim.bark();          // свой метод
    }
}
