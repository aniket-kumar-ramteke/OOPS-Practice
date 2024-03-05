package learn_threading;

/*
* synchronized method
*   When a currently running thread invokes a method on an object and if the method
*   is declared as synchronized, then the thread acquires a lock on that object.
*
*   This ensures preventing access to that same object by other threads.
*   As soon as the control exits from the synchronized method, the lock gets released
*   automatically and it is available for other threads.
* */
public class GreetingMessageThread extends Thread {

    private Message messageObject;

    public GreetingMessageThread(Message messageObject) {
        this.messageObject = messageObject;
    }

    public void run() {

        synchronized (messageObject) {//synchronized context begins
            try {
                messageObject.printMessage();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }//synchronized context ends

    }
}
