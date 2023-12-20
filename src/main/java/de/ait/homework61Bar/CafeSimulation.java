package de.ait.homework61Bar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CafeSimulation {
    private static final Logger LOGGER = LoggerFactory.getLogger(CafeSimulation.class);

    public static void main(String[] args) {
        // Создание и запуск потоков барменов, баристы и сомелье
        BartenderThread3 bartender1 = new BartenderThread3("Мохито");
        CoffeeMakerThread coffeeMaker = new CoffeeMakerThread();
        SommelierThread sommelier = new SommelierThread("Мерло");

        // Запуск потоков
        bartender1.start();
        coffeeMaker.start();
        sommelier.start();

        // Ожидание завершения всех потоков
        try {
            bartender1.join();
            coffeeMaker.join();
            sommelier.join();
        } catch (InterruptedException exception) {
            LOGGER.error("Ошибка при ожидании завершения потоков: " + exception.getMessage());
        }

        LOGGER.info("Все напитки готовы. Кафе закрывается.");
    }
}
