package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");
        Pocitac mujPocitac = new Pocitac();
        System.out.println(mujPocitac.toString());

        Procesor mujProcesor = new Procesor();
        mujProcesor.setRychlost(2_400_000_000L);
        mujProcesor.setVyrobce("Intel");
        System.out.println(mujProcesor.toString());
        mujPocitac.zapniSe(); //vyhazuje chybu - není RAM

        Disk mujDisk = new Disk();
        mujDisk.setKapacita(1_024_203_640_320L);
        mujDisk.setVyuziteMisto(967_225_284_096L);
        System.out.println(mujDisk.toString()); //při spuštění stále hlási chybu - není RAM, jinak vypisuje

        Disk druhyDisk = new Disk();
        druhyDisk.setKapacita(1_024_203_640_320L);
        druhyDisk.setVyuziteMisto(267_225_284_096L);

        Pamet pametMehoPc = new Pamet();
        pametMehoPc.setKapacita(20_900_000_000L);
        System.out.println(pametMehoPc.toString());

        mujPocitac.setRam(pametMehoPc);
        mujPocitac.setCpu(mujProcesor);
        mujPocitac.setPevnyDisk(mujDisk);
        mujPocitac.setDruhyDisk(druhyDisk);
        mujPocitac.zapniSe();//počítač se standardně zapnul
        mujPocitac.zapniSe();//vyskočila chybová hláška - dvakrát zapnuto

        System.out.println(mujPocitac.toString());

        mujPocitac.vytvorSouborOVelikosti(200_000_000_000L);
        System.out.println(mujPocitac.toString());

        mujPocitac.vymazSouborOVelikosti(500L);
        System.out.println(mujPocitac.toString());
        mujPocitac.vypniSe();
        mujPocitac.vypniSe();

    }

}
