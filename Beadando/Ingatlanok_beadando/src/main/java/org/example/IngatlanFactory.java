package org.example;

public class IngatlanFactory {
    public Ingatlan CreateIngatlan(String tipus){
        Ingatlan ingatlan = null;

        if (tipus.equals("Panel")){
            ingatlan = new PanelLakas(
                    3,
                    2,
                    new PanelArSzamitas(),
                    new PanelAlapteruletSzamitas()
            );
        }else if(tipus.equals("Családiház")){
            ingatlan = new CsaladiHaz(
                    4,
                    300,
                    0,
                    new CsaladiArSzamitas(),
                    new CsaladiAlapteruletSzamitas());
        }

        return ingatlan;
    }

}
