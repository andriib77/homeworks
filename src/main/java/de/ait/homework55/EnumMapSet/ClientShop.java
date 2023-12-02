package de.ait.homework55.EnumMapSet;

import java.util.EnumSet;
import java.util.Set;

public class ClientShop {
    public static void main(String[] args) {
        // Создание каталога моды
        FashionCatalog fashionCatalog = new FashionCatalog();

        // Добавление модных товаров
        //Set<Season> springAndSummer = EnumSet.of(Season.SPRING, Season.SUMMER);
        //Set<Season> allSeasons = EnumSet.allOf(Season.class);

        FashionItem item1 = new FashionItem("T-Shirt", 25.99, FashionCategory.CLOTHING,Season.AUTUMN);
        FashionItem item2 = new FashionItem("Sneakers", 59.99, FashionCategory.SHOES, Season.WINTER);
        FashionItem item3 = new FashionItem("Sunglasses", 19.99, FashionCategory.ACCESSORIES, Season.SUMMER);

        fashionCatalog.addFashionItem(item1);
        fashionCatalog.addFashionItem(item2);
        fashionCatalog.addFashionItem(item3);

        // Вывод модных товаров для определенного сезона
        fashionCatalog.displayItemsForSeason(Season.SUMMER);
        fashionCatalog.displayItemsForSeason(Season.WINTER);
        fashionCatalog.displayItemsForSeason(Season.AUTUMN);

    }

}


