package CLASSES_OBJECTS.lesson_05_nested_classes;

public class Start {
    public static void main(String[] args) {

        Human elena = new Human();

        System.out.println(elena.head.voice);
        System.out.println(elena.body.form);

        elena.say();


    }

}
