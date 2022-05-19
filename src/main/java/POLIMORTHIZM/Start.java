package POLIMORTHIZM;

// ПОЛИМОРФИЗМ - с греч. МНОЖЕСТВО ФОРМ. в IT - способность метода обрабатывать данные разных типов.

public class Start {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        commonInfo(animal1);
        commonInfo(dog1);
        commonInfo(cat1);

    }


public static void commonInfo(Animal animal) {
        animal.eat();
}


}
