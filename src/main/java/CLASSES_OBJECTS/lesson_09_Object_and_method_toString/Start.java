package CLASSES_OBJECTS.lesson_09_Object_and_method_toString;

import java.sql.SQLOutput;

public class Start {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 40);

        // Без переопределения метода toString будет выводиться ХЭШ, а с переопределением - то что мы напишем в методе
        System.out.println(h1.toString()); // Этот метод возвращает хэш-код объекта h1 (Human@eed1f14)
        System.out.println(h1);            // Выведется хэш-код объекта h1 (То же самое. Просто по умолчанию - .toString)
        // если мы хотим чтобы этот метод выводил не хэш-код его надо ПЕРЕОПРЕДЕЛИТЬ в классе Human

    }
}

// У ВСЕХ КЛАССОВ есть класс кот стоит выше - OBJECT. Они наследуются от него скрыто.
// Когда мы наследуемся от какого то класса мы наследуем все его поля.
// В данном случае у класса Human есть все методы класса OBJECT (метод toString - оттуда)

class Human {
    private String name;
    private int age;

    public Human (String name, int age) {
        this.name = name;
        this.age = age;
    }
    // переопределяем метод класса OBJECT под наши требования
    public String toString () {
        return (name + ", " + age);

    }
}
