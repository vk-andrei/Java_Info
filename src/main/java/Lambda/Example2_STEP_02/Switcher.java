package Lambda.Example2_STEP_02;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    //public ElectricityConsumer consumer;
    //—делаем поле приватным и сделаем его ArrayList, чтобы мож было заносить много подписчиков на событие
    private List<ElectricityConsumer> consumers = new ArrayList<>();

    // добавим метод добавлени€ и удалени€ подписчика
    public void addConsumer (ElectricityConsumer consumer) {
        consumers.add(consumer);
    }
    private  void removeConsumer (ElectricityConsumer consumer) {
        consumers.remove(consumer);
    }

    // теперь ¬ыключатель хранит в себе множество ссылок на потребителей
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
