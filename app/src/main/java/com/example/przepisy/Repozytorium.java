package com.example.przepisy;

import java.util.ArrayList;

public class Repozytorium {
    public static ArrayList<Przepis> przepisy;
    public static void wygenrujPrzepisu(){
        przepisy = new ArrayList<Przepis>();
        przepisy.add(new Przepis(
                "Mufinki",
                "Mleko, maka, cukier, kakao, wszystko wymieszac",
                "Ciastka",
                R.drawable.mafinki,
                0
                )
        );
        przepisy.add(new Przepis(
                        "Sernik",
                        "Ser, maslo, ziemnaki, kokos",
                        "Ciasto",
                        R.drawable.sernik,
                        2
                )
        );
        przepisy.add(new Przepis(
                        "Makowiec",
                        "Mak, drodze, maka, mleko, cukier",
                        "Ciasto",
                        R.drawable.makowiec,
                        1
                )
        );
        przepisy.add(new Przepis(
                        "Kakao",
                        "kakao, mleko",
                        "Napoje",
                        R.drawable.kakao,
                        0
                )
        );

    }
    public static ArrayList<Przepis> wypiszPrzepisy(String kategoira) {
        wygenrujPrzepisu();
        ArrayList<Przepis> przepisyWyswietlenie = new ArrayList<>();
        for (int i = 0; i < przepisy.size(); i++) {
            if (przepisy.get(i).getKategoria().equals(kategoira)) {
                przepisyWyswietlenie.add(przepisy.get(i));
            }
        }
        return przepisyWyswietlenie;
    }
    public static ArrayList<Przepis> wypiszPrzepisyNazwa(String nazwa) {
        wygenrujPrzepisu();
        ArrayList<Przepis> przepisyWyswietlenie = new ArrayList<>();
        for (int i = 0; i < przepisy.size(); i++) {
            if (przepisy.get(i).getNazwaPrzepisu().equals(nazwa)) {
                przepisyWyswietlenie.add(przepisy.get(i));
            }
        }
        return przepisyWyswietlenie;
    }
}
