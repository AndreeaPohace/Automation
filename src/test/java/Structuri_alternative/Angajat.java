package Structuri_alternative;

import org.testng.annotations.Test;

public class Angajat {
    @Test
    public void metoda_test(){
        zilele_saptamanii(1);
    }

    //reprezentam zilele saptamanii
    public void zilele_saptamanii(Integer zi){
        switch (zi){
            case 1:
                System.out.println("Astazi este ziua de Duminica");
                break;
            case 2:
                System.out.println("Astazi este ziua de Luni");
                break;
            case 3:
                System.out.println("Astazi este ziua de Marti");
                break;
            case 4:
                System.out.println("Astazi este ziua de Miercuri");
                break;

        }

    }
}
