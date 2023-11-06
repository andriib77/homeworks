package de.ait.homework45;

import de.ait.homework44.LibraryCatalog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class SafeArrayElementExtraction {
    private static final Logger LOGGER = LoggerFactory.getLogger(SafeArrayElementExtraction.class);
    public static void main(String[] args) {
        String[] array = {"Apple", "Banana", "Cherry", "Date", "Fig"};
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("Введите индекс элемента для извлечения (или 'exit' для выхода): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы.");
                break;
            }

            try {
                int index = Integer.parseInt(input);

                if (index < 0 || index >= array.length) {
                    throw new ArrayIndexOutOfBoundsException();
                }

                String extractedElement = extractElement(array, index);
                System.out.println("Извлеченный элемент: " + extractedElement);
            } catch (NumberFormatException exception) {
                System.out.println("Ошибка: Введено не число.");
                LOGGER.error(exception.getLocalizedMessage());
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Ошибка: Индекс за пределами границ массива.");
                LOGGER.error(exception.getLocalizedMessage());
            } finally {
                System.out.println("Операция поиска завершена.");
            }
        }

        scanner.close();
    }

    public static String extractElement(String[] array, int index) {
        return array[index];
    }

}

