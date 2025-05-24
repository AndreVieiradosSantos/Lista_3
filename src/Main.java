import PDV.Cliente;
import PDV.Pedido;
import PDV.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha;
        Scanner opcao = new Scanner(System.in);
        do {
            System.out.println("===============Menu===============");
            System.out.println(" 1 - para comprar produtos");
            System.out.println(" 2 - para cadastrar cliente");
            System.out.println(" 3 - para fazer pedido");
            System.out.println(" 4 - para sair do Programa");

            escolha = opcao.nextInt();

                switch (escolha) {
                    case 1:
                        Produto produto = new Produto();
                        produto.comprar();
                        produto.exibirDetalhes();
                        break;
                    case 2:
                        Cliente cliente = new Cliente();
                        cliente.fazerPedido();
                        cliente.exibirDados();
                        break;
                    case 3:
                        Pedido pedido = new Pedido();
                        pedido.calcularTotal();
                        pedido.exibirPedido();
                        break;
                    default:
                        System.out.println("Saindo do programa...");
                        opcao.close();
                        break;
                }

        }while (escolha>0&&escolha<4);
    }
}