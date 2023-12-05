package Obiect;

import org.testng.annotations.Test;

import javax.lang.model.util.AbstractAnnotationValueVisitor8;

public class Obiect_test {
    @Test
    public void testMethod() {
        Fabrica_masini MercedesG63AMG = new Fabrica_masini("Mercedes", "G 63 AMG",
                "benzina", "manuala", 2023, 150.00);
        MercedesG63AMG.prezentare_produs();
        MercedesG63AMG.calculImpozit();
        System.out.println("===================");
        Fabrica_masini DaewooMatiz = new Fabrica_masini("Daewoo", "Matiz",
                "benzina", "automata", 2007, 120.00);
        DaewooMatiz.prezentare_produs();
        DaewooMatiz.calculImpozit();
        System.out.println("===================");

        Fabrica_masini AudiR8 = new Fabrica_masini("Audi", "R8", "motorina", "automata",
                2016, 150.00, 99000);
        AudiR8.prezentare_produs();
        AudiR8.calculImpozit();
        System.out.println("===================");


        }
}
