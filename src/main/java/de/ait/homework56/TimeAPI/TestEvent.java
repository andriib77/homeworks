package de.ait.homework56.TimeAPI;

import java.time.LocalDateTime;

public class TestEvent {
    public static void main(String[] args) {
        // Тестирование функционала
        EventScheduler scheduler = new EventScheduler();

        // Создание событий
        Event event1 = new Event("Meeting 1", LocalDateTime.of(2023, 12, 2, 10, 0),
                LocalDateTime.of(2023, 12, 2, 12, 0));
        Event event2 = new Event("Meeting 2", LocalDateTime.of(2023, 12, 2, 13, 0),
                LocalDateTime.of(2023, 12, 2, 15, 0));
        Event event3 = new Event("Conference", LocalDateTime.of(2023, 12, 3, 9, 0),
                LocalDateTime.of(2023, 12, 3, 17, 0));

        // Добавление событий в планировщик
        scheduler.addEvent(event1);
        scheduler.addEvent(event2);
        scheduler.addEvent(event3);

        // Вывод всех событий
        System.out.println("All Events:");
        for (Event event : scheduler.getAllEvents()) {
            System.out.println(event.getName() + " - " + event.getStartDateTime() + " to " + event.getEndDateTime());
        }

        // Вывод событий на конкретную дату
        LocalDateTime testDate = LocalDateTime.of(2023, 12, 2, 0, 0);
        System.out.println("\nEvents on " + testDate.toLocalDate() + ":");
        for (Event event : scheduler.getEventOnDate(testDate)) {
            System.out.println(event.getName() + " - " + event.getStartDateTime() + " to " + event.getEndDateTime());
        }

        // Проверка пересечения времен двух событий
        Event event4 = new Event("Meeting 3", LocalDateTime.of(2023, 12, 2, 11, 0),
                LocalDateTime.of(2023, 12, 2, 14, 0));

        System.out.println("\nAre events overlapping? " + scheduler.areEventsOverlapping(event1, event4));
    }
}

