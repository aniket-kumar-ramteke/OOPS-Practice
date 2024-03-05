package learn_threading;

public class MessageThread extends Thread {

    public MessageThread(String threadName) {
        super(threadName);//Sets the name for the thread
    }

    public void run() {

        //Identify the currently running thread and proceed accordingly
        for(int a=1;a<=10;a++) {

            Thread threadInProcess = Thread.currentThread();
            String threadName = threadInProcess.getName();

            if(threadName.equals("thread1")) {
                System.out.println("HI");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("BYE");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
