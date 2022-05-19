package INTERFACES.STEP_03;

public class Start {

    public static void main(String[] args) {

        Info info1 = new Animal(2);
        Info info2 = new Person("Mark");

        outputInfo(info1);
        outputInfo(info2);

        // А еще можно так:

        Animal animal1 = new Animal(3);
        Person person1 = new Person("Sonya");

        outputInfo(animal1);
        outputInfo(person1);

    }

    // Этот метод принимает в качестве аргументов НЕЧТО что реализует интерфейс Info.
    // Теперь этот метод может действовать на люб объекте, класс которого реализует интерфейс Info
    public static void outputInfo (Info info) {
        info.showInfo();

    }
}
