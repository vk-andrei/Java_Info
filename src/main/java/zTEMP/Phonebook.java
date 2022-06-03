package zTEMP;

import java.io.*;
import java.util.*;

//�� ���� ����������� ������������� ������ ����������� ����� ����������� ����������, ������� �� ��������
// ������������ ���������� ���������. ��� ������� �������� �������� ������� � ���� ����� ��������. �������
// ������ ��������� ����� ���� �����������, ������ ��������� - ���. ���������� ������ ����� ������ ������
// ������� ��������� �� ������� � ������ ������� �� ������ ��������. ������� ������������ ����� ������� ��������������.

//     1. �������� � ����� ����������� ���������� ������ ���������� ����������� � ����� � �������� ����������� �� �����.
//     2. �������� ����������� ���������� ����������� ������ ���������� � ����������.


//����� zTEMP.Phonebook ��������� ���� ������ ����������� ����������
//�� ��������� �� ������ ���������� HashMap<String, String>
//� �������� ����� ������������ ����� �������� � ���� ������, � � �������� �������� - �������
//����� �������� � ���� ����� main ������� ��������� ������ � ��
//����� �������� ������
//addPB - ��������� ������ �� �������� ������ �������� � �������
//delPB - ������� ������ �� ������ ��������
//savePB - ��������� �� � ��������� ����� phone.txt
//loadPB - ��������� �� �� ���������� ����� phone.txt
//PrintPhonebook - ������� �� ����� ��� ������ ��
//FindSurname - ���������� ����� ������� �� ������ ��������
//FindNumberPhone - ���������� ����� ������ ������� �� �������

public class Phonebook {
    private static HashMap<String, String> pb = new HashMap<String, String>();

    //addPB - ��������� ������ �� �������� ������ �������� � �������
    private static void addPB(String phone, String name) {
        pb.put(phone, name);
    }

    //delPB - ������� ������ �� ������ ��������
    private static void delPB(String phone) {
        pb.remove(phone);
    }

    //savePB - ��������� �� � ��������� ����� phone.txt
    private static void savePB() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("phone.txt")));
        for(Map.Entry<String,String> k: pb.entrySet()){
            writer.write(k.getKey() + " " + k.getValue()+System.lineSeparator());
        }
        writer.close();
    }

    //loadPB - ��������� �� �� ���������� ����� phone.txt
    //���������� �������� �� ������� �����
    public static void loadPB() throws IOException {
        File file = new File("phone.txt");
        if (file.exists()){
            BufferedReader reader = new BufferedReader(new FileReader(new File("phone.txt")));
            String act;
            while ((act=reader.readLine())!=null) {
                String[] dat = act.split(" ");
                pb.put(dat[0], dat[1]);
            }
            reader.close();
        }
    }

    //PrintPhonebook - ������� �� ����� ��� ������ ��
    public static void PrintPhonebook(){
        System.out.println("���������� ����������: ");
        for(Map.Entry<String,String> k: pb.entrySet()){
            System.out.println(k.getValue()+": "+ k.getKey());
        }
    }

    //FindSurname - ���������� ����� ������� �� ������ �������� �������� � �������� ���������
    //���������� ������
    public static String FindSurname(String number){
        String result = pb.get(number);
        if (result == null) return "������� � ����� ������� �� ������";
        return result;
    }

    //FindNumberPhone - ���������� ����� ������ ������� �� ������� ������� � �������� ���������
    //���������� ������ �����
    public static String[] FindNumberPhone(String surname){
        List <String> result = new ArrayList<String>();
        for (Map.Entry entry : pb.entrySet()) {
            if (surname.equalsIgnoreCase((String)entry.getValue())){
                result.add((String)entry.getKey());
            }
        }
        if (result.size() == 0) result.add("������� � ����� �������� �� ������");
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) throws IOException {
        //���������� ��������� ���������� ��������
        String act;

        //�������� ��
        loadPB();
        //����� ������� �� �����
        PrintPhonebook();

        //����� �� ����� �������� ��������� �������� � ��������� ������
        System.out.println("����� ��������: (add)�������� ������, (del)������� ������, (num) ����� ������ �� �������, (sur)����� �������, " +
                "(save)���������, (exit)�����");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        act = bf.readLine();
        while(!act.equals("exit")){
            //���������� ������
            if(act.equals("add")){
                System.out.println("������� �������:");
                String name = bf.readLine();
                System.out.println("������� �������:");
                String phone = bf.readLine();
                addPB(phone, name);
            }else{
                //�������� ������
                if(act.equals("del")){
                    System.out.println("������� �������:");
                    String phone = bf.readLine();
                    delPB(phone);
                }else{
                    //����� ������� �� �������
                    if (act.equals("num")){
                        System.out.println("������� �������:");
                        String surname = bf.readLine();
                        String[] numbers = FindNumberPhone(surname);
                        for (String number : numbers) {
                            System.out.println(number);
                        }
                    } else {
                        //����� ������� �� ������
                        if (act.equals("sur")) {
                            System.out.println("������� �����:");
                            String number = bf.readLine();
                            System.out.println(FindSurname(number));
                        } else {
                            //���������� �� � ����
                            if(act.equals("save")){
                                savePB();
                            }
                        }
                    }
                }
            }
            //������ �� ��������� ��������
            System.out.println("����� ��������: (add)�������� ������, (del)������� ������, (num) ����� ������ �� �������, (sur)����� �������, (save)���������, (exit)�����");
            act=bf.readLine();
        }
    }
}