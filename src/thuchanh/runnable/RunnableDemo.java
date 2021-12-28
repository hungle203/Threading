package thuchanh.runnable;

public class RunnableDemo {
    private Thread t;
    private final  String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + "interrupted.");
        }
        System.out.println("Thread " + threadName + "exiting");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread((Runnable) this, threadName);
            t.start();
        }
    }


    public static void main(String[] args) {
        System.out.println("Main thread running...");
        RunnableDemo runnableDemo = new RunnableDemo("Thread-1HR-Database");
        runnableDemo.run();

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-2-Send-Email");
        runnableDemo1.run();

        System.out.println("Main thread stopped!!! ");
    }


}
