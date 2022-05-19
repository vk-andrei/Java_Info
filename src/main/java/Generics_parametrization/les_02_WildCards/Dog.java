package Generics_parametrization.les_02_WildCards;

public class Dog extends Animal {

    private int id;

    public Dog (int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Dog {id=" + id +'}';
    }


}
