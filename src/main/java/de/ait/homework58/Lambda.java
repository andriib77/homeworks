package de.ait.homework58;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {
        // Создаем список строк
        List<String> stringList = Arrays.asList("Apple", "Banana", "Orange", "Apricot", "Avocado", "Grapes");

        // Используем Stream API и метод filter для фильтрации строк, начинающихся на "А"
        List<String> filteredList = stringList.stream()
                .filter(word -> word.startsWith("A"))
                .collect(Collectors.toList());

        // Выводим отфильтрованный список на экран
        System.out.println("Строки, начинающиеся на 'A': " + filteredList);

        System.out.println("--------------------");

        // Создаем список целых чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Используем Stream API и метод map для преобразования каждого числа в его квадрат
        List<Integer> squaredNumbers = numbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());

        // Выводим результат на экран
        System.out.println("Оригинальный список: " + numbers);
        System.out.println("Список квадратов: " + squaredNumbers);

        System.out.println("--------------------");

        // Создаем список целых чисел
        List<Integer> numbersWhole = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numbersWhole);

        // Используем Stream API и лямбда-выражение для фильтрации и вывода четных чисел
        numbersWhole.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
        System.out.println("--------------------");
        // Создаем список целых чисел
        List<Integer> numbersEveryElement = Arrays.asList(1, 2, 3, 4, 5);

        // Используем метод forEach с лямбда-выражением для вывода каждого элемента списка
        numbersEveryElement.forEach(x -> System.out.println(x));
        System.out.println("--------------------");

        // Создаем список строк
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");

        // Используем поток и лямбда-выражение для преобразования всех строк в верхний регистр
        List<String> uppercaseStrings = strings.stream()
                .map(String::toUpperCase) // Используем метод map для преобразования каждой строки
                .collect(Collectors.toList()); // Собираем результаты в новый список

        // Выводим результат на экран
        System.out.println("Исходный список: " + strings);
        System.out.println("Преобразованный список в верхний регистр: " + uppercaseStrings);
    }
}



