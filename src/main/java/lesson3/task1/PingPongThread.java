package lesson3.task1;

public class PingPongThread extends Thread {
    ConsolePrinter consolePrinter;
    String string;

    public PingPongThread(ConsolePrinter consolePrinter, String string) {
       this.consolePrinter = consolePrinter;
       this.string = string;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            consolePrinter.printString(string);
        }
    }
}
