package CLASSES_OBJECTS.lesson_03_Inharitance.Example_1;

public class Animal {                 // здесь зададим все параметры кот должны обладать все животные

    private String say = "........."; // ИНКАПСУЛЯЦИЯ говорит нам о том, что параметры у класса д.б. обязат приватными
    private int teeth = 0;

    public String getSay() {        // так как параметры приватные нужны методы get и set
        return say;                 // быстро - зажимаем ala + ins и выбираем Getter & Setter
    }
    public void setSay(String say) {
        this.say = say;
    }
    public int getTeeth() {
        return teeth;
    }
    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }
}
