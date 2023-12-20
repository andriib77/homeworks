package de.ait.homework61Bar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BartenderThread3 extends Thread{
    private static final Logger LOGGER = LoggerFactory.getLogger(BartenderThread3.class);
    private String drinkName;

    public BartenderThread3(String drinkName) {
        this.drinkName = drinkName;
    }

    @Override
    public void run() {
        LOGGER.info("Готовлю " + drinkName);

        try {
            // Имитация процесса приготовления напитка
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            LOGGER.error("Ошибка при приготовлении " + drinkName + ": " + e.getMessage());
        }

        LOGGER.info(drinkName + " готов");
    }

    public static void main(String[] args) {
        // Создание и запуск трех потоков барменов
        BartenderThread3 teaBartender = new BartenderThread3("чай");
        BartenderThread3 coffeeBartender = new BartenderThread3("кофе");
        BartenderThread3 cocktailBartender = new BartenderThread3("коктейль");

        teaBartender.start();
        coffeeBartender.start();
        cocktailBartender.start();
    }
}
