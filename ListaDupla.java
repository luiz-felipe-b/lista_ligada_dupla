public class ListaDupla {
    private NoDuplo primeiro;
    private NoDuplo ultimo;
    //construtor é o padrão
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int info) {
        NoDuplo novo = new NoDuplo(info);
        if (estaVazia()) {
            ultimo = novo;
        }
        else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }
    public void insereFim(int info){
        NoDuplo novo = new NoDuplo(info);
        if(estaVazia()){
            primeiro = novo;
        }
        else{
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
    public int removeFim () {
        int temp = ultimo.getInfo();
        ultimo = ultimo.getAnterior();
        if (primeiro == ultimo) {//esvaziar a lista
            primeiro = null;
        }
        else {
            ultimo.setProximo(null);
        }
        return temp;
    }
    @Override
    public String toString() {
        String s = "";
        if (estaVazia()) {
            s += "lista vazia";
        } else {
            NoDuplo aux = primeiro;
            s += "//<- ";
            while (aux != null) {
                s += aux + " = ";
                aux = aux.getProximo();
            }
            s += "->//";
        }
        return s;
    }
    public int removeInicio(){
        int temp = primeiro.getInfo();
        if(primeiro == ultimo){ //tem um só
            primeiro = null;
            ultimo = null;
        }
        else{
            primeiro.getProximo().setAnterior(null);
            primeiro = primeiro.getProximo();
        }
        return temp;
    }

    public int insereElementoPosicao(int info, int pos) {
        if (pos < 1) {
            return -1;
        } else {
            if (pos == 1 || estaVazia()) {
                insereInicio(info);
            } else {
                NoDuplo noAlvo = primeiro;
                int count = 1;
                while (noAlvo != ultimo && count < pos) {
                    noAlvo = noAlvo.getProximo();
                    count++;
                }
                if (noAlvo == ultimo) {
                    insereFim(info);
                } else {
                    NoDuplo novoNo = new NoDuplo(info);
                    novoNo.setAnterior(noAlvo.getAnterior());
                    novoNo.setProximo(noAlvo);
                    novoNo.getProximo().setAnterior(novoNo);
                    novoNo.getAnterior().setProximo(novoNo);
                }
            }
            return info;
        }
    }
}
