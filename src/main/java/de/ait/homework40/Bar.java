package de.ait.homework40;

import java.util.HashMap;
import java.util.Map;

public class Bar {
    Map<String, Drink> drinks = new HashMap<>();

    void addDrink(String id, Drink drink){
        drinks.put(id, drink);
    } //добавляет напиток в коллекцию.

    public Drink getDrink(String id) {
        return drinks.get(id);
    }//возвращает напиток по ID.



}
