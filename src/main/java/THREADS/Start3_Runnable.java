package THREADS;
// СПОСОБ С ИНТЕРФЕЙСОМ ПОЛУЧШЕ
public class Start3_Runnable {
    public static void main(String[] args) {

        Thread myThread = new Thread(new Runner());
        myThread.start();

        System.out.println("I'm here!!! Main");
    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello from myThread: " + i);
            try {
                Thread.sleep(1000);             // поток спит 1 сек
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}