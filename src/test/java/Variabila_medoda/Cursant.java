package Variabila_medoda;

import org.testng.annotations.Test;

public class Cursant {

    //Primul meu curs
    //Clasa= Un sablon specific unui obiect care contine variabile si metode
    //Identificam o clasa dupa cuvantul class
    //O clasa trebuie sa aiba un nume
    //Continutul unnei clase se regaseste dupa acolade
    //Intr-un fisier Java trebuie sa avem mai multe clase
    //Variabila=Proprietate a unei clase
    //Variabilele sunt de doua feluri: global sau local
    //Variabila globala=este vizibila peste tot in clasa
    //Variabila locala=este vizibila doar in locul declarat
    //Variabila globala=public tip de data numar variabila
    //Variabila poate sau nu sa primeasca o valoare
    //Metoda=actiunea unei clase
    //Metodele sunt de 2 feluri: void si return
    //Void=metoda care executa si arata actiunea
    //Return=metoda care returneaza actiunea
    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areStudii;

    @Test
  public void metodatest(){
        afisaredate();
        calculmedie("Semestru 1 ", 8.5,6.5);
        calculmedie("Semestru 2 ",10.00,8.5);
        calculpret(10);
        calculpret(20);
    }
    public void afisaredate (){
        nume="Pohace";
        prenume="Andreea";
        varsta=39;
        adresa="Bucuresti, sector1, bloc5";
        inaltime=1.67;
        greutate=63.0f;
        sex='F';
        areStudii=true;

        System.out.println("Numele cursantului este "+nume+' '+prenume);
        System.out.println("Varsta cursantului este "+ varsta);
        System.out.println("Adresa cursantului este "+adresa);
        System.out.println("Inaltimea cursantului este "+inaltime);
        System.out.println("Greutatea cursantului este "+greutate);
        System.out.println("Sexul cursantului este "+sex);
        System.out.println("Are cursantul studii? "+areStudii);

    }
    public void calculmedie(String tipnote, Double nota1, Double nota2){
        Double rezultat=(nota1+nota2)/2;
        System.out.println("Media examenelor la "+tipnote+ "este "+rezultat);
    }
    public void calculpret(Integer discount){
        Integer pret=1250;
        Integer reducere=discount;
       System.out.println("Pretul initial este "+pret);
       Integer difereta=(pret*reducere)/100;
       Integer pretfinal=pret-difereta;
       System.out.println("Pretul final dupa aplicarea reducerii este "+pretfinal);

        }




    }

