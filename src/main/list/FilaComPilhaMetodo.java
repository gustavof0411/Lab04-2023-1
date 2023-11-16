package list;

public class FilaComPilhaMetodo extends PilhaMetodo implements FilaComPilha {

    PilhaMetodo pilha1 = new PilhaMetodo(); // adicionados
    PilhaMetodo pilha2 = new PilhaMetodo(); // último elemento removido

    @Override
    public void enqueue(int item) {
        pilha1.push(item);

    }

    @Override
    public int dequeue() {
        if (pilha1.indiceAposFim - 1 != 0) {
            pilha2.pop();
            pilha2.push(pilha1.buscaIndice(0));
            pilha1.removeInicio();
            return pilha2.buscaIndice(0);
        } else {
            pilha2.push(pilha1.buscaIndice(0));
            pilha1.removeInicio();
            return pilha2.buscaIndice(0);
        }

    }

    @Override
    public boolean isEmpty() {
        if (indiceAposFim == 1) {
            return false;
        }
        return true;
    }

    @Override
    public int size() {
        return this.pilha1.indiceAposFim - 1;
    }
}
