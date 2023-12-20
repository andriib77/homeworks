package de.ait.homework61Bar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SommelierThread extends Thread{
    private static final Logger LOGGER = LoggerFactory.getLogger(SommelierThread.class);
    private String wineName;

    public SommelierThread(String wineName) {
        this.wineName = wineName;
    }

    @Override
    public void run() {
        LOGGER.info("Выбираю вино");

        try {
            // Имитация процесса выбора вина
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            LOGGER.error("Ошибка при выборе вина: " + e.getMessage());
        }

        LOGGER.info("Вино выбрано: " + wineName);
    }

    public static void main(String[] args) {
        // Создание и запуск потока сомелье
        SommelierThread sommelierThread = new SommelierThread("Шардоне");
        sommelierThread.start();
    }
}
