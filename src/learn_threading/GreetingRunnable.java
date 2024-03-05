package learn_threading;

/*
* Java provides 2 predefined APIs for implementing multithreading:
*   Thread Class
*   Runnable Interface
*
* A Thread class already implements Runnable interface
* Runnable interface declares a single method: public void run(); and a Thread class
* defines that method because a Thread is a non-abstract class.
* */
public class GreetingRunnable implements Runnable {
    private String message;
    private int delayTime;//In ms


    public GreetingRunnable(String message, int delayTime) {
        super();
        this.message = message;
        this.delayTime = delayTime;
    }


    @Override
    public void run() {
        for(int a=1;a<=10;a++) {
            System.out.println(message);
            try {
                Thread.sleep(delayTime);//Sleeps for delayTime (ms)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
