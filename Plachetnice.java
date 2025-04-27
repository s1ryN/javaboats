class Plachetnice extends Lod {
    private boolean napnuteplachty;

    public Plachetnice() {
        super();
        this.napnuteplachty = false;
    }

    public Plachetnice(String jmeno, int rychlostkmh, boolean napnuteplachty) {
        super(jmeno, rychlostkmh);
        this.napnuteplachty = napnuteplachty;
    }

    public void setNapnuteplachty(boolean napnuteplachty) {
        this.napnuteplachty = napnuteplachty;
    }

    public boolean getNapnuteplachty() {
        return napnuteplachty;
    }

    @Override
    public void informuj() {
        System.out.println("Plachetnice se jmenuje " + getJmeno()
            + " a jede rychlosti " + getRychlostkmh()
            + " km/h a napnute plachty jsou " + napnuteplachty + ".");
    }
}