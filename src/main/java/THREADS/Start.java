package THREADS;

public class Start {
    public static void main(String[] args) { // - основной поток
        MyThreads myThread1 = new MyThreads(); // - создали еще один поток
        myThread1.start();                    // - создаем поток (он берет код из метода run) и запускаем его в нов потоке
        System.out.println("Hello MAIN");

        MyThreads myThread2 = new MyThreads();   // 2-й поток
        myThread2.start();
        // выполняются одновременно (то один поток, то другой)

    }
}


class MyThreads extends Thread {   // - создадим дополнительный поток
    public void run() {          // в Thread есть метод run, переопределим его.
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from MyThread " + i);
        }
    }



}
