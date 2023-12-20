package de.ait.homework61Bar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoffeeMakerThread extends Thread{
    private static final Logger LOGGER = LoggerFactory.getLogger(CoffeeMakerThread.class);
    @Override
    public void run() {
        LOGGER.info("Кофе мелется");

        try {
            // Задержка в 2 секунды
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        LOGGER.info("Кофе заваривается");

        try {
            // Задержка в 5 секунд
            Thread.sleep(5000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        LOGGER.info("Кофе готов");
    }

    public static void main(String[] args) {
        // Создание и запуск потока приготовления кофе
        CoffeeMakerThread coffeeMakerThread = new CoffeeMakerThread();
        coffeeMakerThread.start();
    }
}
