package de.ait.homework55.EnumMapSet;

public enum FashionCategory {
    /*Описание задачи:

    Определение Перечислений (Enums):
    Создайте перечисление FashionCategory, представляющее различные категории моды, например, ОДЕЖДА, ОБУВЬ, АКСЕССУАРЫ.
    Создайте перечисление Season, представляющее времена года, например, ВЕСНА, ЛЕТО, ОСЕНЬ, ЗИМА.

    Разработка Модели Данных:
    Создайте класс FashionItem, включающий атрибуты, такие как название, цена, категория (FashionCategory) и сезонность (Season).

    Использование EnumMap и EnumSet:
    Создайте EnumMap<FashionCategory, Set<FashionItem>>, чтобы хранить модные товары, сгруппированные по категориям.
    Для каждой категории используйте EnumSet<Season>, чтобы отслеживать сезоны, в которые товары особенно популярны.

    Реализация Функций:
    Реализуйте функции для добавления модных товаров.
    Реализуйте функцию для вывода всех товаров определенного сезона.

    Тестирование:
    Создайте тестовые примеры для проверки функциональности вашего каталога моды.*/
    CLOTHING, SHOES, ACCESSORIES;
}
