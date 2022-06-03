package Lambda.Example2_STEP_02;

public class Lamp implements ElectricityConsumer {

    void lampON() {
        System.out.println("Lamp is ON");
    }

    @Override
    public void electricityON() {
        lampON();
    }
}
