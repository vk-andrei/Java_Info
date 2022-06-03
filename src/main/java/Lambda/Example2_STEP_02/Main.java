package Lambda.Example2_STEP_02;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Switcher sw1 = new Switcher();
        Lamp lamp1 = new Lamp();
        Radio radio1 = new Radio();
        Lamp lamp2 = new Lamp();


        /****** event subscribe *****/
        //sw1.consumer = lamp1;
        sw1.addConsumer(lamp1);
        sw1.addConsumer(lamp2);
        sw1.addConsumer(radio1);

        sw1.switchON();

        /****************************************/
        // Все хорошо, пока есть отдельные классы Радио и Лампочка... Но, что если мне по наступлению этого события
        // (switchON) нужно вывести например "Пожар!".
        // Нужно создавать нов класс:
        // придумать ему Имя,
        // этот класс должен реализовывать интерфейс ElectricityConsumer
        // Потом нужно создать объект этого класса.
        // Вот так:

        /*class Fire implements ElectricityConsumer {
            @Override
            public void electricityON() {
                out.println("FIRE!!!!!!!!!!!!!");
            }
        }
        sw1.addConsumer(new Fire());   */
//--------------------------------------------------------------------------------------
        // класс Fire больше НИГДЕ не нужен! Лучше создать Анонимный класс:

        /*sw1.addConsumer(new ElectricityConsumer() {
            @Override
            public void electricityON() {
                out.println("FIRE!!!!!!!!!!!!");
            }
        });*/
//---------------------------------------------------------------------------------------
        // А лучше ЛЯМБДА-выражение:

        sw1.addConsumer( () -> out.println("FIRE!!!!!!!!!!!!!!") );

        sw1.switchON();

    }
}
