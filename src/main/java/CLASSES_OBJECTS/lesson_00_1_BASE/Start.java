package CLASSES_OBJECTS.lesson_00_1_BASE;

public class Start {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Dima";
        person1.age = 10;
        //System.out.println("My name is " + person1.name + ", " + person1.age + " years old.");
        person1.sayInfo();
        person1.sayHello();
        // --------------------------------------------------------------------------------
        // Тут нарушается метод ИНКАПСУЛЯЦИИ. Так обращаться к полям объектов класса нельзя
        // --------------------------------------------------------------------------------
        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 20;
        //System.out.println("My name is " + person2.name + ", " + person2.age + " years old.");
        person2.sayInfo();
        int y2 = person2.calculateYearsToRetirement();
        System.out.println(person2.name + "'s years to retirement: " + y2);

    }
}

class Person{
    // У класса могут быть:
    // 1. ДАННЫЕ (поля)
    String name;
    int age;
    // 2. ДЕЙСТВИЯ, кот он может совершать (методы)
    void sayInfo () {                        // этот метод ничего не возвращает (void)
        System.out.println("My name is " + name + ", " + age + " years old.");
    }
    void sayHello () {                       // этот метод ничего не возвращает (void)
        System.out.println("Hello");
    }
    int calculateYearsToRetirement() {       // этот метод возвращает значение в класс main
        int years = 65 - age;
        return years;
    }

}

