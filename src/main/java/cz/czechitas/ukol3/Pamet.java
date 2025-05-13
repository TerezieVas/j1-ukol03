package cz.czechitas.ukol3;

public class Pamet {
    public Long kapacita;

    public Long getKapacita() {
        return kapacita;
    }

    public void setKapacita(Long kapacita) {
        this.kapacita = kapacita;
    }

    public String toString() {
        return "Kapacita paměti je " + kapacita + " bajtů";
    }

}
