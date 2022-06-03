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
        // ��� ������, ���� ���� ��������� ������ ����� � ��������... ��, ��� ���� ��� �� ����������� ����� �������
        // (switchON) ����� ������� �������� "�����!".
        // ����� ��������� ��� �����:
        // ��������� ��� ���,
        // ���� ����� ������ ������������� ��������� ElectricityConsumer
        // ����� ����� ������� ������ ����� ������.
        // ��� ���:

        /*class Fire implements ElectricityConsumer {
            @Override
            public void electricityON() {
                out.println("FIRE!!!!!!!!!!!!!");
            }
        }
        sw1.addConsumer(new Fire());   */
//--------------------------------------------------------------------------------------
        // ����� Fire ������ ����� �� �����! ����� ������� ��������� �����:

        /*sw1.addConsumer(new ElectricityConsumer() {
            @Override
            public void electricityON() {
                out.println("FIRE!!!!!!!!!!!!");
            }
        });*/
//---------------------------------------------------------------------------------------
        // � ����� ������-���������:

        sw1.addConsumer( () -> out.println("FIRE!!!!!!!!!!!!!!") );

        sw1.switchON();

    }
}
