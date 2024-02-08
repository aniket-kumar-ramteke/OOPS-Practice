package learn_threading;

/*
* Implementing multithreading in Java:
* Since a thread is an entity within a process, it is meant to perform some task.
* The task is to be defined by creating a Java class that is referred as Thread
* Implementation Class.
*
* To implement this class, java.lang package provides 2 APIs:
*   Thread (Class)
*   Runnable (Interface)
*
* Hence either a class inherits Thread or implements Runnable
*
* Every thread implementation class must define a logic using a 'run()' method.
*
* Implementing Multithreading by extending Thread class.
*
* InterruptedException is a CHECKED exception
*
* */
public class SimpleThreadMain {

    public static void main(String[] args) {

        Thread t1 = new ThreadImpl();
        t1.start();//Thread.start() -> invokes Thread.run();
        //t1.run();

    }

}
