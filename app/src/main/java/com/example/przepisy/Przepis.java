package com.example.przepisy;

import java.util.ArrayList;

public class Przepis {
    private String nazwaPrzepisu;
    private String skladniki;
    private String Kategoria;
    private int idObrazka;
    private float polubienia;
    private ArrayList<Float> wszystkieOceny = new ArrayList<Float>();

    public Przepis(String nazwaPrzepisu, String skladniki, String kategoria, int idObrazka, int polubienia) {
        this.nazwaPrzepisu = nazwaPrzepisu;
        this.skladniki = skladniki;
        Kategoria = kategoria;
        this.idObrazka = idObrazka;
        this.polubienia = polubienia;
        wszystkieOceny.add(this.polubienia);
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

    public float getPolubienia() {
        float srednia = 0;
        for (int i=0;i<wszystkieOceny.size();i++){
            srednia += wszystkieOceny.get(i);
        }
        srednia/= wszystkieOceny.size();
        return srednia;
    }

    public void setPolubienia(float polubienie) {
        wszystkieOceny.add(polubienie);
    }

    @Override
    public String toString() {
        return nazwaPrzepisu;
    }
}
