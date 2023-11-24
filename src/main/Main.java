import list.BancoOphidian;

public class Main {
    public static void main(String[] args) {
        System.out.println("<Teste - Binário> \n");
        BinaryCounter binary = new BinaryCounter();
        binary.sequencialBinary(8);

        System.out.println("\n-----------------------------------\n");

        System.out.println("<Teste - Fila do Banco Ophidian com 15 pessoas>\n");
        BancoOphidian bancoOphidian = new BancoOphidian();
        for (int i = 1; i <= 15; i++) { // adiciona 15 pessoas na fila
            bancoOphidian.enqueue(i);
        }
        bancoOphidian.saguao();
        System.out.println("Todos os clientes foram atendidos.");
    }
}