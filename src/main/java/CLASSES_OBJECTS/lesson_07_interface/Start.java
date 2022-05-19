package CLASSES_OBJECTS.lesson_07_interface;

public class Start {
    public static void main(String[] args) {

        Boy ivan = new Boy();
        Girl elena = new Girl();

        // ivan.play();

        // Мы можем создать переменную на основе интерфейса
        Player unit = ivan;  // или elena. Теперь через unit мы можем обращаться к методам только интерфейса Player



    }
}
