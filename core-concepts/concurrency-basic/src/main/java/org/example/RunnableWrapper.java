package org.example;

public class RunnableWrapper {

    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = () -> {
            System.out.println( "Running "+ Thread.currentThread().getName());
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();

        thread1.join();

        System.out.println("Completed!");
    }



}
