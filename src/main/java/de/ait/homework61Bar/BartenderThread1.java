package de.ait.homework61Bar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BartenderThread1 extends Thread {
    private static final Logger LOGGER = LoggerFactory.getLogger(BartenderThread1.class);
    @Override
    public void run() {
        LOGGER.info("Готовлю напиток");

        try {
            // Задержка в 3 секунды
            Thread.sleep(3000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        LOGGER.info("Напиток готов");
    }

    public static void main(String[] args) {
        // Создание и запуск потока бармена
        BartenderThread1 bartenderThread = new BartenderThread1();
        bartenderThread.start();
    }

}
