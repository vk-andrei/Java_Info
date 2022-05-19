package INTERFACES.STEP_02;
public class Start {

    public static void main(String[] args) {

        // Animal animal1 = new Animal(1);
        // Person person1 = new Person("Andrei");
        // animal1.showInfo();
        // person1.showInfo();


        // Можно и так, потому что эти классы реализуют этот ИНТЕРФЕЙС
        // Нам неважно какие остальные методы у этих классов нам важны лишь те методы кот заданы в ИНТЕРФЕЙСЕ
        Info info1 = new Animal(2);
        Info info2 = new Person("Mark");

        info1.showInfo();
        info2.showInfo();

        // СМОТРИ STEP_03


    }
}
