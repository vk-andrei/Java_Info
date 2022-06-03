package Lambda.Example2_STEP_02;

public class Radio implements ElectricityConsumer{

    void radioON() {
        System.out.println("Radio is playing");
    }

    @Override
    public void electricityON() {
        radioON();
    }
}
