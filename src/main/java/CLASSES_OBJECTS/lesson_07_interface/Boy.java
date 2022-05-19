package CLASSES_OBJECTS.lesson_07_interface;

public class Boy implements Player, Study {          // имплементируем интерфейс
    // мы ОБЯЗЫВАЕМ Boy иметь все методы кот есть в ИНТЕРФЕЙСЕ Player

    public void play() {    // вот метод с интерфейса Player
        System.out.println("Запускает игру ногой");

        // чтобы заставить мальчика уметь читать надо имплементировать интерфейс Study (где есть этот метод)

    }

    public void read() {       // вот метод с интерфейса Study
        //// --- как-то читает
    }
}
