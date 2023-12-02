package de.ait.homework55.EnumMapSet;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class FashionCatalog {
    private EnumMap<FashionCategory, Set<FashionItem>> catalog;

    // Конструктор
    public FashionCatalog() {
        catalog = new EnumMap<>(FashionCategory.class);

        // Инициализация EnumSet для каждой категории моды
        for (FashionCategory category : FashionCategory.values()) {
            catalog.put(category, new HashSet<>()); /*EnumSet.noneOf(FashionItem.class));*/
        }
    }

    // Функция для добавления модного товара
    public void addFashionItem(FashionItem item) {
        FashionCategory category = item.getCategory();
        catalog.get(category).add(item);
    }

    // Функция для вывода всех товаров определенного сезона
    public void displayItemsForSeason(Season season) {
        System.out.println("Fashion Items for Season " + season + ":");
        for (FashionCategory category : catalog.keySet()) {
            Set<FashionItem> items = catalog.get(category);
            for (FashionItem item : items) {
                if (item.getSeason().equals(season)) {
                    System.out.println("Category: " + category + ", Name: " + item.getName() + ", Price: " + item.getPrice());
                }
            }
        }
    }
}
