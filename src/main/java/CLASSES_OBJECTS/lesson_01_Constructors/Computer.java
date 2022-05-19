package CLASSES_OBJECTS.lesson_01_Constructors;

public class Computer {

    private int memory; // private - скрываем эти данные от других классов (ИНКАПСУЛЯЦИЯ)
    private int cpu;
    private String name;

    // ///////// КОНСТРУКТОРЫ класса (базовый метод при создании экземпляра)
    // оператор new будет вызывать вот этот метод и выполнять то, что в нем нах-ся
    public Computer() { // - ПУСТОЙ КОНСТРУКТОР (по умолчанию он есть)
        System.out.println("FIRST CONSTRUCTOR");
    }

    public Computer (int memory, int cpu, String name) { //Создаем еще один конструктор, чтобы можно было создавать экземпляр
                                                  // с указанием параметров
        System.out.println("SECOND CONSTRUCTOR");
        this.memory = memory;
        this.cpu = cpu;
        this.name = name;
    }

    public Computer (String name) {
        System.out.println("THIRD CONSTRUCTOR");
        this.name = name;
    }



    // ----------- Методы которые задают(присваивают) значения
    void setMemory(int memory) {
        this.memory = memory;
    }
    void setCpu(int cpu) {
        this.cpu = cpu;
    }
    void setName(String name) {
        this.name = name;
    }
    // ----------- Методы которые считывают(получают) значения
    void getCpu() {
        System.out.println(cpu);
    }
    void getMemory() {
        System.out.println(memory);
    }
    void getName() {
        System.out.println(name);
    }
}
