package CLASSES_OBJECTS.lesson_00_3_Get_set_Incapsulation;

public class Start {
    public static void main(String[] args) {

        Person person1 = new Person();
        String s1 = "";
        int age1 = -4;

        person1.setNameAge(s1, age1);

        person1.sayInfo();

        System.out.println("person1's name: " + person1.getName());

        System.out.println("persons1's age: " + person1.getAge());
    }
}
class Person{
    private String name;        // ДОСТУПНО только в пределах класса. ИНКАПСУЛЯЦИЯ. Защита от пользователя
    private int age;            // ИДЕЯ - вы должны максимально ограничивать свои поля от других классов
                                // они должны быть доступны только в том классе в котором за декларированы
                                // а доступ вы должны осуществлять только через Setter&Getter - ы

    // Через этот метод пользователь будет получать доступ к имени и возрасту
    public void setNameAge (String name, int age) {
        if (name.isEmpty()) {
            System.out.println("Empty name!!!");
        } else {
            this.name = name;
        }
        if (age <= 0) {
            System.out.println("Age should be positive!!!");
        } else {
            this.age = age;
        }

    }
    // А через этот метод пользователь будет выводить имя объекта (смотреть)
    public String getName() {
        return name;
    }
    // А через этот метод пользователь будет выводить возраст объекта (смотреть)
    public int getAge () {
        return age;
    }


    void sayInfo () {                        // этот метод ничего не возвращает (void)
        System.out.println("My name is " + name + ", " + age + " years old.");
    }
}