package CLASSES_OBJECTS.lesson_07_interface;

public class School {

    // Boy boy = new Boy();         но их может быть ОЧЕНЬ МНОГО
    // Girl girl = new Girl();

    // ------- Гораздо проще создать на основе интерфейса Player просто плеера и лн может быть как мальчиком так и девочкой

    public Study student;

    void start (Study student) {
        student.read();
    }
}
