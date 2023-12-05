package Variabila_medoda;
import org.testng.annotations.Test;

public class Student {
    @Test
    public void metoda_test() {
        //get_marire();
        System.out.println(get_marire(30));
        //calcul_medie(8.5, 9.5, "semestru 1");
    }

    //metoda care calculeaza salariul unei persoane dupa o marire
    public Integer get_marire(Integer procent) {
        Integer salariu = 15000;
        Integer marire = (salariu * procent) / 100;
        Integer salariu_final = salariu + marire;
        return salariu_final;
    }

}

