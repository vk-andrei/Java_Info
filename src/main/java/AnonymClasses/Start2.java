package AnonymClasses;

public class Start2 {
    public static void main(String[] args) {

        Animal2 animal = new Animal2();
        animal.eat();

        // тут НАСЛЕДНИК класса Animal2
        Animal2 theOnlyOneAnimal = new Animal2() {              // переопределили метод без создания класса наследника!
            public void eat() {                                 // но это имеет смысл лишь когда это делается для 1
                System.out.println("The only one animal is eating...");   // случая (например исключения какого-нибудь)
            }
        };
        theOnlyOneAnimal.eat();
    }
}

class Animal2 {
    public void eat() {
        System.out.println("Animal is eating ... ");
    }
}

// Но! переопределять 1 единственный метод не очень полезно, поэтому смотри Start3/