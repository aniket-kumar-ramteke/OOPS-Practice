package learn_threading;

public class Message {

    private String greetingMessage;

    public Message(String greetingMessage) {
        this.greetingMessage = greetingMessage;
    }

    //Using synchronized method:
    /*
     * public synchronized void printMessage() throws InterruptedException { ... }
     * */

    public  void printMessage() throws InterruptedException {
        //Prints the message using some decorator with some time gaps
        System.out.println("****************");
        Thread.sleep(1000);
        System.out.println(greetingMessage);
        Thread.sleep(1000);
        System.out.println("****************");
        Thread.sleep(1000);
    }
}
