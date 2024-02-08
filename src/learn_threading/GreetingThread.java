package learn_threading;

public class GreetingThread extends Thread {
    private String message;
    private int delayTime;//In ms

    public GreetingThread(String message, int delayTime) {
        super();
        this.message = message;
        this.delayTime = delayTime;
    }

    @Override
     public void run() {
        for(int a=1;a<=10;a++) {
            System.out.println(message);
            try {
                //Thread.sleep() throws InterupptedException so that's why we need to handle it with try-catch block
                Thread.sleep(delayTime);//Sleeps for delayTime (ms)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
