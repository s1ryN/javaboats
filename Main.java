public class Main {
    public static void main(String[] args) {
        // 1) Vytvoření obj. Lod a Plachetnice pomocí parametrizovaných konstruktorů
        Lod lod1 = new Lod("Noname", 0);
        Plachetnice plachetnice1 = new Plachetnice("Santa Maria", 0, false);
        lod1.informuj();
        System.out.println();
        plachetnice1.informuj();
        System.out.println();

        // 2) Vytvoření dalš. obj. pomocí bezparametrických konstruktorů a nastavení hodnot
        Lod lod2 = new Lod();
        lod2.setJmeno("Frank");
        lod2.setRychlostkmh(75);
        Plachetnice plachetnice2 = new Plachetnice();
        plachetnice2.setJmeno("Lucia");
        plachetnice2.setRychlostkmh(50);
        plachetnice2.setNapnuteplachty(true);
        lod2.informuj();
        System.out.println();
        plachetnice2.informuj();
        System.out.println();

        // 3) Převod rychlosti na uzly pro loď, která se nejmenuje "Santa Maria" (tj. Lucia)
        plachetnice2.uzly();
        System.out.println();

        // Oddělovač
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("100 motorovych lodi:");
        System.out.println();

        // 6) Vytvoření 100 motorových lodí a výpis
        MotorovaLod[] motor = new MotorovaLod[100];
        for (int i = 0; i < motor.length; i++) {
            motor[i] = new MotorovaLod();
            motor[i].informuj();
            System.out.println();
        }

        System.out.println("-----------------------------------");
    }
}
