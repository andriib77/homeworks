package de.ait.homework55.EnumMapSet;

public enum Season {
    SPRING("Расцвет природы"), SUMMER("Тепло"), AUTUMN("Листопад"), WINTER("Холодно");

    private final String description;

    Season (String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
