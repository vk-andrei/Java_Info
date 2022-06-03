package STREAM_API;

import java.util.*;
import java.util.stream.Collectors;

public class Start2 {

    private static class Person {
        private String name;
        private String position;
        private int age;

        public Person(String name, String position, int age) {
            this.name = name;
            this.position = position;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s:  %s, %s years old\n", name, position, age);
        }
    }

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>(Arrays.asList(
                new Person("Bob1", "Engineer", 45),
                new Person("Bob2", "Engineer", 37),
                new Person("Bob3", "Manager", 31),
                new Person("Bob4", "Manager", 34),
                new Person("Bob5", "Engineer", 44),
                new Person("Bob6", "CEO", 50)
        ));
        // TASK:
        // 1. we need only ENGINEER
        // 2. we need sort by AGE
        // 3. we need list of only NAMES

        // 1:
        List<Person> engineerList = new ArrayList<>();
        for (Person p : personList) {
            if (p.position.equals("Engineer")) {
                engineerList.add(p);
            }
        }
        // 2:
        Collections.sort(engineerList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });
        // 3:
        List<String> namesList = new ArrayList<>();
        for (Person p : engineerList) {
            namesList.add(p.name);
        }
        System.out.println("1 way:" + namesList);

        // THE SAME with STREAM API:

        List<String> namesList2 = personList.stream()
                .filter(p -> p.position.equals("Engineer"))
                .sorted(((o1, o2) -> o1.age - o2.age))
                .map(p -> p.name)
                .collect(Collectors.toList());
        System.out.println("2 way:" + namesList2);

    }

}
