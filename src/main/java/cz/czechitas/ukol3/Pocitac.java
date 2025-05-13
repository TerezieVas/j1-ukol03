package cz.czechitas.ukol3;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;
    private Disk druhyDisk;

    public Disk getDruhyDisk() {
        return druhyDisk;
    }

    public void setDruhyDisk(Disk druhyDisk) {
        this.druhyDisk = druhyDisk;
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (ram == null) {
            System.err.println("Počítač nemá nainstalováno RAM");
        } else if (cpu == null) {
            System.err.println("Počítač nemá nainstalovaný procesor");
        } else if (pevnyDisk == null) {
            System.err.println("Počítač nemá nainstalovaný pevný disk");
        } else if (jeZapnuty) {
            System.err.println("Počítač nelze zapnout víckrát.");
        } else {
            jeZapnuty = true;
            System.out.println("Počítač se zapnul");
        }
    }

    public void vypniSe() {
       if(jeZapnuty) {
           jeZapnuty = false;
           System.out.println("Počítač se vypnul.");
       }
    }

    public String toString() {
        return "Informace k disku: " + pevnyDisk + ", pamět: " + ram + ", procesor: " + cpu;
    }
    public void vytvorSouborOVelikosti (long velikost) {
       long aktualniVyuziteMisto = pevnyDisk.getVyuziteMisto();
       long pozadovaneVyuziteMisto = aktualniVyuziteMisto + velikost;
       pevnyDisk.setVyuziteMisto(pozadovaneVyuziteMisto);
    }

    public void vymazSouborOVelikosti(long velikost) {
        long aktualniVyuziteMisto = pevnyDisk.getVyuziteMisto();
        long pozadovaneVyuziteMisto = aktualniVyuziteMisto - velikost;
        pevnyDisk.setVyuziteMisto(pozadovaneVyuziteMisto);
    }
}
