package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CsaladiArSzamitas extends CsaladiSzamitasiStrategia {

    private static final Logger logger = LogManager.getLogger(CsaladiArSzamitas.class);
    @Override
    public String Szamitas(int telekMerete, int emeletekSzama)
    {
        // logger.debug("Telek mérete CsaladiArSzamitas: " + telekMerete);
        // logger.debug("Emeletek száma CsaladiArSzamitas: " + emeletekSzama);
		
        if (telekMerete < 0){
            telekMerete = 0;
        }
        if (emeletekSzama < 0){
            emeletekSzama = 0;
        }
        return "Irányár: " + (telekMerete * 150796 + emeletekSzama * 132765) + " Ft";
    }
}
