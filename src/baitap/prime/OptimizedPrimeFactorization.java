package baitap.prime;

public class OptimizedPrimeFactorization implements Runnable{
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    @Override
    public void run() {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là");
        Long startTime = System.currentTimeMillis();
        try {

            for (int i = 0; i < 100; i++) {
                if (isPrime(i)) {
                    System.out.println(i + " Tối ưu");
                    Thread.sleep(1);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime + "s");
    }
}
