package de.ait.homework47;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class CurrencyConverter {
    private static final Logger LOGGER = LoggerFactory.getLogger(CurrencyConverter.class);

    private static final double USD_TO_EUR_RATE = 0.85;
    private static final double EUR_TO_USD_RATE = 1.2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                double amount = getValidatedAmount(scanner);
                String sourceCurrencyCode = getValidatedCurrencyCode(scanner, "Введите исходную валюту (USD, EUR): ");
                String targetCurrencyCode = getValidatedCurrencyCode(scanner, "Введите целевую валюту (USD, EUR): ");

                double result = convertCurrency(amount, sourceCurrencyCode, targetCurrencyCode);
                System.out.println("Результат конвертации: " + result + " " + targetCurrencyCode);
                break; // Выход из цикла, так как операция завершена успешно.
            } catch (NumberFormatException exception) {
                LOGGER.error("ERROR: The entered value is not a numeric value.");
            } catch (IllegalArgumentException exception) {
                System.out.println("Ошибка: " + exception.getMessage());
            }
        }

        System.out.println("Операция конвертации завершена.");
        LOGGER.info("Convertation is completed");

        // Закрытие Scanner в блоке finally
        try {
            scanner.close();
        } catch (Exception ignored) {
            LOGGER.error("Error closing scanner", ignored);
        }
    }

    private static double getValidatedAmount(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Введите сумму для конвертации: ");
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException exception) {
                LOGGER.error("ERROR: The entered value is not a numeric value.");
            }
        }
    }

    private static String getValidatedCurrencyCode(Scanner scanner, String message) {
        while (true) {
            try {
                System.out.println(message);
                String currencyCode = scanner.nextLine().toUpperCase();
                validateCurrency(currencyCode);
                return currencyCode;
            } catch (IllegalArgumentException exception) {
                LOGGER.error("Error validating currency code: " + exception.getMessage());
                System.out.println("Ошибка: " + exception.getMessage());
            }
        }
    }

    private static void validateCurrency(String currency) {
        if (!currency.equals("USD") && !currency.equals("EUR")) {
            throw new IllegalArgumentException("Введен неправильный код валюты.");
        }
    }

    private static double convertCurrency(double amount, String sourceCurrencyCode, String targetCurrencyCode) {
        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", USD_TO_EUR_RATE);
        exchangeRates.put("EUR", EUR_TO_USD_RATE);

        if (!exchangeRates.containsKey(sourceCurrencyCode) || !exchangeRates.containsKey(targetCurrencyCode)) {
            LOGGER.error("Non-existent currency code.");
            throw new IllegalArgumentException("Несуществующий код валюты.");
        }

        double sourceToUsdRate = exchangeRates.get(sourceCurrencyCode);
        double usdToTargetRate = exchangeRates.get(targetCurrencyCode);

        return amount * (1 / sourceToUsdRate) * usdToTargetRate;
    }
}