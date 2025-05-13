package cz.czechitas.ukol3;

public class Disk {
    public Long kapacita;
    private Long vyuziteMisto;

    public Long getKapacita() {
        return kapacita;
    }

    public void setKapacita(Long kapacita) {
        if (kapacita <= 0) {
            System.err.println("Kapacita musí být větší než nula.");
            return;
        }
        this.kapacita = kapacita;
    }

    public Long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(Long vyuziteMisto) {
        if (vyuziteMisto > kapacita) {
            System.err.println("Váš disk je přeplněný, využité místo nesmí být větší než kapacita disku.");
            return;
        } else if (vyuziteMisto == kapacita) {
            System.err.println("Kapacita vašeho disku je zcela naplněna.");
            return;
        } else if (vyuziteMisto < 0) {
            System.err.println("Využité místo nesmí být menší než 0");
            return;
        }
        this.vyuziteMisto = vyuziteMisto;
    }

    public String toString() {
        return "Kapacita počítače je " + kapacita + " bajtů a využitého místa je " + vyuziteMisto + " bajtů";
    }

}
