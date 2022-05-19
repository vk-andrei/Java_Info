package THREADS;

public class Start2 {
    public static void main(String[] args) throws InterruptedException {

        MyThreadss myThread1 = new MyThreadss();
        myThread1.start();

        Thread.sleep(1000);                      // поток спит 1 сек

        MyThreadss myThread2 = new MyThreadss();
        myThread2.start();
    }
}

class MyThreadss extends Thread {
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