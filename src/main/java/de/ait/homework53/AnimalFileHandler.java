package de.ait.homework53;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnimalFileHandler {
    public static void writeToFile(List<Animal> animals, String filePath) {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            for (Animal animal : animals) {
                String line = String.format("Имя: %s, Вид: %s, Возраст: %d%n",
                        animal.getName(), animal.getSpecies(), animal.getAge());
                fileWriter.write(line);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Создаем несколько объектов Animal
        Animal lion = new Animal("Simba", "Lion", 5);
        Animal elephant = new Animal("Dumbo", "Elephant", 10);
        Animal penguin = new Animal("Skipper", "Penguin", 3);

        // Добавляем их в список
        List<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(elephant);
        animals.add(penguin);

        // Вызываем метод записи в файл
        writeToFile(animals, "animals.txt");

        // Вызываем метод чтения из файла
        System.out.println("Содержимое файла:");
        readFromFile("animals.txt");
    }
}
