package baitap.load;


public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread thread = new Thread(numberGenerator);
        thread.start();
        System.out.println(Thread.currentThread());
    }
}
