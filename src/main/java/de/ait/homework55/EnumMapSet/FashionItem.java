package de.ait.homework55.EnumMapSet;

public class FashionItem {
    private String name;
    private double price;
    private FashionCategory category;
    private Season season;

    public FashionItem(String name, double price, FashionCategory category, Season season) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.season = season;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public FashionCategory getCategory() {
        return category;
    }

    public void setCategory(FashionCategory category) {
        this.category = category;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}