package Lambda.Example3_lambda_srteam;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Sergei", 39));
        personList.add(new Person("Daria", 7));
        personList.add(new Person("Glass", 3));
        personList.add(new Person("Sasha", 6));
        personList.add(new Person("Anna", 18));

//        for (Person p : personList) {
//            System.out.println(p);
//        }
        // stream - возвращает объект класса STREAM у кот есть набор методов, кот-е в кач параметров принимают
        // ‘”Ќ ÷»ќЌјЋ№Ќџ≈ »Ќ“≈–‘≈…—џ - а на их место мы можем подсунуть ЋяћЅƒј ¬џ–ј∆-я, т.е. ‘”Ќ ÷»». » эти функции
        // будут вып-с€ дл€ каждого объекта коллекции!

        personList.stream().forEach((Person p) -> System.out.println(p));
        System.out.println("------------------------------");
        // Ќ»∆≈  ќ–ќ„≈ (убираем ненужное)
        personList.stream().forEach(person -> System.out.println(person));
        System.out.println("------------------------------");
        // т.к. список параметров println такой же, как и у самого л€мбда выр-€ то ≈ў≈  ќ–ќ„≈:
        personList.stream().forEach(System.out::println);
        System.out.println("------------------------------");
        // можно быстро фильтровать!
        personList.stream().filter(person -> person.getAge() >= 18).forEach(System.out::println);
        System.out.println("------------------------------");
        // отсортировать!!!
        personList.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).forEach(System.out::println);
        System.out.println("------------------------------");
        // превращать класс Person просто в name например:
        personList.stream().map(person -> person.getName()).forEach(System.out::println);


    }
}
