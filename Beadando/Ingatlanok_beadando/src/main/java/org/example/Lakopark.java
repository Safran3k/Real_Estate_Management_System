package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Lakopark{
    private static final Logger logger = LogManager.getLogger(Main.class);
    public Ingatlan[] LakoparkEpites(Ingatlan ingatlan, String szin, int db) throws CloneNotSupportedException {
        logger.debug("Lakópark épületeinek színe: " + szin);
        Ingatlan[] park = new Ingatlan[db];
        for (int i = 0; i < db; i++) {
            try {
                Ingatlan clone = (Ingatlan) ingatlan.clone();
                clone.setEpuletSzine(szin);
                park[i] = clone;
            } catch (CloneNotSupportedException e) {
                System.out.println("Clone not supported!");
            }
        }
        return park;
    }
}
