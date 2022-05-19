package INTERFACES.STEP_01;

public class Start {

    public static void main(String[] args) {

        Animal animal1 = new Animal(1);
        animal1.sleep();

        Person person1 = new Person("Andrei");
        person1.sayHello();

        // Два разных класса Person и Animal. Но делают похожие вещи.
        // Можно создать ИНТЕРФЕЙС для них в кот пропишем 1 общий метод, а реализуют они его
        // по своему

        // СМОТРИ STEP_02

    }
}
