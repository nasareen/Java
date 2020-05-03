package org.example;

public class DeadLockTester {
    public static void main(String[] args) throws InterruptedException {
        DeadLock deadLock = new DeadLock();

      Runnable r1 = () -> deadLock.a();
      Runnable r2 = () -> deadLock.b();

      Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Completed!");

    }
}
