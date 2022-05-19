package POLIMORTHIZM;

public class Dog extends Animal {

    @Override // переопределили метод
    public void eat() {
        System.out.println("Dog is eating ... (overriding method)");
    }
}
