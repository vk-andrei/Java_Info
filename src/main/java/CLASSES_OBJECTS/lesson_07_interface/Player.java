package CLASSES_OBJECTS.lesson_07_interface;

public interface Player {// ИДЕЯ ИНТЕРФЕЙСА - мы связываем интерфейс с каким то классом с пом слова IMPLEMENTS

    void play();   // каждый Player обязан запускать игру
    // НО! реализация этого метода может быть разной (и как правило и бывает)
    // мы подписываем КОНТРАКТ между классом и интерфейсом, кот обязывает классы иметь определ методы

}
