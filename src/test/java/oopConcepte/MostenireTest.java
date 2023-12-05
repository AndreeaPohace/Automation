package oopConcepte;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MostenireTest {

    @Test
    public void MetodaTest(){
        List<String> dotariAudiA5= new ArrayList<>();
        dotariAudiA5.add("jante");
        dotariAudiA5.add("trapa");
        dotariAudiA5.add("faruri");

        List<String> dotariAudiA7= new ArrayList<>();
        dotariAudiA7.add("jante");
        dotariAudiA7.add("trapa");
        dotariAudiA7.add("faruri");
        dotariAudiA7.add("oglinzi electrice");

        List<String> dotariBMWX5exterior= new ArrayList<>();
        dotariBMWX5exterior.add("jante");
        dotariBMWX5exterior.add("trapa");
        dotariBMWX5exterior.add("faruri");

        List<String> dotariBMWX5interior= new ArrayList<>();
        dotariBMWX5interior.add("incalzire scaune");
        dotariBMWX5interior.add("GPS");
        dotariBMWX5interior.add("clima bizonala");

        List<String> dotariBMWX7exterior= new ArrayList<>();
        dotariBMWX7exterior.add("jante");
        dotariBMWX7exterior.add("trapa");
        dotariBMWX7exterior.add("faruri");
        dotariBMWX7exterior.add("oglinzi electrice");

        List<String> dotariBMWX7interior= new ArrayList<>();
        dotariBMWX7interior.add("incalzire scaune");
        dotariBMWX7interior.add("clima bizonala");
        dotariBMWX7interior.add("GPS");
        dotariBMWX7interior.add("tetiere cu masaj");


        FabricaAudi AudiA5=new FabricaAudi("A5","sedan ",
                "negru ",200,dotariAudiA5);
        AudiA5.prezentareAudi();

//        AudiA5.motorizare=150;
//        AudiA5.marca="Dacia";
//        AudiA5.prezentareAudi();
//        FabricaAudi AudiA7=new FabricaAudi("A7","geep", "rosu",150,dotariAudiA7);
//        AudiA7.prezentareAudi();




//        FabricaBMW BMWX5=new FabricaBMW("X5","SUV ",
//                "negru ",200,dotariBMWX5exterior,dotariBMWX5interior);
//        BMWX5.prezentareBMW();
//
//        FabricaBMW BMWX7=new FabricaBMW("X7","limuzina","rosu",
//                200,dotariBMWX7exterior,dotariBMWX7interior);
//        BMWX7.prezentareBMW();

    }
}
