package oopConcepte;

import java.util.List;

public class FabricaAudi extends FabricaMasina{

    public Integer pretStandard;
    public Integer pretFinal;
    public List<String> dotariExterioare;


    public FabricaAudi( String model, String sasiu,
                       String culoare, Integer motorizare, List<String> dotariExterioare) {
        super("Audi", model, sasiu, culoare, motorizare);
        this.dotariExterioare= dotariExterioare;
    }

    public void prezentareAudi(){
        prezentareMasina();
        definirePretmodel();
        calculpretFinal();
        if(dotariExterioare==null){
            System.out.println("Pretul standard este"+pretStandard);
        }
        else{
            System.out.println("Pretul standard este "+ pretStandard);
            System.out.println("Pretul final este "+pretFinal);
        }

    }
    public void definirePretmodel(){
        switch (getModel()){
            case "A5":
                pretStandard=40000;
                break;
            case "A7":
                pretStandard=80000;
                break;
            default:
                System.out.println("Nu mai avem pe stoc acest model");
        }
    }
    public void calculpretFinal(){
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
        pretFinal=pretStandard+pretDotari;
    }
}
