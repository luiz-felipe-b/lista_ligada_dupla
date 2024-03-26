public class NoDuplo {
    private int info;
    private NoDuplo anterior;
    private NoDuplo proximo;

    public NoDuplo (int info) {
        setInfo(info);
        setAnterior(null);
        setProximo(null);
    }
    public int getInfo() {
        return info;
    }
    public NoDuplo getAnterior() {
        return anterior;
    }
    public NoDuplo getProximo() {
        return proximo;
    }
    public void setInfo (int info) {
        this.info = info;
    }
    public void setAnterior (NoDuplo anterior) {
        this.anterior = anterior;
    }
    public void setProximo (NoDuplo proximo) {
        this.proximo = proximo;
    }
    @Override
    public String toString () {
        return "|" + info + "|";
    }
}