package de.ait.homework54.Enum;

public enum MusicGenre {
    POP("Popular music"), ROCK("Rock music"), JAZZ("Jazz music"), CLASSICAL("Classic music"), ELECTRONIC("Trance music"), HIPHOP("music");

    private final String description;

    MusicGenre (String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}
