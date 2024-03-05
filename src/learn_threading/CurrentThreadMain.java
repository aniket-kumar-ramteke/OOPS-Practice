package learn_threading;

public class CurrentThreadMain {

    public static void main(String[] args) {
        //If thread1 runs, print message: HI with delay: 1000 ms
        //If thread2 runs, print message: BYE with delay: 500 ms

        System.out.println("Main thread begins....");
        //Obtaining a handle to the main thread.
        //Thread mainThread = Thread.currentThread();
        //mainThread.stop();//Stops the main thread therefore next lines will not execute

        Thread t1 = new MessageThread("thread1");
        Thread t2 = new MessageThread("thread2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join(); // tells parent thread to wait until child thread dies.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thank you very much.");
    }

}