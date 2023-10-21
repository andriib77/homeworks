package de.ait.homework38;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueNamesApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashSet<String> uniqueNames = new HashSet<>();
        String stopKeyword = "stop";

        System.out.println("Введите имена (или введите '" + stopKeyword + "' для завершения):");

        while (true) {
            String inputName = scanner.nextLine();

            if (inputName.equalsIgnoreCase(stopKeyword)) {
                break;
            }

            uniqueNames.add(inputName); // Добавляем имя в HashSet
        }

        System.out.println("Уникальные имена:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }

        scanner.close();
    }
}
