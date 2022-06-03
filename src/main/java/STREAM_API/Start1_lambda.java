package STREAM_API;

public class Start1_lambda {
    public static void main(String[] args) {

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//            }
//        }).start();
        // THE SAME WITH LAMBDA
        new Thread(() -> {
        }).start();

        Runnable r1 = () -> {
            System.out.println(1);
        };
        Runnable r2 = () -> {
            System.out.println(2);
        };
        // r1.run();
        new Thread(r1).start();
        new Thread(r2).start();


    }
}
