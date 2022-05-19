package CLASSES_OBJECTS.lesson_03_Inharitance.Example_1;

import CLASSES_OBJECTS.lesson_03_Inharitance.Example_1.Animal;

public class Lion extends Animal {

    private String color = "default color";


    public Lion() {}
    public Lion(String say, int teeth, String color) {
        setTeeth(teeth);
        setSay(say);
        setColor(color);
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    // -------------------- ПЕРЕОПРЕДЕЛЕНИЕ МЕТОДА - чуть чуть изменяем метод СУПЕР КЛАССА Animal
    //--------------------- делает тоже самое, но чуть по другому (ЛЕВ имеет тот же метод, что и Animal, то же название
    //--------------------- но делает он чуть не то)
    public String getSay() {
        String say = super.getSay();
        return say + " RRRRRrrrrrrr";
    }

    void rr () {
        System.out.println(getSay());
    }

}
