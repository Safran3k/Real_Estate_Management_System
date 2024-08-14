package org.example;

import java.lang.Cloneable;

public abstract class Ingatlan implements Cloneable {

    private int szobakSzama;
    private String epuletSzine;

    public Ingatlan(int szobakSzama) {
        this.szobakSzama = szobakSzama;
    }

    public int getSzobakSzama() {
        return szobakSzama;
    }

    public void setSzobakSzama(int szobakSzama) {
        this.szobakSzama = szobakSzama;
    }

    public String getEpuletSzine() {
        return epuletSzine;
    }

    public void setEpuletSzine(String epuletSzine) {
        this.epuletSzine = epuletSzine;
    }

    // Template
    public void Kivitelezes() {
        Tervezes();
        Kozmuvesites();
        Alapozas();
        FalakFelhuzasa();
        TetoszerkezetElkeszites();
    }

    private void Tervezes() {
        System.out.println("Ingatlan tervének elkészítése.");
    }

    protected void Kozmuvesites() {}

    private void Alapozas() {
        System.out.println("Az ingatlan alapozása.");
    }

    private void FalakFelhuzasa() {
        System.out.println("Az ingatlan falainak felépítése.");
    }

    private void TetoszerkezetElkeszites() {
        System.out.println("Az ingatlan tetőszerkezetének kialakítása");
    }

    @Override
    public String toString() {
        return "Eladó " + szobakSzama + " szobás, ";
    }

    // Prototype tervezési minta (shallow copy)
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    // Strategy
    public abstract String ArSzamitas(int a, int b);

    public abstract String AlapteruletSzamitas(int a, int b);
}
