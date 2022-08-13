package lesson3.task2;


import java.util.concurrent.locks.Lock;

public class ThreadSafeCounter implements Runnable {
    private int count;
    private Lock locker;
    private int countLimit;

    public ThreadSafeCounter(int count, int countLimit, Lock locker) {
        this.count = count;
        this.locker = locker;
        this.countLimit = countLimit;
    }

    @Override
    public void run() {
        locker.lock();
        try {
          while (count != countLimit + 1) {
              System.out.println(count++);
          }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
          locker.unlock();
        }
    }

}
