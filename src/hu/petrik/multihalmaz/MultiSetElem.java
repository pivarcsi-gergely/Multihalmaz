package hu.petrik.multihalmaz;

public class MultiSetElem <T> {

    private int elemSzam;
    private T elem;

    public MultiSetElem(int elemSzam, T elem) {
        this.elemSzam = elemSzam;
        this.elem = elem;
    }

    public int getElemSzam() {
        return elemSzam;
    }

    public void setElemSzam(int elemSzam) {
        this.elemSzam = elemSzam;
    }

    public T getElem() {
        return elem;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }

    @Override
    public String toString() {
        return String.format("%s ,%d db", elem, elemSzam);
    }
}
