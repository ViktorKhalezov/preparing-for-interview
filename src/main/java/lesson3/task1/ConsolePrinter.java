package lesson3.task1;

public class ConsolePrinter {


    public synchronized void printString(String string) {
        System.out.println(string);
        notify();
        try {
            wait(100);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

}
