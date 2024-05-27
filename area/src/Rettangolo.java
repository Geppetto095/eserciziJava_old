public class Rettangolo extends FormaGeometrica {
    private int base;
    private int altezza;

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public int getBase() {
        return base;
    }

    public Rettangolo setBase(int base) {
        this.base = base;
        return this;
    }

    public int getAltezza() {
        return altezza;
    }

    public Rettangolo setAltezza(int altezza) {
        this.altezza = altezza;
        return this;
    }

    @Override
    public float calcoloArea() {
        return base*altezza;
    }
}
