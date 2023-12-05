package oopConcepte;

import java.util.List;

public class FabricaBMW extends FabricaMasina{

    private Integer pretStandard;
    private Integer pretFinal;
    private List<String> dotariExterioare;
    private List<String> dotariInterioare;


    public FabricaBMW( String model, String sasiu,
                        String culoare, Integer motorizare, List<String> dotariExterioare,
                       List<String> dotariInterioare) {
        super("BMW", model, sasiu, culoare, motorizare);
        this.dotariExterioare= dotariExterioare;
        this.dotariInterioare=dotariInterioare;
    }

    public void prezentareBMW(){
        prezentareMasina();
        definirePretmodel();
        calculDotariExterioare();
        calculDotariInterioare();
        System.out.println("Pretul standard este"+pretStandard);
        System.out.println("Pretul final este"+pretFinal);


//        pretFinal=pretStandard+calculDotariInterioare()+calculDotariExterioare();
//        if(dotariExterioare==null && dotariInterioare== null){
//            System.out.println("Pretul standard este"+ pretStandard);
//        }
//        else {
//            System.out.println("Pretul standard este"+ pretStandard);
//            System.out.println("Pretul final este"+pretFinal);
//        }
//        else if (dotariInterioare==null){
//
//        } else {
//            System.out.println("Pretul cu dotari interioare si exterioare este"+pretStandard+dotariInterioare+dotariExterioare)
//            ;
//
//        }

    }
    public void definirePretmodel(){
        switch (getModel()){
            case "X5":
                pretStandard=55000;
                break;
            case "X7":
                pretStandard=98000;
                break;
            default:
                System.out.println("Nu mai avem pe stoc acest model");
        }
    }
    public Integer calculDotariExterioare(){
        Integer pretDotari=0;
        for(Integer i = 0; i < dotariExterioare.size(); i++){
            switch (dotariExterioare.get(i)){
                case "jante":
                    pretDotari=pretDotari + 500;
                    break;
                case "trapa":
                    pretDotari=pretDotari + 1000;
                    break;
                case "faruri":
                    pretDotari=pretDotari + 1550;
                    break;
                case "oglinzi electrice":
                    pretDotari=pretDotari + 700;
                    break;

            }
        }
        return pretDotari;
    }

    public Integer calculDotariInterioare() {
        Integer pretDotari = 0;
        for (Integer i = 0; i < dotariInterioare.size(); i++) {
            switch (dotariInterioare.get(i)) {
                case "incalzire scaune":
                    pretDotari = pretDotari + 500;
                    break;
                case "clima bizonica":
                    pretDotari = pretDotari + 1000;
                    break;
                case "GPS":
                    pretDotari = pretDotari + 1550;
                    break;
                case "tetiere cu masaj":
                    pretDotari = pretDotari + 700;
                    break;
            }
        }
    }

        public Integer getPretStandard(){
            return pretStandard;
        }

        public Integer getPretFinal() {
            return pretFinal;
        }

        public List<String> getDotariExterioare () {
            return dotariExterioare;
        }

        public List<String> getDotariInterioare () {
            return dotariInterioare;
        }


        public void setDotariExterioare (List < String > dotariExterioare) {
            this.dotariExterioare = dotariExterioare;
        }

        public void setDotariInterioare (List < String > dotariInterioare) {
            this.dotariInterioare = dotariInterioare;


        }
    }

