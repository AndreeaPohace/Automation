package oopConcepte;

public class FabricaMasina {

    //oop=programare orientata obiect
    //4 principii= mostenire; incapsulare; absatractizare;polimorfism
    //mostenire=conceptul prin care clasa parinte este mostenita de clasa copil;
    //in Java o clasa poate sa mosteneasca doar o singura clasa;
    //clasa copil trebuie sa apeleze constructorul din clasa parinte
    //copilul are vizibilitate asupra metodelo/variabillelor daca sunt publice/protected
    //ca sa apelam constructorul parinte in clasa copil o sa folosim "super"
    //polimorfism=conceptul prin care o metoda poate suferi multiplicari la nivel de continut sau structura;
    //polimorfismul este de 2 feluri; dinamic(override) sau static(overload);
    //polimorfismul dinamic=intr-o ierarhie de clase extinse prin mostenire o metoda poate avea implementari diferite;
    //polimorfismul static=mai multe metode poate avea acelasi nume cu conditia sa se diferentieze
    //              prin numar sau tip de paramaetrii;
    // nu se aplica polimorfismul la metodele cu return sau void
    //Accescontrol:public, private,protected, default;
    //public=ofera vizibilitate pentru oricine si oriunde(in tot proiectul);
    //private=ofera vizibilitate doar in interiorul clasei;

    private String marca;
    private String model;
    private String sasiu;
    private String culoare;
    private Integer motorizare;

    public FabricaMasina(String marca, String model, String sasiu, String culoare, Integer motorizare) {
        this.marca = marca;
        this.model = model;
        this.sasiu = sasiu;
        this.culoare = culoare;
        this.motorizare = motorizare;
    }


    public void prezentareMasina(){
        System.out.println("Marca masinii este "+marca);
        System.out.println("Modelul masinii este "+model);
        System.out.println("Sasiul masinii este "+sasiu);
        System.out.println("Culoarea masinii este "+culoare);
        System.out.println("Motorizarea masinii este "+motorizare);
    }

   public String getMarca(){
        return marca;
//    //polimorfism dinamic
////    public void AngajariFirma(){
////        System.out.println("Fabrica nu mai face angajari");
//    }
    }
    public String getModel(){
        return model;
    }
    public void setModel(){
        this.model=model;
    }
    public String getSasiu(){
        return sasiu;
    }
    public void setSasiu(){
        this.sasiu=sasiu;
    }
    public String getCuloare(){
        return culoare;
    }
    public void setCuloare(){
        this.culoare=culoare;
    }
    public Integer getMotorizare(){
        return motorizare;
    }
    public void setMotorizare(){
        this.motorizare=motorizare;
    }

}
