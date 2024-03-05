package learn_threading;

public class SynchronizationMain {

    public static void main(String[] args) {
        Message currentMessage = new Message("Happy weekend!!");
        Thread t1 = new GreetingMessageThread(currentMessage);
        Thread t2 = new GreetingMessageThread(currentMessage);
        t1.start();
        t2.start();
    }

}
