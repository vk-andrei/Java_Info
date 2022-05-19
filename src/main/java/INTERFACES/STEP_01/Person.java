package INTERFACES.STEP_01;

public class Person {           // Человек - есть свой номер и свой метод

    public String name;

    public void sayHello () {
        System.out.println("Hello!!!");
    }

    public Person (String name) {
        this.name = name;
    }

}
