package INTERFACES.STEP_01;

public class Animal {       // Животное - есть свой номер и свой метод

    public int id;

    public void sleep() {
        System.out.println("Im sleeping");
    }

    public Animal (int id) {
        this.id = id;
    }

}
