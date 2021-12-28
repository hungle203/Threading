package baitap.prime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();

        Thread thread = new Thread(lazyPrimeFactorization);
        Thread thread1 = new Thread(optimizedPrimeFactorization);

        thread.start();
        thread.join();
        thread1.start();
    }

}
