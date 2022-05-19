package Method_Equals_StringPool;

public class Start {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println("Сравниваем примитивы: " + (x == y));
        System.out.println("--------------------------------------");

        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        Animal animal3 = new Animal(1);
        System.out.println("Сравниваем ссылки: " + (animal1 == animal2));  // FALSE! потому что ССЫЛКИ!
        System.out.println("--------------------------------------");

        animal2 = animal1;
        System.out.println("Сравниваем ссылки: " + (animal1 == animal2));  // TRUE
        System.out.println("--------------------------------------");


        Object obj = new Object();  // у него и у его наследников есть метод equals;

//      System.out.println("Сравниваем ссылки: " + (animal1.equals(animal3)));  // без переопределения будет FALSE;
//      System.out.println("--------------------------------------");

        System.out.println("Сравниваем объекты после переопределения метода equal: " + (animal1.equals(animal3)));  // без переопределения будет FALSE;
        System.out.println("--------------------------------------");


    }
}

class Animal {
    private int id;
    public Animal (int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {       // ПЕРЕОПРЕДЕЛИЛИ МЕТОД Oject-a (он принимает на вход объект с кот будет себя сравнивать)
        Animal otherAnimal = (Animal) obj;    // Downcast
        return this.id == otherAnimal.id;
    }
}

