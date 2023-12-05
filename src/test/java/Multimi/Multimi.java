package Multimi;

import org.testng.annotations.Test;

import javax.swing.*;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Multimi {
    @Test
    public void metoda_test() {
        // nume_cursanti_array();
        //nume_cursanti_lista();
        // obiecte_hasmap();
        retete_gatit("Tiramisu");

    }

    //o multime rep o colectie de elemente care toate sunt de acelasi tip
    //afisam numele cursantilor
    public void nume_cursanti_array() {
        String[] nume_cursanti = new String[4];
        nume_cursanti[0] = "Adi";
        nume_cursanti[1] = "Andreea";
        nume_cursanti[2] = "Anca";
        nume_cursanti[3] = "Claudia";
        for (Integer index = 0; index < nume_cursanti.length; index++) {
            System.out.println(nume_cursanti[index]);
        }
    }

    //lista cursanti
    public void nume_cursanti_lista() {
        List<String> nume_cursanti = new ArrayList<>();
        nume_cursanti.add("Cosmin");
        nume_cursanti.add("Leticia");
        nume_cursanti.add("Diana");
        nume_cursanti.add("Oana");
        for (Integer index = 0; index < nume_cursanti.size(); index++) {
            System.out.println(nume_cursanti.get(index));
        }
    }

    //hashmap=key-value=multime mai complexa

    public void obiecte_hasmap() {
        HashMap<String, String> Obiecte = new HashMap<>();
        Obiecte.put("electronic", "telefon");
        Obiecte.put("aliment", "supa");
        Obiecte.put("masina", "Ford");
        for (String key : Obiecte.keySet()) {
            System.out.println("Cheia este " + key);
            System.out.println("Valoarea este " + Obiecte.get(key));

        }
    }
    //reprenzentam niste tari cu orase

    public void tari_orase() {
        HashMap<String, List<String>> Test_data = new HashMap<>();
        List<String> orase_Romania = new ArrayList<>();
        orase_Romania.add("Bucuresti");
        orase_Romania.add("Piatra Neamt");
        orase_Romania.add("Brasov");
        orase_Romania.add("Sibiu");
        List<String> orase_Italia = new ArrayList<>();
        orase_Italia.add("Roma");
        orase_Italia.add("Napoli");
        orase_Italia.add("Florenta");
        orase_Italia.add("Venetia");
        List<String> orase_Spania = new ArrayList<>();
        orase_Spania.add("Barcelona");
        orase_Spania.add("Madrid");
        orase_Spania.add("Sevilia");
        orase_Spania.add("Vigo");
        Test_data.put("Romania", orase_Romania);
        Test_data.put("Italia", orase_Italia);
        Test_data.put("Spania", orase_Spania);
        for (String key : Test_data.keySet()) {
            System.out.println("Tara este" + key);
            System.out.println("Orasele sunt urmatoarele: ");

        }
    }

    //
    public void retete_gatit(String reteta) {
        HashMap<String, List<String>> Carte_bucate = new HashMap<>();
        List<String> Ciorba_Radauteana = new ArrayList<>();
        Ciorba_Radauteana.add("Morcovi 2 buc");
        Ciorba_Radauteana.add("Apa");
        Ciorba_Radauteana.add("Telina 1 buc");
        Ciorba_Radauteana.add("Pastarnac");
        Ciorba_Radauteana.add("Sare dupa gust");

        List<String> Tiramisu = new ArrayList<>();
        Tiramisu.add("Cafea");
        Tiramisu.add("Piscoturi");
        Tiramisu.add("Marscapone");
        Tiramisu.add("Cacao");
        Tiramisu.add("Oua");
        Tiramisu.add("Zahar");

        Carte_bucate.put("Ciorba radauteana", Ciorba_Radauteana);
        Carte_bucate.put("Tiramisu", Tiramisu);
        for (String key : Carte_bucate.keySet()) {
            if (key.equals(reteta)) {
                System.out.println("Reteta este pentru" + Carte_bucate);
                System.out.println("Ingredientele pentru reteta sunt urmatoarele: " + Carte_bucate.get(key));
            }

        }
    }
}