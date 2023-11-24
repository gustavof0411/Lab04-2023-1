package list;

import java.util.Random;

public class BancoOphidian extends FilaMetodo {

    public void saguao() {
        while (!isEmpty()) {
            mostrarFila();
            if (verificaPapelada()) {
                dequeue();
            } else {
                enqueue(dequeue());
            }
        }
    }

    public double tempo() {
        Random random = new Random();
        return random.nextDouble() * 100;
    }

    public boolean verificaPapelada() {
        if (tempo() <= 25) {
            return false;
        }
        return true;
    }

    public void mostrarFila() {
        String fila = "";
        BancoOphidian filaSalva = new BancoOphidian();
        while(!isEmpty()) {
            int elemento = dequeue();
            filaSalva.enqueue(elemento);
            fila = fila + elemento + " | ";
        }
        System.out.println(fila);
        if (filaSalva != null) {
        while (!filaSalva.isEmpty()) {
            enqueue(filaSalva.dequeue());
        }
    }
    }
}
