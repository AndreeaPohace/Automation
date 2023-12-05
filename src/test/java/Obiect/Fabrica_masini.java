package Obiect;

public class Fabrica_masini {

    //constructor=are ca rol sa initializeze atributele unei clase
    //un cosntructor este public
    //un construtor poate sa fie de 2 feluri: cu parametrii si fara parametrii
    //fara parametrii se numeste si default(daca nu am definit noi un constructor avem unul default)
    //intr-o clasa putem avea n constructori diferentiati prin numar sau tip de parametri;
    //obiect=instanta unei clase
    //un obiect reprezinta o structura pe care o are clasa si din care poate accesa variabilele si metodele respective;
    //dintr-o clasa putem initializa n obiecte;
    //in momentul in care initializam un obiect apelam constructorul din clasa;

    //acces control=public, private,protected, default;
    //public=ofera vizibilitate pt oricine si oriunde in tot proiectul;
    //private=ofera vizibilitate doar in interiorul clasei;
    //ca sa accesam valoarea unei variabile private ne folosim de conceptul get;
    //ca sa modificam valoarea unei variabile private ne folosim de conceptul set;

    public String marca;
    public String model;
    public String combustibil;
    public String transmisie;
    public Integer an;
    public Double motorizare;
    public Integer pret;

    public Fabrica_masini(String marca, String model, String combustibil,
                          String transmisie, Integer an, Double motorizare, Integer pret) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public Fabrica_masini(String marca, String model, String combustibil,
                          String transmisie, Integer an, Double motorizare) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
    }

    public void  prezentare_produs() {
        System.out.println("Marca masinii este" + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Tipul de combustibil folosit este " + combustibil);
        System.out.println("Transmisia masinii este " + transmisie);
        System.out.println("Anul de fabricatie este" + an);
        System.out.println("Motorul are capacitatea de " + motorizare);
        if (pret != null) {
            System.out.println("Pretul produsului este" + pret);
        }
    }
        public void calculImpozit () {
            if (an >= 2020 && combustibil.equals("Electric")) {
                System.out.println("Clientul trebuie sa plateasca 5 ron");
            } else {
                System.out.println("Clientul trebuie sa plateasca in functie de anul masinii");
            }
        }
    }
