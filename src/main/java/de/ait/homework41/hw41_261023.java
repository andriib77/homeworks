package de.ait.homework41;

import de.ait.homework42.Sportman;
import lombok.Lombok;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class hw41_261023 {
    private static Logger LOGGER = LoggerFactory.getLogger(hw41_261023.class);
    public static void main(String[] args) {

        ArrayList<String> countriesList = new ArrayList<>();
        countriesList.add("США");
        countriesList.add("Великобритания");
        countriesList.add("Франция");
        countriesList.add("Чехия");
        countriesList.add("Германия");
        countriesList.add("Франция");

        System.out.println("Размер листа: " + countriesList.size());
        System.out.println(countriesList);

        countriesList.remove("Франция");
        System.out.println(countriesList);
        System.out.println("------------");

        HashSet<String> countriesSet = new HashSet<>();
        countriesSet.add("США");
        countriesSet.add("Великобритания");
        countriesSet.add("Франция");
        countriesSet.add("Чехия");
        countriesSet.add("Германия");
        countriesSet.add("Франция");

        System.out.println("Размер листа HashSet: " + countriesSet.size());
        System.out.println(countriesSet);
        System.out.println("--------------");

        HashMap<String, String> capitalMap = new HashMap<>();
        capitalMap.put("Чехия", "Прага");
        capitalMap.put("США", "Вашингтон");
        capitalMap.put("Великобритания ", "Лондон");
        capitalMap.put("Франция", "Париж");
        capitalMap.put("Германия", "Берлин");


        Iterator<Map.Entry<String, String>> iteratorMap = capitalMap.entrySet().iterator();
        while (iteratorMap.hasNext()) {
            System.out.println(iteratorMap.next());
        }
        System.out.println("------------");
        capitalMap.put("США", "Сан-Франциско");
        Iterator<Map.Entry<String, String>> iteratorMap2 = capitalMap.entrySet().iterator();
        while (iteratorMap2.hasNext()) {
            System.out.println(iteratorMap2.next());
        }

        if (!countriesSet.contains("Испания")) {
            countriesSet.add("Испания");
            capitalMap.put("Испания", "Мадрид");
        }
        System.out.println("------------");
        LOGGER.info("Обновленное множество стран:");
        for (String country : countriesSet) {
            System.out.println(country);
        }
        System.out.println("------------");
        System.out.println("Обновленное отображение столиц:");
        for (String country : capitalMap.keySet()) {
            System.out.println(country + " - " + capitalMap.get(country));
        }
    }
}
