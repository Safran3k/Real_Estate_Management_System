package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CsaladiAlapteruletSzamitas extends CsaladiSzamitasiStrategia{
    private static final Logger logger = LogManager.getLogger(CsaladiAlapteruletSzamitas.class);
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

        return "Alapterület: " + (telekMerete + (emeletekSzama * 32)) + " nm";
    }
}
