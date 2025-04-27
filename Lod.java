class Lod {
    private int rychlostkmh;
    private String jmeno;

    public Lod() {
        this.jmeno = "Noname";
        this.rychlostkmh = 0;
    }

    public Lod(String jmeno, int rychlostkmh) {
        this.jmeno = jmeno;
        this.rychlostkmh = rychlostkmh;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setRychlostkmh(int rychlostkmh) {
        this.rychlostkmh = rychlostkmh;
    }

    public int getRychlostkmh() {
        return rychlostkmh;
    }

    public void informuj() {
        System.out.println("Lod se jmenuje " + jmeno + " a jede rychlosti " + rychlostkmh + " km/h.");
    }

    public void uzly() {
        double uzly = rychlostkmh * 0.54;
        System.out.println("Rychlost lode " + jmeno + " je " + uzly + " uzlu.");
    }
}
