package PDV;

import java.util.Scanner;

public class Produto {
    private String nomeProduto;
    private float preco;
    private int quant_estoque;
    Scanner produto = new Scanner(System.in);
    public void comprar(){
        System.out.println("Digite o nome do produto:");
        nomeProduto = produto.nextLine();
        System.out.println("Preço:");
        preco = produto.nextFloat();
        System.out.println("Quantidade em estoque:");
        quant_estoque = produto.nextInt();
    }

       public void exibirDetalhes(){
           System.out.println("Nome do produto:"+nomeProduto);
           System.out.println("Preço:"+preco);
           System.out.println("Quantidade em estoque:"+quant_estoque);
    }
}
