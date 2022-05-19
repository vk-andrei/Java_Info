package CLASSES_OBJECTS.lesson_02_Static;
public class Start {
    public static void main(String[] args) {

        //Human h1 = new Human("Andrei", 39);
        //h1.setName("Tom");                    // можем поменять имя у объекта. А у класса НИЧЕГО поменять не можем

        // После создания переменной public STATIC String description мы можем обратиться к ней НЕ СОЗДАВАЯ
        // никакой объект. Эта переменная - СТАТИЧЕСКАЯ. Она принадлежит не объекту, а САМОМУ КЛАССУ.
        // она будет делиться между ВСЕМИ объектами класса. она общая для всех объектов.

        Human.description = "Nice";
        //Human.getDescription();
        Human h1 = new Human("Andrei", 39);
        Human h2 = new Human("Lena", 38);

        h1.getAllFields();
        h2.getAllFields();

        // изменим статическую переменную для всего класса Human
        Human.description = "Bad";

        h1.getAllFields();
        h2.getAllFields();

        // Допустим надо считать сколько объектов создается.
        // Создадим СТАТИЧЕСКУЮ переменную - т.к. этот счетчик д б один для всех объектов (public static int countPeople)

        h1.getNumberOfPeople();
        h2.getNumberOfPeople();

        Human h3 = new Human("Mark", 6);

        h1.getNumberOfPeople();
        h2.getNumberOfPeople();
        h3.getNumberOfPeople();

    }
}


class Human {
    // - переменные ОБЪЕКТА. у кажд объекта эти переменные РАЗНЫЕ. Они не принадлежат классу Human
    // они инициализируются лишь тогда, когда создается ОБЪЕКТ класса.
    // Мы не можем например взять класс и у него поменять имя
    private String name;
    private int age;
    // Создадим переменную STATIC
    public static String description; // они создаются уже при запуске программы. До создания объектов.
                                      // = 0 если int, = null если String

    public static int countPeople; // при созданиии он равен 0


    // конструктор
    public Human (String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;       // при вызове конструктора(при создании человека) инкрементируем кол-во людей
    }

    // - методы тоже ОБЪЕКТА (не класса)
    public void setName (String name) {
        this.name = name;
    }
    public void setAge (int age) {
        this.age = age;
    }

    // Создадим Static метод
//    public static void getDescription() {
//        System.out.println(description);

    public void getAllFields () {
        System.out.println(name + ", " + age + ", " + description);
    }

    public void getNumberOfPeople () {
        System.out.println("Number of people: " + countPeople);
    }

}
