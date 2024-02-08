package learn_threading;

public class ThreadMain {

    public static void main(String[] args) {

        Thread helloThread = new GreetingThread("Hello", 1000);
        Thread welcomeThread = new GreetingThread("Welcome", 500);
        helloThread.start();
        welcomeThread.start();
        //helloThread.run();
        //welcomeThread.run();

    }

}