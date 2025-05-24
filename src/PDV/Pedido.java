package PDV;

import java.util.Scanner;

public class Pedido {
    private String cliente;
    private String produtos;
    private float valorTotal;
    Scanner pedido = new Scanner(System.in);
    public void calcularTotal(){
        System.out.println("Nome do cliente:");
        cliente = pedido.nextLine();
        System.out.println("Produtos:");
        produtos = pedido.nextLine();
        System.out.println("Valor Total:");
        valorTotal = pedido.nextFloat();

    }
    public void exibirPedido(){
        System.out.println("Nome do cliente:"+cliente);
        System.out.println("Produtos:"+produtos);
        System.out.println("Valor Total:"+valorTotal);
    }
}
