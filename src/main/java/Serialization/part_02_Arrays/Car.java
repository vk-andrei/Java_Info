package Serialization.part_02_Arrays;
import java.io.Serializable;

public class Car implements Serializable {
    private String name;
    private int price;

    public Car (String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" + name + ", " + price + "$}";
    }
}
