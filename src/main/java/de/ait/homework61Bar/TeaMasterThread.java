package de.ait.homework61Bar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TeaMasterThread extends Thread{
    private static final Logger LOGGER = LoggerFactory.getLogger(TeaMasterThread.class);
    private String teaType;

    public TeaMasterThread(String teaType) {
        this.teaType = teaType;
    }

    @Override
    public void run() {
        LOGGER.info("Завариваю чай: " + teaType);

        try {
            // Имитация процесса заваривания чая
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            LOGGER.error("Ошибка при заваривании чая: " + e.getMessage());
        }

        LOGGER.info("Чай готов");
    }

    public static void main(String[] args) {
        // Создание и запуск потока TeaMaster
        TeaMasterThread teaMasterThread = new TeaMasterThread("Черный чай");
        teaMasterThread.start();
    }
}
