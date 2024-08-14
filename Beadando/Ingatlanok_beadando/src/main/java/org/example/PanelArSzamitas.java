package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PanelArSzamitas extends PanelSzamitasiStrategia{
    private static final Logger logger = LogManager.getLogger(PanelArSzamitas.class);
    @Override
    public String Szamitas(int szobakSzama, int erkelyMerete)
    {
        // logger.debug("Szobák száma PanelArSzamitas: " + szobakSzama);
        // logger.debug("Erkély mérete PanelArSzamitas: " + erkelyMerete);
		
        return "Irányár: " + (szobakSzama * 11000000 + erkelyMerete * 100000) + " Ft";
    }
}
