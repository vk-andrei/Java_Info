package Serialization.part_01;
import java.io.Serializable;

public class Person implements Serializable {

    private int id;
    private String name;
    /// Constructor/////
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
        //// Getters  //////
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String toString() {          // переопределили метод toString (чтобы при обращ к person выдавалась норм инфо)
        return id + " : " + name;
    }

}
