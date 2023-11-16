import list.FilaMetodo;
import list.PilhaMetodo;
import list.FilaComPilhaMetodo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testes com Pilha");
        PilhaMetodo pilha = new PilhaMetodo();
        System.out.println("A pilha está vazia? " + pilha.isEmpty());
        System.out.println("Push: 7");
        pilha.push(7);
        System.out.println("Push: 8");
        pilha.push(8);
        System.out.println("Pop: 8");
        pilha.pop();
        System.out.println("O último elemento é 7: " + pilha.buscaIndice(0));
        System.out.println("A pilha está vazia? " + pilha.isEmpty());

        System.out.println("----------------------");

        System.out.println("Testes com Fila");
        FilaMetodo fila = new FilaMetodo();
        System.out.println("A fila está vazia? " + fila.isEmpty());
        System.out.println("Enqueue: 10");
        fila.enqueue(10);
        System.out.println("Enqueue: 14");
        fila.enqueue(14);
        System.out.println("Dequeue: " + fila.dequeue());
        System.out.println("O tamanho da pilha agora é: " + fila.size());
        System.out.println("A fila está vazia? " + fila.isEmpty());

        System.out.println("----------------------");

        System.out.println("Testes com Fila usando Pilhas");
        FilaComPilhaMetodo filaComPilha = new FilaComPilhaMetodo();
        System.out.println("A fila está vazia? " + filaComPilha.isEmpty());
        System.out.println("Enqueue: 10");
        filaComPilha.enqueue(10);
        System.out.println("Enqueue: 14");
        filaComPilha.enqueue(14);
        System.out.println("Dequeue: " + filaComPilha.dequeue());
        System.out.println("O tamanho da pilha agora é: " + filaComPilha.size());
        System.out.println("A fila está vazia? " + filaComPilha.isEmpty());





    }
}
