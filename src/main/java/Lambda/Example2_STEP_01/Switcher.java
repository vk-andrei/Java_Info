package Lambda.Example2_STEP_01;

public class Switcher {

    public ElectricityConsumer consumer;

    void switchON() {
        System.out.println("Switcher is ON");
        if (consumer != null) {
            consumer.electricityON();
        }

    }


}
