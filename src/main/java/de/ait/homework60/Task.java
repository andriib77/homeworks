package de.ait.homework60;

public class Task implements Runnable {
    private String message;

    public Task(String message) {
        this.message = message;
    }

    public Task() {

    }

    @Override
    public void run() {
        System.out.println(message);
    }

    /*@Override
    public void run() {
        System.out.println("Задача выполнена");
    }*/

    public static void main(String[] args) {
        // Задача 2: Запуск и Исполнение Потока
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();

        // Задача 3: Поток с Параметрами
        Task taskWithParameter = new Task("Привет, я задача с параметром!");
        Thread threadWithParameter = new Thread(taskWithParameter);
        threadWithParameter.start();

        // Задача 4: Создание Множества Потоков
        Task task1 = new Task("Задача 1");
        Task task2 = new Task("Задача 2");
        Task task3 = new Task("Задача 3");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}


