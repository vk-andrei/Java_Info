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
        // stream - ���������� ������ ������ STREAM � ��� ���� ����� �������, ���-� � ��� ���������� ���������
        // �������������� ���������� - � �� �� ����� �� ����� ��������� ������ �����-�, �.�. �������. � ��� �������
        // ����� ���-�� ��� ������� ������� ���������!

        personList.stream().forEach((Person p) -> System.out.println(p));
        System.out.println("------------------------------");
        // ���� ������ (������� ��������)
        personList.stream().forEach(person -> System.out.println(person));
        System.out.println("------------------------------");
        // �.�. ������ ���������� println ����� ��, ��� � � ������ ������ ���-� �� ��� ������:
        personList.stream().forEach(System.out::println);
        System.out.println("------------------------------");
        // ����� ������ �����������!
        personList.stream().filter(person -> person.getAge() >= 18).forEach(System.out::println);
        System.out.println("------------------------------");
        // �������������!!!
        personList.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).forEach(System.out::println);
        System.out.println("------------------------------");
        // ���������� ����� Person ������ � name ��������:
        personList.stream().map(person -> person.getName()).forEach(System.out::println);


    }
}
