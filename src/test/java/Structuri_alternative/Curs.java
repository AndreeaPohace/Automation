package Structuri_alternative;

import org.testng.annotations.Test;

public class Curs {
    //structurile pot sa fie de 2 feluri: alternative si repetitive;
    // structurile alternative: if, then, else,switch, case;

    @Test
    public void test_metod() {
        // verificnrmaimare(10);
        //verificnrmaimare(4);
        //verificnrpar(10);
        //verificnrpar(0);
        //verificnrpar(-1);
        //verificnrpar(4);
        persoana_majora(18);
        persoana_majora(17);
        persoana_majora(19);

    }

    //verificam daca un numar este mai mare decat 5
   public void verificnrmaimare(Integer nr) {
        if (nr > 5) {
            System.out.println("Numarul " + nr + " este mai mare decat 5");
        } else {
            System.out.println("Numarul " + nr + " este mai mic decat 5");
        }
    }

    //verific daca un numar este par si pozitiv
    public void verificnrpar(Integer nr) {
        //daca vreau catul=/ (div)
        //daca vreau restul=%(mod)
        if (nr > 0) {
            if (nr % 2 == 0) {
                System.out.println(("Numarul " + nr + " este par si pozitiv"));
            } else {
                System.out.println(("Numarul " + nr + " este impar si pozitiv"));
            }
        }

        else if (nr<0) {
            if (nr % 2 == 0) {
                System.out.println(("Numarul " +nr+ " este par si negativ"));
            }
            else {
                System.out.println(("Numarul " +nr+ "  este impar si negativ"));
            }
        }
            else{
                System.out.println(("Numarul " +nr+ " este 0"));
            }

    }
    // verificam daca o persona este majora
    public void persoana_majora(Integer varsta){
        if(varsta>=18){
            System.out.println("Persoana este majora");
        }
        else {
            System.out.println("Persoana nu este majora");
        }
    }
}
