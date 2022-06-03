package Lambda.Example2_STEP_01;

public class Main {
    public static void main(String[] args) {

        Switcher sw1 = new Switcher();
        Lamp lamp1 = new Lamp();


        // event subscribe
        sw1.consumer = lamp1;

        sw1.switchON();
        sw1.switchON();









    }
}
