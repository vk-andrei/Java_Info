package INTERFACES.STEP_03;
public class Animal implements Info {   // Animal РЕАЛИЗУЕТ Info (обязан)

    public int id;

    public void sleep() {
        System.out.println("Im sleeping");
    }

    public Animal(int id) {
        this.id = id;
    }

    public void showInfo () {
        System.out.println("Id is " + this.id);
    }


}
