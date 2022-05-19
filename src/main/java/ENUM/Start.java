package ENUM;

public class Start {
    public static void main(String[] args) {

        Animal animal1 = Animal.CAT;
        Animal animal2 = Animal.BIRD;               // Object --> Enum --> Season (Animal)
                                                    //
        switch (animal1) {
            case CAT -> {
                System.out.println("It's a cat!");
            }
            case DOG -> {
                System.out.println("It's a dog!");
            }
            case BIRD -> {
                System.out.println("It's a bird!");
            }
            case FROG -> {
                System.out.println("It's a frog!");
            }
            default -> {
                System.out.println("It's not an animal!");
            }
        }

        System.out.println(animal1.getTranslation());

        System.out.println("--------------------------------");
        Season season = Season.SUMMER;

        switch (season) {
            case SUMMER -> System.out.println("It's warm outside!");
            case WINTER -> System.out.println(("It's cold outside"));
        }
        // проверяет является ли объект season enum-ом Season
        System.out.println("-----------------------------------");
        System.out.println(season instanceof Season);
        System.out.println(season instanceof Enum);
        System.out.println(season instanceof Object);
        System.out.println("-----------------------------------");
        System.out.println(season.name());
        System.out.println(season.getClass());
        System.out.println("-----------------------------------");
        System.out.println(Animal.valueOf("CAT"));
        System.out.println("-----------------------------------");
        System.out.println(animal1.ordinal()); // какой индекс в enum у объекта







    }
}
