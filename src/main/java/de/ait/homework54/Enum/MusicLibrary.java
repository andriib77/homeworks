package de.ait.homework54.Enum;

public class MusicLibrary {

    private String nameOfAlbum;
    private String interpreter;
    MusicGenre genre;

    public MusicLibrary(String nameOfAlbum, String interpreter, MusicGenre genre) {
        this.nameOfAlbum = nameOfAlbum;
        this.interpreter = interpreter;
        this.genre = genre;
    }

    public String getNameOfAlbum() {
        return nameOfAlbum;
    }

    public void setNameOfAlbum(String nameOfAlbum) {
        this.nameOfAlbum = nameOfAlbum;
    }

    public String getInterpreter() {
        return interpreter;
    }

    public void setInterpreter(String interpreter) {
        this.interpreter = interpreter;
    }

    public MusicGenre getGenre() {
        return genre;
    }

    public void setGenre(MusicGenre genre) {
        this.genre = genre;
    }
    public void getAlbumsByGenre(MusicGenre genre){

    }
}
