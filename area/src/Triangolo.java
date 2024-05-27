public class Triangolo extends FormaGeometrica {
    private int altezza;
    private int base;

    public Triangolo(int altezza, int base) {
        this.altezza = altezza;
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public Triangolo setAltezza(int altezza) {
        this.altezza = altezza;
        return this;
    }

    public int getBase() {
        return base;
    }

    public Triangolo setBase(int base) {
        this.base = base;
        return this;
    }



    @Override
    public float calcoloArea() {
        return (base*altezza)/2;
    }
}
