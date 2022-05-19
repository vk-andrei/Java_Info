package CLASSES_OBJECTS.lesson_01_Constructors;

public class Start {
    public static void main(String[] args) {

        Computer apple = new Computer(); // aplle - это ССЫЛКА на ЭЛЕМЕНТ в классе Computer (НЕ САМ ЭЛЕМЕНТ)
        // apple.cpu = 2500;
        apple.setCpu(2500);
        // apple.memory = 1000;
        apple.setMemory(1111);
        // apple.name = "MacBook10";
        apple.setName("MacBook10");
        //System.out.println(apple.cpu); -- сделали метод вместо этого

        Computer sumsung = new Computer(555, 1555, "Pro100"); // - нов элемент класса Computer
        // sumsung.setCpu(4000);
        sumsung.getCpu();

        Computer hp = new Computer("HP");



        Computer dexp = apple; // - создаем нов переменную (НЕ НОВ КОМП) - это ссылка на apple

        apple.getMemory();
        dexp.getMemory();       //  - то же самое потому что ССЫЛОЧНЫЙ ТИП ДАННЫХ. Объект один, а ссылки две

        apple.getCpu();
        apple.getName();
        dexp.getName();
    }
}
