package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        System.out.println("----------------------------------------");
        Ingatlan cs1 =
                new CsaladiHaz(4, 300, 0,
                        new CsaladiArSzamitas(),
                        new CsaladiAlapteruletSzamitas());
        cs1.ArSzamitas(300, 0);
        cs1.AlapteruletSzamitas(300, 0);

        //logger.debug(cs1);

        Ingatlan cs2 =
                new CsaladiHaz(2, 150, 1,
                        new CsaladiArSzamitas(),
                        new CsaladiAlapteruletSzamitas());
        cs1.ArSzamitas(150, 1);
        cs1.AlapteruletSzamitas(150, 1);
        cs1.Kivitelezes();

        //logger.debug(cs2);

        System.out.println("----------------------------------------");

        Ingatlan pl1 =
                new PanelLakas(3, 2,
                        new PanelArSzamitas(),
                        new PanelAlapteruletSzamitas()
                );
        pl1.ArSzamitas(3, 2);
        pl1.AlapteruletSzamitas(3, 2);

        Ingatlan pl2 =
                new PanelLakas(5, 0,
                        new PanelArSzamitas(),
                        new PanelAlapteruletSzamitas()
                );
        pl2.ArSzamitas(5, 0);
        pl2.AlapteruletSzamitas(5, 0);
        pl1.Kivitelezes();

        System.out.println("----------------------------------------");
        System.out.println(cs1);
        System.out.println(cs2);
        System.out.println("----------------------------------------");
        //System.out.println(pl1);
        //System.out.println(pl2);

        System.out.println("----------------------------------------");

        Lakopark lp = new Lakopark();
        Ingatlan[] lPark;
        try {
            lPark = lp.LakoparkEpites(pl1, "Szürke", 10);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        for (Ingatlan item : lPark) {
            System.out.println(item + " (Festés színe: " + item.getEpuletSzine() + ")");
        }
        System.out.println("----------------------------------------");
        Ingatlan[] csPark;
        try {
            csPark = lp.LakoparkEpites(cs2, "Barna", 10);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        for (Ingatlan item : csPark) {
            System.out.println(item + " (Festés színe: " + item.getEpuletSzine() + ")");
        }
    }
}