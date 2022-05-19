package Generics_parametrization.les_02_WildCards;

public class Animal {

    private int id;

    public Animal (int id) {
        this.id = id;
    }

    public Animal () {};

    @Override
    public String toString() {
        return "Animal {id=" + id +'}';
    }
}