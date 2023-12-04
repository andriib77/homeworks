package de.ait.homework56.TimeAPI;

import java.time.LocalDateTime;

public class Event {
    /*Цель: Разработать консольное приложение на Java для управления событиями, используя Java Time API для работы с датами и временем.

Описание задания:

    Класс события:
        Создайте класс Event, который содержит следующие поля:
            String name - название события.
            LocalDateTime startDateTime - дата и время начала события.
            LocalDateTime endDateTime - дата и время окончания события.
        Реализуйте конструкторы, геттеры и сеттеры для этих полей.

    Планировщик событий:
        Разработайте класс EventScheduler, который управляет списком событий.
        Добавьте методы для добавления, удаления событий и получения списка всех запланированных событий.

    Управление временем событий:
        В EventScheduler реализуйте метод, который возвращает список событий, запланированных на конкретную дату.
        Разработайте метод, проверяющий, пересекаются ли времена двух разных событий.

    Тестирование функционала:
        Протестируйте ваше приложение, создавая различные события и проверяя работу всех функций.
*/
    private String name;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;

    public Event(String name, LocalDateTime startDateTime, LocalDateTime endDateTime) {
        this.name = name;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }
}
