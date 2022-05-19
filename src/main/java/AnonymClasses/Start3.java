package AnonymClasses;

public class Start3 {
    public static void main(String[] args) {

        AbleToEat cow = new AbleToEat() { // объект этого класса кот мы здесь создали - создан только на 1 раз, на 1
            @Override                     // использование
            public void eat() {
                System.out.println("Strange cow is eating...");
            }
        };
        cow.eat();

    }
}



// Если мы хотим использовать объект 1 раз можно не создавать класс ради этого, чтобы использовать 1 метод.
// МЫ можем использовать АНОНИМНЫЙ класс. см выше
/*
    class Animal3 implements AbleToEat {
    @Override
    public void eat() {
        System.out.println("Animal is eating ... ");
    }
}*/
interface AbleToEat {
    void eat();       // сигнатура метода (в интерфейсе говорим ЧТО ДОЛЖНО БЫТЬ РЕАЛИЗОВАНО, но не говорим КАК)
}
