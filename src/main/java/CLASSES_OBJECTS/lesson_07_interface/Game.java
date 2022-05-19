package CLASSES_OBJECTS.lesson_07_interface;

public class Game {
    // Boy boy = new Boy();         но их может быть ОЧЕНЬ МНОГО
    // Girl girl = new Girl();

    // ------- Гораздо проще создать на основе интерфейса Player просто плеера и лн может быть как мальчиком так и девочкой

    public Player player;

    void start (Player player) {        // Player должен запускать игру
        player.play();
    }
}
