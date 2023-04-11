package cz.vse.adventura.logika;

public class Vec {
    private String nazev;
    private String popis;

    private boolean movalbe;

    public Vec(String nazev, String popis, boolean movalbe) {
        this.nazev = nazev;
        this.popis = popis;
        this.movalbe = movalbe;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public boolean isMovalbe() {
        return movalbe;
    }

    public void setMovalbe(boolean movalbe) {
        this.movalbe = movalbe;
    }
}
