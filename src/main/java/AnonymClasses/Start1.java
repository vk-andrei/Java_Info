package AnonymClasses;

public class Start1 {
    public static void main(String[] args) {

        Animal1 animal1 = new Animal1();
        animal1.eat();

        OtherAnimal1 animalTheOnlyOne = new OtherAnimal1();
        animalTheOnlyOne.eat();
    }
}
class Animal1 {
    public void eat() {
        System.out.println("Animal is eating ... ");
    }
}
class OtherAnimal1 extends Animal1 {
    @Override
    public void eat() {
        System.out.println("Other animal is eating... ");
    }
}
// Но! Что если объект animalTheOnlyOne нужно использовать в коде только 1 раз. Создавать спец класс для этого, потом
// переопределять метод в нем - геморройно. Лучше сделать так - АНОНИНМНЫЙ КЛАСС. --> смотри след страницу Start2
