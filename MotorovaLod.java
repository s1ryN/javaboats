class MotorovaLod extends Lod {
    private static int pocet = 0;
    private final int cislolode;

    public MotorovaLod() {
        super();
        this.cislolode = ++pocet;
    }

    public MotorovaLod(String jmeno, int rychlostkmh, int cislolode) {
        super(jmeno, rychlostkmh);
        this.cislolode = cislolode;
    }

    @Override
    public void informuj() {
        System.out.println("Motorová lod číslo " + cislolode
            + " se jmenuje " + getJmeno()
            + " a jede rychlosti " + getRychlostkmh() + " km/h.");
    }
}