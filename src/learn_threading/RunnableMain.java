package learn_threading;
/*
 * While implementing Multithreading using Runnable interface, it is necessary to send
 * Runnable as a TARGET for the Thread class object in order to invoke run() method
 * from the respective Runnable implementation class.
 *
 * This is possible by using an overloaded, parameterized constructor of Thread class.
 * Thread(Runnable [TARGET])
 * */
public class RunnableMain {

    public static void main(String[] args) {

        Runnable r1 = new GreetingRunnable("Hello", 1000);
        Runnable r2 = new GreetingRunnable("Welcome", 500);
        Thread helloThread = new Thread(r1);
        Thread welcomeThread = new Thread(r2);//Sending Runnable as Targets

        helloThread.start();
        welcomeThread.start();
    }

}
