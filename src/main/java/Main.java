import lesson3.task1.ConsolePrinter;
import lesson3.task1.PingPongThread;
import lesson3.task2.ThreadSafeCounter;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {

        ConsolePrinter consolePrinter = new ConsolePrinter();
        PingPongThread pingThread = new PingPongThread(consolePrinter, "Ping");
        PingPongThread pongThread = new PingPongThread(consolePrinter, "Pong");

        pingThread.start();
        pongThread.start();


        ThreadSafeCounter counter = new ThreadSafeCounter(0, 200, new ReentrantLock());

        for(int i = 0; i < 6; i++) {
            Thread thread = new Thread(counter);
            thread.start();
        }

    }

}

