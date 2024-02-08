package learn_threading;

public class ThreadImpl extends Thread {

    @Override
    public void run() {
        System.out.println("Test thread works.");
    }
}
