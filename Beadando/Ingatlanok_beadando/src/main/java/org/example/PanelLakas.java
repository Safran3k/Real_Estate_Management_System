package org.example;

public class PanelLakas extends Ingatlan implements Cloneable{
    private int ErkelyMeret;
    private PanelSzamitasiStrategia PanelAlapteruletSzamitasiStrategia;
    private PanelSzamitasiStrategia PanelArSzamitasiStrategia;

    public PanelLakas(int szobakSzama, int erkelyMeret, PanelSzamitasiStrategia a, PanelSzamitasiStrategia t) {
        super(szobakSzama);
        ErkelyMeret = erkelyMeret;
        PanelAlapteruletSzamitasiStrategia = a;
        PanelArSzamitasiStrategia = t;
    }

    @Override
    public String AlapteruletSzamitas(int szobak, int erkely) {
        return PanelAlapteruletSzamitasiStrategia.Szamitas(szobak, erkely);
    }

    @Override
    public String ArSzamitas(int szobak, int erkely) {
        return PanelArSzamitasiStrategia.Szamitas(szobak, erkely);
    }

    @Override
    public String toString() {
        return super.toString() +
                (ErkelyMeret > 0 ? "erkélyes, " : "") +
                AlapteruletSzamitas(super.getSzobakSzama(), ErkelyMeret) + "-es lakás, " +
                ArSzamitas(super.getSzobakSzama(), ErkelyMeret);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
