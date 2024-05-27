public class Quadrato extends FormaGeometrica {
    private int lato;

    public Quadrato(int lato) {
        this.lato = lato;
    }

    public int getLato() {
        return lato;
    }

    public Quadrato setLato(int lato) {
        this.lato = lato;
        return this;
    }

    @Override
    public float calcoloArea() {
        return lato*lato;
    }
}