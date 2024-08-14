package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CsaladiHaz extends Ingatlan implements Cloneable {
    private int telekMeret;
    private int emeletekSzama;
    private CsaladiSzamitasiStrategia csaladiAlapteruletSzamitasiStrategia;
    private CsaladiSzamitasiStrategia csaladiArSzamitasiStrategia;

    private static final Logger logger = LogManager.getLogger(CsaladiHaz.class);

    public CsaladiHaz(int szobakSzama, int telekMeret, int emeletekSzama, CsaladiSzamitasiStrategia a,
                      CsaladiSzamitasiStrategia t) {
        super(szobakSzama);
        this.telekMeret = telekMeret;
        this.emeletekSzama = emeletekSzama;
        this.csaladiAlapteruletSzamitasiStrategia = t;
        this.csaladiArSzamitasiStrategia = a;
        logger.debug("(CsaladiHaz kostruktor)\nEmeletek száma: " + emeletekSzama);
        logger.debug("Telek mérete: " + telekMeret);
    }

    @Override
    public String AlapteruletSzamitas(int telekMerete, int emeletekSzama) {
        return csaladiAlapteruletSzamitasiStrategia.Szamitas(telekMerete, emeletekSzama);
    }

    @Override
    public String ArSzamitas(int telekMerete, int emeletekSzama) {
        return csaladiArSzamitasiStrategia.Szamitas(telekMerete, emeletekSzama);
    }

    @Override
    public String toString() {
        return super.toString() +
                (emeletekSzama > 0 ? emeletekSzama + " emeletes, " : "") +
                AlapteruletSzamitas(telekMeret, emeletekSzama) + "-es családi ház, " +
                csaladiArSzamitasiStrategia.Szamitas(telekMeret, emeletekSzama);
    }

    @Override
    protected void Kozmuvesites() {
        System.out.println("A telek közművesítést igényel.");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
