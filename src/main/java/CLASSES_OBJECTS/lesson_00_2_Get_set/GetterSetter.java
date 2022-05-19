package CLASSES_OBJECTS.lesson_00_2_Get_set;

public class GetterSetter {
    public static void main(String[] args) {

        Person person1 = new Person();
        // person1.name = "Dima"; - создадим вместо этого МЕТОД setName кот будет назначать имя и возраст объекту
        String s1 = "Dima";
        int age1 = 10;
        person1.setNameAge(s1, age1);
        // выводим имя объекта через getName
        person1.getName(person1.name);
        // выводим возраст объекта через getName
        person1.getAge(person1.age);
    }
}
    class Person{
        String name;
        int age;
        // МЕТОД setName кот будет назначать имя объекту и возраст
        void setNameAge (String name, int age) {
            this.name = name;
            this.age = age;
        }
        // МЕТОД getName кот будет выводить имя объекта           НЕПРАВИЛЬНО!!!!!!!!!!
        void getName(String name) {
            System.out.println(name);
        }
        // МЕТОД getName кот будет выводить возраст объекта       НЕПРАВИЛЬНО!!!!!!!!!!!
        void getAge (int age) {
            System.out.println(age);
        }
        //----------------------------------СМОТРИ СЛЕДУЩИЙ УРОК---------------------
}
