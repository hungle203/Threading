package baitap.prime;

public class LazyPrimeFactorization implements Runnable {
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if ( n% i == 0) {
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
                    System.out.println(i + "Chưa tối ưu");
                    Thread.sleep(1);
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Thời gian chạy" + (endTime - startTime) + "s");

    }
}
