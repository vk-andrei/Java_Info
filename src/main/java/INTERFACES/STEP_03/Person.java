package INTERFACES.STEP_03;
public class Person implements Info {          // Animal РЕАЛИЗУЕТ Info (обязан)

    public String name;

    public void sayHello () {
        System.out.println("Hello!!!");
    }

    public Person(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("My name is " + this.name);
    }

}
