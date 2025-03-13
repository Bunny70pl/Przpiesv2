package com.example.przepisy;
public class Przepis {
    private String nazwaPrzepisu;
    private String skladniki;
    private String Kategoria;
    private int idObrazka;
    private int polubienia;

    public Przepis(String nazwaPrzepisu, String skladniki, String kategoria, int idObrazka, int polubienia) {
        this.nazwaPrzepisu = nazwaPrzepisu;
        this.skladniki = skladniki;
        Kategoria = kategoria;
        this.idObrazka = idObrazka;
        this.polubienia = polubienia;
    }

    public String getNazwaPrzepisu() {
        return nazwaPrzepisu;
    }

    public String getSkladniki() {
        return skladniki;
    }

    public String getKategoria() {
        return Kategoria;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public int getPolubienia() {
        return polubienia
                ;
    }

    public void setPolubienia() {
        polubienia++;
    }

    @Override
    public String toString() {
        return nazwaPrzepisu;
    }
}
