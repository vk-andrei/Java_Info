package CLASSES_OBJECTS.lesson_05_nested_classes;

public class Human {      // Вложенные классы делают тогда когда вот этот (Human) может из
    // чего-то состоять. (Голова, тело, руки, ноги)

    public Head head;       // экземпляр головы
    public Body body;       // экземпляр туловища

    public Human() {       // Конструктор для человека
        this.head = new Head();
        this.body = new Body();
    }

    void say () {               // метод для головы
        System.out.println("Мой голос " + head.voice);
    }


    static class Head {
        String voice = "Тонкий";
    }
    static class Body {
        String form = "Толстое";
    }

}
