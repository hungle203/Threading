package baitap.maxmin;

public class EvenThread implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("EvenThread is " + i);
                    Thread.sleep(15);
                }
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
