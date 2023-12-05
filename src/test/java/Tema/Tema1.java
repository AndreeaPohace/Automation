package Tema;

import org.testng.annotations.Test;

import javax.swing.plaf.PanelUI;

public class Tema1 {
    public Integer varsta;
    public String nume;
    public String prenume;
    public String zi;
    public String ora;
    public String rezultatul_corect;
    public Double numar1;
    public Double numar2;
    public Double numar3;
    public Integer a;
    public Integer b;

    @Test
    public void metodatest() {
        varsta_mea();
        nume_prenume();
        afisare_data();
        afisare_ora();
        rezultat_ecuatie();
        afisare_rezultatul_corect();
        suma3numere();
        suma2numere();

    }

    //public static void main(String args[]) {
    //System.out.println("Hello world!");
    // }
    public void varsta_mea() {
        varsta = 39;
        {
            System.out.println("Varsta mea este " + varsta + "Poti pleca acasa dupa ce iti verifici munca!");
        }
    }

    public void nume_prenume() {
        nume = "Pohace";
        prenume = "Andreea";
        {
            System.out.println("Numele meu este " + nume);
            System.out.println("Prenumele meu este " + prenume);
        }
    }

    public void afisare_data() {
        zi = "14.12.23";
        {
            System.out.println("Ziua de azi este " + zi);
        }
    }

    public void afisare_ora() {
        ora = "18:30 PM";
        {
            System.out.println("Ora este " + ora);
        }

    }
    public void rezultat_ecuatie(){
        Integer paranteza_rotunda=3*4;
        Integer paranteza_dreapta=2+paranteza_rotunda-3;
        Integer rezultat_final=paranteza_dreapta/2;{
            System.out.println("Rezultatul ecuatiei este "+rezultat_final);

        }

    }

    public void afisare_rezultatul_corect(){
        rezultatul_corect="{rezultatul}";{
            System.out.println("Rezultatul corect este "+rezultatul_corect);
        }
    }

    public void suma3numere(){
        numar1= 10.00;
        numar2=15.35;
        numar3=0.75;
        Double suma=numar1+numar2+numar3;{
            System.out.println("Suma celor 3 numere este" +suma);
        }
    }
    public void suma2numere(){
        a= 13;
        b= 27;
        Integer suma2=a+b;{
            System.out.println("Stiu ca am calculat bine, "+"suma celor 2 numere este "+suma2);
        }
    }
}