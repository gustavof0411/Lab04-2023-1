package list;

public class FilaMetodo extends ListaArray implements Fila {

    @Override
    public void enqueue(int item) {
        insereFim(item);
    }

    @Override
    public int dequeue() {
        int retorno = buscaIndice(0);
        removeInicio();
        return retorno;
    }

    @Override
    public boolean isEmpty() {
        if (indiceAposFim == 1) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return this.indiceAposFim - 1;
    }

}
