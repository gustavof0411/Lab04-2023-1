package list;

public class PilhaMetodo extends ListaArray implements Pilha {

    @Override
    public boolean isEmpty() {
        if (indiceAposFim == 1) {
            return true;
        }
        return false;
    }

    @Override
    public void push(int item) {
        insereFim(item);
    }

    @Override
    public int pop() {
        int retorno = buscaIndice(indiceAposFim - 1);
        removeFim();
        return retorno;

    }

}
