package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PanelAlapteruletSzamitas extends PanelSzamitasiStrategia{
    private static final Logger logger = LogManager.getLogger(PanelAlapteruletSzamitas.class);
    @Override
    public String Szamitas(int szobakSzama, int erkelyMerete)
    {
        // logger.debug("Szobák száma PanelAlapteruletSzamitas: " + szobakSzama);
        // logger.debug("Erkély mérete PanelAlapteruletSzamitas: " + erkelyMerete);

        if (szobakSzama <= 0){
            throw new RuntimeException("A szobák száma csak 0-tól nagyobb érték lehet");
        }

        if (erkelyMerete < 0){
            erkelyMerete = 0;
        }

        return "Alapterület: " + (szobakSzama * 20 + erkelyMerete) + " nm";
    }
}
