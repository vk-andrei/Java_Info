package CLASSES_OBJECTS.lesson_06_abstract_classes.lesson_06_01;

public abstract class Human { // мы не можем создать экземпляр этого класса.
    // этот класс нужен для того, чтобы от него кто-то наследовался

    public abstract void func();    // мы только НАЗЫВАЕМ метод, но не описываем его. АБСТР методы - без реализации

    void say () {
        System.out.println("!!!!!!!!!!!!!");  // в абстрактном классе могут быть и ОБЫЧНЫЕ меотды
    }
}
