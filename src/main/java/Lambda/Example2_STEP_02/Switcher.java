package Lambda.Example2_STEP_02;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    //public ElectricityConsumer consumer;
    //������� ���� ��������� � ������� ��� ArrayList, ����� ��� ���� �������� ����� ����������� �� �������
    private List<ElectricityConsumer> consumers = new ArrayList<>();

    // ������� ����� ���������� � �������� ����������
    public void addConsumer (ElectricityConsumer consumer) {
        consumers.add(consumer);
    }
    private  void removeConsumer (ElectricityConsumer consumer) {
        consumers.remove(consumer);
    }

    // ������ ����������� ������ � ���� ��������� ������ �� ������������
    public void switchON() {
        System.out.println("Switcher is ON");
//        if (consumer != null) {
//            consumer.electricityON();
//        }
        for (ElectricityConsumer c : consumers) {
            c.electricityON();
        }


    }


}
