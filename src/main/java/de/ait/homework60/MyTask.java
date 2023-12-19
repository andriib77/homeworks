package de.ait.homework60;

public class MyTask implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyTask myTask = new MyTask();

        Thread thread1 = new Thread(myTask, "Поток 1");
        Thread thread2 = new Thread(myTask, "Поток 2");

        thread1.start();
        thread2.start();
    }

}